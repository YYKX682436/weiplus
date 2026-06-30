package te2;

/* loaded from: classes14.dex */
public final class m2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.a3 f418222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p2 f418223e;

    public m2(te2.a3 a3Var, te2.p2 p2Var) {
        this.f418222d = a3Var;
        this.f418223e = p2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        kn0.g gVar;
        r45.ka4 ka4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback$DeviceAdapter$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        te2.a3 a3Var = this.f418222d;
        te2.b2 b2Var = a3Var.f417859g;
        if (b2Var != null) {
            x91.h hVar = this.f418223e.f418299a;
            te2.l2 l2Var = (te2.l2) b2Var;
            gk2.e eVar = l2Var.f418191d;
            kn0.i iVar = ((mm2.e1) eVar.a(mm2.e1.class)).f328990t;
            java.lang.String str = (iVar == null || (gVar = iVar.f309558b) == null || (ka4Var = gVar.f309548o) == null) ? null : ka4Var.f378559z;
            boolean z17 = str == null || str.length() == 0;
            java.lang.String str2 = l2Var.f418192e;
            if (z17) {
                com.tencent.mars.xlog.Log.i(str2, "hlsUrl is nullOrNil!!, return");
            } else {
                ((je2.i) eVar.a(je2.i.class)).f299235f = hVar;
                x91.h hVar2 = ((je2.i) eVar.a(je2.i.class)).f299235f;
                if (hVar2 != null) {
                    hVar2.e(new te2.i2(l2Var, str));
                }
                com.tencent.mars.xlog.Log.i(str2, "selectDevice: " + eVar + ".business(LiveCastScreenSlice::class.java).selectedDevice");
            }
        }
        ((ml2.r0) i95.n0.c(ml2.r0.class)).xj(ml2.n1.f327726h, a3Var.a());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback$DeviceAdapter$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
