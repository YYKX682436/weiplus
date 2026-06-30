package dl2;

/* loaded from: classes3.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.n30 f235244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dl2.f0 f235245e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dl2.q f235246f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dl2.f f235247g;

    public n(r45.n30 n30Var, dl2.f0 f0Var, dl2.q qVar, dl2.f fVar) {
        this.f235244d = n30Var;
        this.f235245e = f0Var;
        this.f235246f = qVar;
        this.f235247g = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$GiftChooseAdapter$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.n30 n30Var = this.f235244d;
        int integer = n30Var.getInteger(1) - 1;
        dl2.f0 f0Var = this.f235245e;
        f0Var.getClass();
        dl2.q qVar = this.f235246f;
        if (integer >= 0) {
            qVar.f235252e.setText(java.lang.String.valueOf(integer), android.widget.TextView.BufferType.EDITABLE);
            n30Var.set(1, java.lang.Integer.valueOf(integer));
            f0Var.getClass();
            if (integer == 0) {
                com.tencent.mars.xlog.Log.i(f0Var.f235198b, "giftCountMinus click to 0");
                qVar.f235255h.setChecked(false);
                this.f235247g.f235195a = false;
            }
        }
        int integer2 = n30Var.getInteger(1);
        f0Var.getClass();
        if (integer2 == 0) {
            qVar.f235258n.setAlpha(0.3f);
        } else {
            qVar.f235258n.setAlpha(1.0f);
        }
        f0Var.b();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$GiftChooseAdapter$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
