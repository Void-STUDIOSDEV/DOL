program v3;

{remember: No semicolons on 'end' statements before an else statement}

var
input: Integer;
player_health: Integer;
enemy_health: Integer;
attack: Integer;
enemy_attack: Integer;
hit_chance: Integer;
upgrade_attack: Integer;
upgrade_odds: Integer;
odds: Integer;
enemy_odds: Integer;

begin
	Randomize;
	player_health := 50;
	enemy_health := 50;
	attack := 25;
	enemy_attack := 30;
	upgrade_attack := 3;

	writeln(LineEnding, 'Despair of Life');
	writeln('Open-Source from the start!');
	writeln('!!Despair of Life v2 is the mature version!!');
	writeln('V1: JAVA | V2: JAVA | V3: Free Pascal');
	writeln('Version 3.00.00Alpha');

	while True do
		begin
			hit_chance := Random(11);
			odds := Random(11);
			enemy_odds := Random(11);
			upgrade_odds := Random(5);
			
			
			if player_health = 0 then
				begin
					writeln(LineEnding, 'Well... You tried, that is what counts!');
					break
				end;
			
			
			if upgrade_odds = 3 then
				begin
					writeln(LineEnding, 'RANDOM UPGRADE!');
					attack := attack + upgrade_attack;
				end
			else
				begin
					writeln(LineEnding, 'YOU DID NOT WIN THE RANDOM UPGRADE!', LineEnding);
				end;
				
				
			writeln(LineEnding, 'OPTIONS: 1. HEAL [UNDER CONSTRUCTION] | 2. ATTACK');
			write('CHOICE: ');
			readln(input);

			if (input = 1) and (player_health > 0) then
				begin
					writeln('UNDER CONSTRUCTION.', LineEnding);
				end;
				
			if (input = 2) and (player_health > 0) then
				begin
					if hit_chance = odds then
						begin
							writeln(LineEnding, 'YOU HIT YOUR OPPONENT1');
							enemy_health := enemy_health - attack;
						end
					else
						begin
							writeln(LineEnding, 'YOU MISS!');
						end;
						
					if hit_chance = enemy_odds then
						begin
							writeln('THE ENEMY HITS YOU!');
							player_health := player_health - enemy_attack;
						end
					else
						begin
							writeln('THE ENEMY MISS!');
						end;
				end;
		end;
end.
