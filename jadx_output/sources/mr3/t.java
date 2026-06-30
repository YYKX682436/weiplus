package mr3;

/* loaded from: classes5.dex */
public final class t implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f330898d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMRoundCornerImageView f330899e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mr3.v f330900f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mr3.l f330901g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f330902h;

    public t(android.content.Context context, com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView, mr3.v vVar, mr3.l lVar, in5.s0 s0Var) {
        this.f330898d = context;
        this.f330899e = mMRoundCornerImageView;
        this.f330900f = vVar;
        this.f330901g = lVar;
        this.f330902h = s0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/mod/desc_image/DescImageItemConvert$onBindViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = this.f330899e;
        android.content.Context context = this.f330898d;
        rl5.r rVar = new rl5.r(context, mMRoundCornerImageView);
        rVar.f397351u = new mr3.r(context);
        rVar.f397354x = new mr3.s(this.f330900f, this.f330901g, this.f330902h);
        boolean n17 = rVar.n(0, 0);
        yj0.a.i(n17, this, "com/tencent/mm/plugin/profile/ui/mod/desc_image/DescImageItemConvert$onBindViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return n17;
    }
}
