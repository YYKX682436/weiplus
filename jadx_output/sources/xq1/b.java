package xq1;

/* loaded from: classes2.dex */
public class b implements com.tencent.mm.modelbase.u0, xq1.g {

    /* renamed from: d, reason: collision with root package name */
    public final wq1.d f456023d;

    /* renamed from: e, reason: collision with root package name */
    public vq1.a f456024e;

    public b(wq1.d dVar) {
        this.f456023d = dVar;
        gm0.j1.d().a(1869, this);
    }

    @Override // xq1.g
    public void a(java.lang.String str, java.lang.String str2) {
        if (this.f456024e != null) {
            gm0.j1.d().d(this.f456024e);
        }
        this.f456024e = new vq1.a(str, str2);
        gm0.j1.d().g(this.f456024e);
        sq1.a.a(2);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.equals(this.f456024e)) {
            xq1.f u17 = this.f456023d.u();
            vq1.a aVar = this.f456024e;
            u17.a(aVar.f439242g, i18, str, aVar.f439243h.f388463d);
            if (i18 == 0 && i18 == 0) {
                sq1.a.a(3);
            } else {
                sq1.a.a(4);
            }
        }
    }
}
