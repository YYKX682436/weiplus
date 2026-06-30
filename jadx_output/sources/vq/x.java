package vq;

/* loaded from: classes4.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439232d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f439232d = emojiDebugUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        f21.g K = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).K();
        com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI = this.f439232d;
        if (K == null) {
            dp.a.makeText((android.content.Context) emojiDebugUI, (java.lang.CharSequence) "eggList null!", 0).show();
        } else {
            int Di = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Di(37, 5);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("version: " + K.f258899e + " -- " + Di + '\n');
            java.util.LinkedList eggList = K.f258898d;
            kotlin.jvm.internal.o.f(eggList, "eggList");
            sb6.append("list:\n ".concat(kz5.n0.g0(eggList, "\n", null, null, 0, null, vq.w.f439230d, 30, null)));
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(emojiDebugUI);
            u1Var.g(sb6.toString());
            u1Var.a(true);
            u1Var.q(false);
        }
        return jz5.f0.f302826a;
    }
}
