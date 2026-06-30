package rn2;

/* loaded from: classes15.dex */
public final class d3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.z2 f397691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.n30 f397692e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rn2.h3 f397693f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rn2.y2 f397694g;

    public d3(rn2.z2 z2Var, r45.n30 n30Var, rn2.h3 h3Var, rn2.y2 y2Var) {
        this.f397691d = z2Var;
        this.f397692e = n30Var;
        this.f397693f = h3Var;
        this.f397694g = y2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/create/GiftSelectorAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rn2.z2 z2Var = this.f397691d;
        if (z2Var.f397939h.isChecked()) {
            r45.n30 n30Var = this.f397692e;
            if (n30Var.getInteger(1) <= 0) {
                n30Var.set(1, 1);
                z2Var.f397936e.setText("1", android.widget.TextView.BufferType.EDITABLE);
            }
        }
        rn2.h3 h3Var = this.f397693f;
        java.util.LinkedList x17 = h3Var.x();
        if ((x17 instanceof java.util.Collection) && x17.isEmpty()) {
            i17 = 0;
        } else {
            java.util.Iterator it = x17.iterator();
            i17 = 0;
            while (it.hasNext()) {
                if (((rn2.y2) it.next()).f397926a && (i17 = i17 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
        }
        int i18 = ((rn2.y2) kz5.n0.X(h3Var.x())).f397927b;
        boolean z17 = i17 >= i18;
        android.widget.CheckBox checkBox = z2Var.f397939h;
        this.f397694g.f397926a = !z17 && checkBox.isChecked();
        if (z17 && checkBox.isChecked()) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491643lj4, java.lang.String.valueOf(i18));
            kotlin.jvm.internal.o.f(string, "getString(...)");
            db5.t7.g(com.tencent.mm.sdk.platformtools.x2.f193071a, string);
        }
        yz5.a aVar = h3Var.f397759e;
        if (aVar != null) {
            aVar.invoke();
        }
        h3Var.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/GiftSelectorAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
