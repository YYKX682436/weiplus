package hn4;

/* loaded from: classes15.dex */
public class j extends fn4.e {

    /* renamed from: h, reason: collision with root package name */
    public boolean f282577h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f282578i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f282579m;

    /* renamed from: n, reason: collision with root package name */
    public hn4.d0 f282580n;

    public j(hn4.b bVar) {
        super(bVar);
    }

    @Override // fn4.e
    public int B(int i17) {
        return com.tencent.mm.sdk.platformtools.t8.L0(((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) ((hn4.b) this.f264492g)).K.d(i17 - z()).D) ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        fn4.m mVar = (fn4.m) k3Var;
        if ((i17 < z()) || I(i17)) {
            return;
        }
        int z17 = i17 - z();
        hn4.d0 d0Var = (hn4.d0) mVar;
        com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI topStoryBaseVideoUI = (com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) ((hn4.b) this.f264492g);
        r45.xn6 d17 = topStoryBaseVideoUI.K.d(z17);
        d0Var.q(d17);
        ((java.util.HashMap) this.f264491f).put(d17.f390259h, new java.lang.ref.WeakReference(d0Var));
        if (z17 == 0) {
            this.f282580n = d0Var;
        }
        if (!this.f282577h || z17 != 0) {
            topStoryBaseVideoUI.H.e(d17);
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(d17.f390256e)) {
            this.f282579m = true;
        } else {
            d0Var.s(true ^ topStoryBaseVideoUI.G.f264567a);
            this.f282577h = false;
            topStoryBaseVideoUI.H.e(d17);
            this.f282579m = false;
        }
        if (this.f282578i && z17 == topStoryBaseVideoUI.f175135o.f387516v) {
            boolean d18 = topStoryBaseVideoUI.f175126J.d();
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryListVideoAdapter", "full screen play %d %b", java.lang.Integer.valueOf(topStoryBaseVideoUI.f175135o.f387516v), java.lang.Boolean.valueOf(d18));
            this.f282578i = false;
            fn4.g gVar = topStoryBaseVideoUI.f175126J.f264574c;
            fn4.g gVar2 = d0Var.f282550h;
            if (gVar.e()) {
                gVar2.m();
            }
            fn4.l1 l1Var = topStoryBaseVideoUI.f175126J;
            fn4.g gVar3 = d0Var.f282550h;
            ((hn4.z) gVar3).getClass();
            l1Var.b(gVar3, com.tencent.mm.pluginsdk.ui.e1.CONTAIN);
            if (gVar != gVar2) {
                fn4.f pauseReason = gVar.getPauseReason();
                if (pauseReason == fn4.f.MOBILE_NET) {
                    gVar2.g();
                } else if (pauseReason == fn4.f.NO_NET) {
                    gVar2.c();
                    gVar2.k(gVar2.getNoNetTip(), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493446k80));
                }
            }
            gVar2.getControlBar().setIsPlay(d18);
            gVar2.getControlBar().setCurrentPlaySecond(topStoryBaseVideoUI.f175135o.f387517w);
            topStoryBaseVideoUI.a2(d0Var.f264584e);
            gVar2.i();
            gVar2.f264525w.setVisibility(0);
            d0Var.v();
            d0Var.t();
            d0Var.m();
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
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f489586d23, (android.view.ViewGroup) null);
        inflate.setTag("video");
        return i17 == 0 ? new hn4.d0(inflate, (hn4.b) bVar, false) : new hn4.d0(inflate, (hn4.b) bVar, true);
    }

    @Override // fn4.e
    public void x(java.util.List list, boolean z17) {
        super.x(list, z17);
        com.tencent.mm.sdk.platformtools.u3.h(new hn4.i(this, list, z17));
    }
}
