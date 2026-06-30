package ws2;

/* loaded from: classes3.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws2.j2 f449030d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(ws2.j2 j2Var) {
        super(0);
        this.f449030d = j2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f449030d.f449062i);
        ws2.j2 j2Var = this.f449030d;
        synchronized (valueOf) {
            if (((mm2.h5) j2Var.f328963d.a(mm2.h5.class)).f329112g != null) {
                if (((com.tencent.mm.sdk.platformtools.b4) ((jz5.n) j2Var.f449063m).getValue()).e() && !j2Var.f449062i) {
                    ((com.tencent.mm.sdk.platformtools.b4) ((jz5.n) j2Var.f449063m).getValue()).c(1000L, 1000L);
                }
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                j2Var.f449061h.clear();
                ((com.tencent.mm.sdk.platformtools.b4) ((jz5.n) j2Var.f449063m).getValue()).d();
            }
        }
        return jz5.f0.f302826a;
    }
}
