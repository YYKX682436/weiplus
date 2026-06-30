package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class bq implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f131738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.gq f131739e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f131740f;

    public bq(android.widget.TextView textView, com.tencent.mm.plugin.finder.view.gq gqVar, android.widget.EditText editText) {
        this.f131738d = textView;
        this.f131739e = gqVar;
        this.f131740f = editText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/LiveChargeInputCoinValueBottomPage$getView$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f131738d.isEnabled()) {
            android.widget.EditText editText = this.f131740f;
            java.lang.String obj = editText.getText().toString();
            com.tencent.mm.plugin.finder.view.gq gqVar = this.f131739e;
            if (com.tencent.mm.plugin.finder.view.gq.i(gqVar, obj)) {
                com.tencent.mm.plugin.finder.view.sp spVar = gqVar.f132185e;
                int parseInt = java.lang.Integer.parseInt(editText.getText().toString());
                com.tencent.mm.plugin.finder.view.zp zpVar = ((com.tencent.mm.plugin.finder.view.yp) spVar).f133414a;
                zpVar.f133485b.invoke(java.lang.Integer.valueOf(parseInt));
                com.tencent.mm.ui.widget.dialog.y1 y1Var = zpVar.f133486c;
                if (y1Var != null) {
                    y1Var.q();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/LiveChargeInputCoinValueBottomPage$getView$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
