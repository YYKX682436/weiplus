package vq;

/* loaded from: classes9.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439212d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f439212d = emojiDebugUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.smiley.g.b().getClass();
        boolean z17 = com.tencent.mm.smiley.q0.f193336d;
        com.tencent.mm.smiley.q0 q0Var = com.tencent.mm.smiley.l0.f193307a;
        com.tencent.mm.smiley.g0 g0Var = q0Var.f193341a;
        com.tencent.mm.smiley.g.b().getClass();
        com.tencent.mm.smiley.k0 k0Var = q0Var.f193342b;
        int i17 = k0Var != null ? k0Var.f193304d : 0;
        com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI = this.f439212d;
        com.tencent.mars.xlog.Log.i(emojiDebugUI.d, "emojiRes: item size " + g0Var.f193256d.size() + ", headerOffset = " + i17);
        pm0.v.K(null, new vq.p0(g0Var, emojiDebugUI));
        return jz5.f0.f302826a;
    }
}
