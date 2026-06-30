package vq;

/* loaded from: classes5.dex */
public final class o1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439204d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f439204d = emojiDebugUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        p05.v2 v2Var = (p05.v2) ((rh0.x) i95.n0.c(rh0.x.class));
        v2Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ConfigInfo:");
        java.util.Set entrySet = p05.v2.f350709i.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        sb6.append(kz5.n0.g0(entrySet, null, null, null, 0, null, p05.r2.f350673d, 31, null));
        sb6.append("\n\n");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Run Score:\nNeedRunScore: ");
        com.tencent.mm.sdk.platformtools.o4 Bi = v2Var.Bi();
        p05.p3 p3Var = p05.p3.f350639a;
        sb7.append(Bi.getBoolean("need_run_score", false));
        sb7.append("\nLocalRunScore: ");
        sb7.append(v2Var.Bi().getBoolean("local_run_score", true));
        sb7.append("\nremote CPU: ");
        sb7.append(v2Var.Bi().getFloat("cpu_score", 0.0f));
        sb7.append("\nremote GPU: ");
        sb7.append(v2Var.Bi().getFloat("gpu_score", 0.0f));
        sb7.append("\nlocal CPU: ");
        sb7.append(v2Var.Bi().getFloat("local_cpu_score", 0.0f));
        sb7.append("\nlocal GPU: ");
        sb7.append(v2Var.Bi().getFloat("lcoal_gpu_score", 0.0f));
        sb7.append('\n');
        sb6.append(sb7.toString());
        java.lang.String sb8 = sb6.toString();
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this.f439204d);
        u1Var.g(sb8);
        u1Var.a(true);
        u1Var.q(false);
        return jz5.f0.f302826a;
    }
}
