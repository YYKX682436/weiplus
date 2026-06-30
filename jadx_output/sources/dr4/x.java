package dr4;

/* loaded from: classes14.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.c0 f242759d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(dr4.c0 c0Var) {
        super(0);
        this.f242759d = c0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dr4.c0 c0Var = this.f242759d;
        dr4.q1 q1Var = c0Var.f242602e;
        if (q1Var != null) {
            if (c0Var.f242615r == 2) {
                if (q1Var.C == null) {
                    q1Var.C = new cr4.c();
                }
                q1Var.G = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.VoipRenderProcExternalTexture", "render YT face-beauty algorithm");
            } else {
                ar4.c cVar = ar4.c.f13401a;
                if (ar4.c.f13402b != null) {
                    if (q1Var.C == null) {
                        q1Var.C = new cr4.c();
                    }
                    q1Var.G = false;
                } else {
                    q1Var.G = false;
                }
            }
            q1Var.f347996e = 2;
        }
        return jz5.f0.f302826a;
    }
}
