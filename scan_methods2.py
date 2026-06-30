import zipfile, re

apk = zipfile.ZipFile(r"C:\Users\15853\Downloads\wechat.apk")

# Search for classes containing specific keywords AND their methods
keywords = [
    ("selectcontact", ["selectcontactui", "selectcontactstate", "multiselectcontact"]),
    ("forward", ["forwardmsg", "baseforward", "forwardpreview", "convboxtransmit"]),
    ("retransmit", ["retransmit", "msgretransmit"]),
    ("record", ["recorddetail", "chatrecord"]),
]

found = {}
for dex_name in sorted([n for n in apk.namelist() if n.endswith(".dex")]):
    data = apk.read(dex_name)
    text = data.decode("latin-1", errors="ignore")
    
    for category, queries in keywords:
        for q in queries:
            # Look for class references with method calls: Lclass;->method(
            pattern = re.compile(r"L(com/tencent/mm/[a-zA-Z0-9/_.$]*" + re.escape(q) + r"[a-zA-Z0-9/_.$]*);->([a-zA-Z0-9_]+)\(", re.IGNORECASE)
            for m in pattern.finditer(text):
                cls_name = m.group(1).replace("/", ".")
                meth = m.group(2)
                if cls_name.count("$") < 5 and "R$" not in cls_name and "BuildConfig" not in cls_name:
                    if cls_name not in found:
                        found[cls_name] = set()
                    found[cls_name].add(meth)

with open(r"C:\Users\15853\Documents\WeiPlus\forward_methods2.txt", "w", encoding="utf-8") as f:
    for cls_name in sorted(found.keys()):
        methods = sorted(found[cls_name])
        f.write(f"{cls_name} ({len(methods)} methods)\n")
        for m in methods[:15]:
            f.write(f"  {m}\n")
        f.write("\n")

print(f"Found {len(found)} classes with {sum(len(v) for v in found.values())} total methods")
