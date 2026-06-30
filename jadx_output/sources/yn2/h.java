package yn2;

/* loaded from: classes2.dex */
public final class h implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn2.m f463981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f463982e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zn2.a f463983f;

    public h(yn2.m mVar, in5.s0 s0Var, zn2.a aVar) {
        this.f463981d = mVar;
        this.f463982e = s0Var;
        this.f463983f = aVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert$onBindViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        kotlin.jvm.internal.o.d(view);
        yn2.m.n(this.f463981d, this.f463982e, view, this.f463983f, null);
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert$onBindViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
