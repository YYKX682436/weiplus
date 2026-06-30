package ir;

/* loaded from: classes12.dex */
public final class e1 extends ir.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f293832d;

    /* renamed from: e, reason: collision with root package name */
    public int f293833e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(ir.u groupInfo, boolean z17) {
        super(groupInfo);
        kotlin.jvm.internal.o.g(groupInfo, "groupInfo");
        if (z17) {
            return;
        }
        java.util.LinkedList linkedList = groupInfo.f293905c;
        com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo = (com.tencent.mm.storage.emotion.EmojiGroupInfo) linkedList.getFirst();
        boolean z18 = false;
        if (emojiGroupInfo != null) {
            r45.v75 c17 = gr.t.g().c(emojiGroupInfo.field_productID);
            if (c17 != null) {
                ir.i0 i0Var = this.f293812b;
                i0Var.f293867c = c17;
                if (((com.tencent.mm.feature.emoji.api.m6) i95.n0.c(com.tencent.mm.feature.emoji.api.m6.class)) != null) {
                    y12.p.f458877a.b(c17.f387964d, false, new ir.h0(i0Var));
                }
                this.f293812b.f293868d = com.tencent.mm.storage.d5.f193836a.a(c17.f387964d).a();
            }
            this.f293813c.add(this.f293812b);
        }
        int i17 = 0;
        for (java.lang.Object obj : linkedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo2 = (com.tencent.mm.storage.emotion.EmojiGroupInfo) obj;
            java.lang.String str = groupInfo.f293906d;
            if (!((str == null || str.length() == 0) ? true : z18) && kotlin.jvm.internal.o.b(groupInfo.f293906d, emojiGroupInfo2.field_productID)) {
                this.f293833e = this.f293813c.size();
            }
            java.util.ArrayList<com.tencent.mm.storage.emotion.EmojiInfo> f17 = gr.t.g().f(emojiGroupInfo2.field_productID);
            for (com.tencent.mm.storage.emotion.EmojiInfo emojiInfo : f17) {
                java.util.LinkedList linkedList2 = this.f293813c;
                kotlin.jvm.internal.o.d(emojiInfo);
                linkedList2.add(new ir.g(emojiInfo, 2, null, 0, 12, null));
            }
            this.f293832d += f17.size();
            if (i17 < linkedList.size() - 1) {
                this.f293813c.add(new ir.g0());
            }
            i17 = i18;
            z18 = false;
        }
    }

    @Override // ir.k0
    public int a() {
        return this.f293832d;
    }
}
