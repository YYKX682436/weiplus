package gr;

/* loaded from: classes12.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final gr.o f274673c = new gr.o(null);

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.storage.emotion.EmojiIPSetInfo f274674a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f274675b = new java.util.LinkedList();

    public p(com.tencent.mm.storage.emotion.EmojiIPSetInfo emojiIPSetInfo) {
        this.f274674a = emojiIPSetInfo;
    }

    public static final void a(r45.u45 u45Var) {
        java.util.LinkedList linkedList;
        r45.wj0 wj0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateGroupIpInfo: ip:");
        java.lang.String str = null;
        sb6.append((u45Var == null || (wj0Var = u45Var.f387025d) == null) ? null : wj0Var.f389219g);
        sb6.append(", group:[");
        if (u45Var != null && (linkedList = u45Var.f387026e) != null) {
            str = kz5.n0.g0(linkedList, null, null, null, 0, null, null, 63, null);
        }
        sb6.append(str);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiIPSetGroupInfo", sb6.toString());
        if (u45Var == null) {
            return;
        }
        z85.g gVar = com.tencent.mm.storage.emotion.EmojiIPSetInfo.f193891v;
        r45.wj0 EmotionSetInfo = u45Var.f387025d;
        kotlin.jvm.internal.o.f(EmotionSetInfo, "EmotionSetInfo");
        com.tencent.mm.storage.emotion.EmojiIPSetInfo a17 = gVar.a(EmotionSetInfo);
        java.lang.String str2 = a17.field_key;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        com.tencent.mm.storage.n5.f().f195179q.z0(a17);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = u45Var.f387026e;
        if (linkedList3 != null) {
            java.util.Iterator it = linkedList3.iterator();
            while (it.hasNext()) {
                com.tencent.mm.storage.emotion.EmojiGroupInfo f17 = com.tencent.mm.storage.n5.f().b().f1((java.lang.String) it.next(), false);
                if (f17 != null) {
                    f17.field_ipKey = a17.field_key;
                    linkedList2.add(f17);
                }
            }
        }
        com.tencent.mm.storage.n5.f().b().P1(linkedList2);
    }
}
