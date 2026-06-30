package vd2;

/* loaded from: classes3.dex */
public final class v4 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.FinderLiveViewCallback f435953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f435954e;

    public v4(com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback, boolean z17) {
        this.f435953d = finderLiveViewCallback;
        this.f435954e = z17;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        java.util.List list;
        km2.m E;
        this.f435953d.f111492q.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        androidx.recyclerview.widget.f2 adapter = this.f435953d.f111492q.getAdapter();
        java.lang.Object obj = null;
        vd2.s1 s1Var = adapter instanceof vd2.s1 ? (vd2.s1) adapter : null;
        gk2.e eVar = (s1Var == null || (E = s1Var.E(this.f435953d.f111495t.f436055f)) == null) ? null : E.f309130e;
        mm2.c1 c1Var = eVar != null ? (mm2.c1) eVar.a(mm2.c1.class) : null;
        boolean z17 = false;
        boolean z18 = pm0.v.z(c1Var != null ? c1Var.f328807g2 : 0, 8);
        if (eVar != null && (list = ((mm2.o4) eVar.a(mm2.o4.class)).f329327v) != null) {
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) next).f309170a, c1Var != null ? c1Var.m8() : null)) {
                        obj = next;
                        break;
                    }
                }
            }
            obj = (km2.q) obj;
        }
        boolean z19 = obj != null;
        if (c1Var != null && c1Var.a8()) {
            z17 = true;
        }
        if (!z17 || z18 || z19) {
            return;
        }
        pm0.v.V(800L, new vd2.u4(this.f435953d, this.f435954e));
    }
}
