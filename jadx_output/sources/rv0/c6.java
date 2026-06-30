package rv0;

/* loaded from: classes5.dex */
public final class c6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f399958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.base.MJID f399959e;

    public c6(rv0.z6 z6Var, com.tencent.maas.base.MJID mjid) {
        this.f399958d = z6Var;
        this.f399959e = mjid;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int w17;
        int y17;
        rv0.z6 z6Var = this.f399958d;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = z6Var.p7().getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (w17 = linearLayoutManager.w()) > (y17 = linearLayoutManager.y())) {
            return;
        }
        while (true) {
            androidx.recyclerview.widget.k3 p07 = z6Var.p7().p0(w17);
            sv0.e eVar = p07 instanceof sv0.e ? (sv0.e) p07 : null;
            if (eVar != null) {
                com.tencent.maas.base.MJID segmentID = this.f399959e;
                kotlin.jvm.internal.o.g(segmentID, "segmentID");
                if (kotlin.jvm.internal.o.b(eVar.f413221i, segmentID) && eVar.f413221i != null) {
                    rv0.a6 a6Var = (rv0.a6) eVar.f413216d;
                    a6Var.getClass();
                    ex0.a0 v76 = a6Var.f399926a.v7();
                    dx0.p m17 = v76 != null ? v76.m(segmentID) : null;
                    if ((m17 != null ? m17.f244467a : null) != null) {
                        eVar.j().setRotation(m17.f244468b);
                        eVar.j().setImageBitmap(m17.f244467a);
                    }
                }
            }
            if (w17 == y17) {
                return;
            } else {
                w17++;
            }
        }
    }
}
