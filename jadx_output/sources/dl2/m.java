package dl2;

/* loaded from: classes3.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.n30 f235240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dl2.f0 f235241e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dl2.q f235242f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dl2.f f235243g;

    public m(r45.n30 n30Var, dl2.f0 f0Var, dl2.q qVar, dl2.f fVar) {
        this.f235240d = n30Var;
        this.f235241e = f0Var;
        this.f235242f = qVar;
        this.f235243g = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$GiftChooseAdapter$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.n30 n30Var = this.f235240d;
        int integer = n30Var.getInteger(1) + 1;
        dl2.f0 f0Var = this.f235241e;
        int i17 = f0Var.f235214r;
        dl2.q qVar = this.f235242f;
        if (integer <= i17) {
            qVar.f235252e.setText(java.lang.String.valueOf(integer), android.widget.TextView.BufferType.EDITABLE);
            n30Var.set(1, java.lang.Integer.valueOf(integer));
            this.f235243g.f235195a = true;
            qVar.f235255h.setChecked(true);
            f0Var.b();
        }
        qVar.f235258n.setAlpha(1.0f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$GiftChooseAdapter$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
