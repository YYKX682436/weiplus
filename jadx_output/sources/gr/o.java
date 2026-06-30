package gr;

/* loaded from: classes12.dex */
public final class o {
    public o(kotlin.jvm.internal.i iVar) {
    }

    public final java.util.List a(java.util.List emojiGroupInfoList) {
        kotlin.jvm.internal.o.g(emojiGroupInfoList, "emojiGroupInfoList");
        java.util.LinkedList<gr.p> linkedList = new java.util.LinkedList();
        java.util.HashMap hashMap = new java.util.HashMap();
        s25.b Bi = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi();
        java.util.Iterator it = emojiGroupInfoList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo = (com.tencent.mm.storage.emotion.EmojiGroupInfo) it.next();
            java.lang.String str = emojiGroupInfo.field_ipKey;
            com.tencent.mm.storage.emotion.EmojiIPSetInfo k17 = Bi.k(str);
            if (k17 == null) {
                gr.p pVar = new gr.p(null);
                pVar.f274675b.add(emojiGroupInfo);
                linkedList.add(pVar);
            } else {
                gr.p pVar2 = (gr.p) hashMap.get(str);
                if (pVar2 == null) {
                    pVar2 = new gr.p(k17);
                    kotlin.jvm.internal.o.d(str);
                    hashMap.put(str, pVar2);
                    linkedList.add(pVar2);
                }
                pVar2.f274675b.add(emojiGroupInfo);
            }
        }
        for (gr.p pVar3 : linkedList) {
            if (pVar3.f274675b.size() == 1) {
                pVar3.f274674a = null;
            }
        }
        return linkedList;
    }
}
