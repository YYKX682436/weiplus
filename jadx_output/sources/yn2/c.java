package yn2;

/* loaded from: classes2.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f463963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yn2.m f463964e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f463965f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f463966g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f463967h;

    public c(com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout, yn2.m mVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var, int i17) {
        this.f463963d = finderVideoLayout;
        this.f463964e = mVar;
        this.f463965f = baseFinderFeed;
        this.f463966g = s0Var;
        this.f463967h = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.f0 f0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert$convertMedia$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = this.f463963d.isSelectedToPlay;
        yn2.m mVar = this.f463964e;
        mVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setOnClickListener onMediaClick  ");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f463965f;
        sb6.append(baseFinderFeed);
        sb6.append(", isViewSelected=");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("Finder.MegaVideoCardConvert", sb6.toString());
        java.lang.String str = baseFinderFeed instanceof zn2.a ? ((zn2.a) baseFinderFeed).f474488i : "";
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.e eVar = mVar.f463994e;
        if (eVar != null) {
            ((xn2.p0) eVar).m(this.f463966g, this.f463967h, str, mVar.f464000n);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            mVar.getClass();
            com.tencent.mars.xlog.Log.e("Finder.MegaVideoCardConvert", "video container click but action callback is null!");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert$convertMedia$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
