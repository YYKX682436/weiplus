package wv1;

/* loaded from: classes12.dex */
public class g extends wv1.e {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f449941f;

    @Override // wv1.a
    public int h() {
        return 2;
    }

    @Override // wv1.a
    public void k(android.view.View view, wv1.a aVar) {
        xv1.d.d(((com.tencent.mm.plugin.choosemsgfile.logic.ui.a) this.f449929a).f95523d.getContext(), view, aVar);
    }

    @Override // wv1.e
    public java.lang.String m() {
        if (this.f449941f == null) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.l0 Di = m11.b1.Di();
            com.tencent.mm.storage.f9 f9Var = this.f449930b;
            java.lang.String D2 = Di.D2(f9Var, f9Var.z0(), false);
            this.f449941f = D2;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(D2) && !this.f449941f.endsWith("hd")) {
                if (com.tencent.mm.vfs.w6.j(this.f449941f + "hd")) {
                    this.f449941f += "hd";
                }
            }
        }
        return this.f449941f;
    }
}
