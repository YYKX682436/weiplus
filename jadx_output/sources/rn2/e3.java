package rn2;

/* loaded from: classes15.dex */
public final class e3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.n30 f397719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rn2.z2 f397720e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rn2.y2 f397721f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rn2.h3 f397722g;

    public e3(r45.n30 n30Var, rn2.z2 z2Var, rn2.y2 y2Var, rn2.h3 h3Var) {
        this.f397719d = n30Var;
        this.f397720e = z2Var;
        this.f397721f = y2Var;
        this.f397722g = h3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/create/GiftSelectorAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.n30 n30Var = this.f397719d;
        int integer = n30Var.getInteger(1) + 1;
        rn2.z2 z2Var = this.f397720e;
        z2Var.f397936e.setText(java.lang.String.valueOf(integer), android.widget.TextView.BufferType.EDITABLE);
        n30Var.set(1, java.lang.Integer.valueOf(integer));
        this.f397721f.f397926a = true;
        z2Var.f397939h.setChecked(true);
        rn2.h3 h3Var = this.f397722g;
        yz5.a aVar = h3Var.f397759e;
        if (aVar != null) {
            aVar.invoke();
        }
        h3Var.notifyDataSetChanged();
        z2Var.f397942n.setAlpha(1.0f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/GiftSelectorAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
