package yn2;

/* loaded from: classes2.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn2.m f463984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f463985e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f463986f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zn2.a f463987g;

    public i(yn2.m mVar, in5.s0 s0Var, int i17, zn2.a aVar) {
        this.f463984d = mVar;
        this.f463985e = s0Var;
        this.f463986f = i17;
        this.f463987g = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.f0 f0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yn2.m mVar = this.f463984d;
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.e eVar = mVar.f463994e;
        if (eVar != null) {
            ((xn2.p0) eVar).m(this.f463985e, this.f463986f, this.f463987g.f474488i, mVar.f464000n);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            mVar.getClass();
            com.tencent.mars.xlog.Log.e("Finder.MegaVideoCardConvert", "blur_cover_image click but action callback is null!");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
