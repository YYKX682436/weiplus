package ip1;

/* loaded from: classes8.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.vq0 f293595d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(bw5.vq0 vq0Var) {
        super(0);
        this.f293595d = vq0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = true;
        bw5.vq0 vq0Var = this.f293595d;
        bw5.xb0 xb0Var = vq0Var != null ? vq0Var.f34466f[1] ? vq0Var.f34464d : new bw5.xb0() : null;
        if (xb0Var != null) {
            ip1.q qVar = ip1.q.f293596a;
            int i17 = xb0Var.f35045e;
            if (i17 != 4 && i17 != 5 && i17 != 6 && i17 != 7) {
                z17 = false;
            }
            if (z17) {
                ip1.q.f293603h = vq0Var;
                gp1.p pVar = ip1.q.f293601f;
                if (pVar != null) {
                    java.lang.String title = xb0Var.getTitle();
                    kotlin.jvm.internal.o.f(title, "getTitle(...)");
                    java.lang.String str = xb0Var.f35053p[9] ? xb0Var.f35052o : "";
                    oh4.j jVar = ((oh4.b) pVar).f345463a;
                    jVar.getClass();
                    pm0.v.X(new oh4.i(title, jVar, str));
                }
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.AudioPanelTaskBarController", "syncItem is not valid, type:" + xb0Var.f35045e + ", title:" + xb0Var.getTitle());
            }
        }
        return jz5.f0.f302826a;
    }
}
