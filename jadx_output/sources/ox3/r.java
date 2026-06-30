package ox3;

/* loaded from: classes.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox3.g f349770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f349771e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ox3.s f349772f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f349773g;

    public r(ox3.g gVar, in5.s0 s0Var, ox3.s sVar, int i17) {
        this.f349770d = gVar;
        this.f349771e = s0Var;
        this.f349772f = sVar;
        this.f349773g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/data/RingtoneHistorySelectTingConverter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ox3.g gVar = this.f349770d;
        gVar.f349753h = !gVar.f349753h;
        ((android.widget.CheckBox) this.f349771e.p(com.tencent.mm.R.id.btf)).setChecked(gVar.f349753h);
        this.f349772f.f349774e.invoke(java.lang.Integer.valueOf(this.f349773g), gVar);
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/data/RingtoneHistorySelectTingConverter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
