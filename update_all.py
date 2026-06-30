import re

# 1. Update FeatureConfig.kt
fc_path = r"C:\Users\15853\Documents\WeiPlus\app\src\main\java\com\muchen\weiplus\features\FeatureConfig.kt"
with open(fc_path, "r", encoding="utf-8") as f:
    fc = f.read()

# Add forwardLimit var
fc = re.sub(r'(var gameCheat = true)', r'\1\n    var forwardLimit = true', fc)

# Add load case
fc = re.sub(r'("game_cheat" -> gameCheat[^}]+)',
            r'\1\n                    "forward_limit" -> forwardLimit = v.equals("true", ignoreCase = true)', fc)

# Add save line
fc = re.sub(r'(game_cheat=\$gameCheat\\n")',
            r'\1 +\n                "forward_limit=$forwardLimit\\n"', fc)

with open(fc_path, "w", encoding="utf-8") as f:
    f.write(fc)
print("FeatureConfig updated")

# 2. Update ModuleEntry.kt 
me_path = r"C:\Users\15853\Documents\WeiPlus\app\src\main\java\com\muchen\weiplus\entry\ModuleEntry.kt"
with open(me_path, "r", encoding="utf-8") as f:
    me = f.read()

# Add import
me = re.sub(r'(import com\.muchen\.weiplus\.features\.GameCheatFeature)',
            r'\1\nimport com.muchen.weiplus.features.ForwardLimitFeature', me)

# Add registration
me = re.sub(r'(GameCheatFeature\(\)\.onEnable[^}]+})',
            r'\1\n\n        try { ForwardLimitFeature().onEnable(this, classLoader); log(Log.INFO, TAG, "ForwardLimitFeature OK") }\n        catch (e: Throwable) { log(Log.ERROR, TAG, "ForwardLimitFeature fail", e) }', me)

# Add UI switch
me = re.sub(r'(FeatureConfig\.gameCheat = it; FeatureConfig\.save\(\) \}\)\))',
            r"""\1

        panel.addView(switchRow(activity, d, "Remove Forward Limit", "Allow forward voice/card/emoji, remove 9-contact limit",
            FeatureConfig.forwardLimit
        ) { FeatureConfig.forwardLimit = it; FeatureConfig.save() })""", me)

with open(me_path, "w", encoding="utf-8") as f:
    f.write(me)
print("ModuleEntry updated")
print("DONE")
