package yn2;

/* loaded from: classes2.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn2.m f463988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f463989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f463990f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zn2.a f463991g;

    public j(yn2.m mVar, in5.s0 s0Var, int i17, zn2.a aVar) {
        this.f463988d = mVar;
        this.f463989e = s0Var;
        this.f463990f = i17;
        this.f463991g = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert$onBindViewHolder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.e eVar = this.f463988d.f463994e;
        if (eVar != null) {
            ((xn2.p0) eVar).m(this.f463989e, this.f463990f, this.f463991g.f474488i, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert$onBindViewHolder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
