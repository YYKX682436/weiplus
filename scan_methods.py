import zipfile, re

apk = zipfile.ZipFile(r"C:\Users\15853\Downloads\wechat.apk")
target_classes = ["SelectContactUI", "MultiSelectContactView", "SelectContactState",
                  "BaseForwardUIC", "BaseForwardMsgPreviewUIC", "ForwardMsgPreviewUI",
                  "ConvBoxTransmitUI", "MsgRetransmit", "ChatFooter",
                  "RecordDetail", "ChattingImgView", "ChattingAppBrandView",
                  "SelectContactCustomCombineProxyUIC"]

found_methods = {}
for dex_name in sorted([n for n in apk.namelist() if n.endswith(".dex")])[:3]:
    data = apk.read(dex_name)
    text = data.decode("latin-1", errors="ignore")
    for cls in target_classes:
        pattern = r"L(com/tencent/mm/[a-zA-Z0-9/_.$]*" + cls + r"[a-zA-Z0-9/_.$]*);->([a-zA-Z0-9_]+)\("
        for m in re.finditer(pattern, text):
            full_cls = m.group(1).replace("/", ".")
            meth = m.group(2)
            if len(meth) > 1:
                if cls not in found_methods: found_methods[cls] = set()
                found_methods[cls].add(f"{full_cls} -> {meth}")

with open(r"C:\Users\15853\Documents\WeiPlus\forward_methods.txt", "w", encoding="utf-8") as f:
    for cls, methods in sorted(found_methods.items()):
        f.write(f"\n=== {cls} ===\n")
        for m in sorted(methods)[:30]:
            f.write(f"  {m}\n")
        f.write(f"  Total: {len(methods)} unique methods\n")

print("Done. Check forward_methods.txt")
