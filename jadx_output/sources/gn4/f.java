package gn4;

/* loaded from: classes15.dex */
public class f extends fn4.e {

    /* renamed from: h, reason: collision with root package name */
    public final fn4.b f273610h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f273611i;

    public f(fn4.b bVar) {
        super(bVar);
        this.f273611i = false;
        this.f273610h = bVar;
    }

    @Override // fn4.e
    public int B(int i17) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        fn4.m mVar = (fn4.m) k3Var;
        if ((i17 < z()) || I(i17)) {
            return;
        }
        gn4.d0 d0Var = (gn4.d0) mVar;
        r45.xn6 d17 = this.f264492g.s4().d(i17 - z());
        d0Var.q(d17);
        ((java.util.HashMap) this.f264491f).put(d17.f390259h, new java.lang.ref.WeakReference(d0Var));
        if (this.f273611i) {
            fn4.b bVar = this.f273610h;
            if (bVar.r0().f387516v == i17) {
                boolean d18 = bVar.I2().d();
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryFSVideoAdapter", "fs play %d %b", java.lang.Integer.valueOf(bVar.r0().f387516v), java.lang.Boolean.valueOf(d18));
                this.f273611i = false;
                fn4.g gVar = bVar.I2().f264574c;
                gn4.z zVar = d0Var.f273605h;
                fn4.l1 I2 = bVar.I2();
                gn4.z zVar2 = d0Var.f273605h;
                I2.b(zVar2, zVar2.b(d17));
                if (gVar != null && gVar != zVar) {
                    if (gVar.e()) {
                        zVar.m();
                    }
                    fn4.f pauseReason = gVar.getPauseReason();
                    if (pauseReason == fn4.f.MOBILE_NET) {
                        zVar.g();
                    } else if (pauseReason == fn4.f.NO_NET) {
                        zVar.c();
                        zVar.k(zVar.getNoNetTip(), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493446k80));
                    }
                }
                zVar.getControlBar().setIsPlay(d18);
                zVar.getControlBar().w();
                zVar.getControlBar().setCurrentPlaySecond(bVar.r0().f387517w);
                zVar.i();
                bVar.a2(d0Var.f264584e);
                d0Var.t();
                d0Var.m();
                zVar.f264525w.setVisibility(0);
                if (bVar.o4().f264479f != null) {
                    bVar.o4().f264479f.f397458g = 1L;
                }
            }
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
        return new gn4.d0(inflate, this.f273610h);
    }

    @Override // fn4.e
    public void x(java.util.List list, boolean z17) {
        super.x(list, z17);
        com.tencent.mm.sdk.platformtools.u3.h(new gn4.e(this, list));
    }
}
