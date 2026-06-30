package w21;

/* loaded from: classes12.dex */
public class n0 extends com.tencent.mm.app.s2 {
    public n0(w21.p0 p0Var) {
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        if (gm0.j1.a() && gm0.j1.b().f273254q) {
            gm0.j1.b();
            gm0.m.r();
        }
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        if (gm0.j1.a() && gm0.j1.b().f273254q) {
            gm0.j1.b();
            if (gm0.m.r()) {
                return;
            }
            nm.j.f338443g.a(new w21.m0(this));
        }
    }
}
