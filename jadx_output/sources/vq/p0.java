package vq;

/* loaded from: classes9.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.smiley.g0 f439208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439209e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.tencent.mm.smiley.g0 g0Var, com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f439208d = g0Var;
        this.f439209e = emojiDebugUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.vfs.w6.f("/sdcard/temp/emojiRes/system_emoji_new/");
        com.tencent.mm.vfs.w6.u("/sdcard/temp/emojiRes/system_emoji_new/");
        java.util.LinkedList emojiDataItems = this.f439208d.f193256d;
        kotlin.jvm.internal.o.f(emojiDataItems, "emojiDataItems");
        java.util.Iterator it = emojiDataItems.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI = this.f439209e;
            if (!hasNext) {
                pm0.v.X(new vq.o0(emojiDebugUI));
                return jz5.f0.f302826a;
            }
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.smiley.c cVar = (com.tencent.mm.smiley.c) next;
            boolean z17 = com.tencent.mm.smiley.q0.f193336d;
            com.tencent.mm.smiley.q0 q0Var = com.tencent.mm.smiley.l0.f193307a;
            java.lang.String str = q0Var.f193343c ? com.tencent.mm.smiley.q0.f193339g : com.tencent.mm.smiley.q0.f193338f;
            com.tencent.mm.smiley.g1 g1Var = cVar.f193224e;
            int i19 = g1Var.f193259d;
            com.tencent.mm.smiley.k0 k0Var = q0Var.f193342b;
            byte[] N = com.tencent.mm.vfs.w6.N(str, i19 + (k0Var != null ? k0Var.f193304d : 0), g1Var.f193260e);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.LinkedList codePoints = cVar.f193223d;
            kotlin.jvm.internal.o.f(codePoints, "codePoints");
            int i27 = 0;
            for (java.lang.Object obj : codePoints) {
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.Integer num = (java.lang.Integer) obj;
                kotlin.jvm.internal.o.d(num);
                sb6.append(java.lang.Integer.toHexString(num.intValue()));
                if (i27 < codePoints.size() - 1) {
                    sb6.append("-");
                }
                i27 = i28;
            }
            com.tencent.mm.vfs.w6.R("/sdcard/temp/emojiRes/system_emoji_new/" + ((java.lang.Object) sb6) + ".png", N);
            com.tencent.mars.xlog.Log.i(emojiDebugUI.d, "emoji item: startPos=" + cVar.f193224e.f193259d + ", size=" + cVar.f193224e.f193260e);
            i17 = i18;
        }
    }
}
