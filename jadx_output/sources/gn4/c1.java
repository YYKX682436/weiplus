package gn4;

/* loaded from: classes15.dex */
public class c1 extends fn4.e {

    /* renamed from: h, reason: collision with root package name */
    public final fn4.b f273601h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f273602i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f273603m;

    /* renamed from: n, reason: collision with root package name */
    public gn4.d0 f273604n;

    public c1(fn4.b bVar) {
        super(bVar);
        this.f273601h = bVar;
    }

    @Override // fn4.e
    public int B(int i17) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        fn4.m mVar = (fn4.m) k3Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryOnlyFSVideoAdapter", "onBindViewHolder %d", java.lang.Integer.valueOf(i17));
        if ((i17 < z()) || I(i17)) {
            return;
        }
        int z17 = i17 - z();
        gn4.d0 d0Var = (gn4.d0) mVar;
        fn4.b bVar = this.f273601h;
        r45.xn6 d17 = bVar.s4().d(z17);
        d0Var.q(d17);
        ((java.util.HashMap) this.f264491f).put(d17.f390259h, new java.lang.ref.WeakReference(d0Var));
        if (z17 == 0) {
            this.f273604n = d0Var;
        }
        if (this.f273602i && z17 == 0) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(d17.f390256e)) {
                this.f273603m = true;
            } else {
                d0Var.s(!bVar.s1().f264567a);
                this.f273602i = false;
                this.f273603m = false;
            }
        }
        if (bVar.o4().f264479f != null) {
            bVar.o4().f264479f.f397458g = 1L;
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        x.o oVar = this.f264489d;
        java.lang.Object e17 = oVar.e(i17, null);
        fn4.b bVar = this.f264492g;
        if (e17 != null) {
            return new fn4.d0((android.view.View) oVar.e(i17, null), bVar);
        }
        x.o oVar2 = this.f264490e;
        if (oVar2.e(i17, null) != null) {
            return new fn4.d0((android.view.View) oVar2.e(i17, null), bVar);
        }
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.d1q, (android.view.ViewGroup) null);
        inflate.setTag("video");
        return new gn4.d1(inflate, this.f273601h);
    }

    @Override // fn4.e
    public void x(java.util.List list, boolean z17) {
        super.x(list, z17);
        com.tencent.mm.sdk.platformtools.u3.h(new gn4.b1(this, list, z17));
    }
}
