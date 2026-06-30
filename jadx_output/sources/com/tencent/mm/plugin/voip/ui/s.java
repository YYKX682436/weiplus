package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes14.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.ui.v f176981d;

    public s(com.tencent.mm.plugin.voip.ui.v vVar) {
        this.f176981d = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voip/ui/QosParamDialog$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.voip.ui.v vVar = this.f176981d;
        java.lang.Object value = ((jz5.n) vVar.f177003g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        int intValue = ((java.lang.Number) vVar.f177010q.get(((android.widget.Spinner) value).getSelectedItemPosition())).intValue();
        java.lang.Object value2 = ((jz5.n) vVar.f177004h).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        int intValue2 = ((java.lang.Number) vVar.f177011r.get(((android.widget.Spinner) value2).getSelectedItemPosition())).intValue();
        java.lang.Object value3 = ((jz5.n) vVar.f177005i).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        int P = com.tencent.mm.sdk.platformtools.t8.P(((android.widget.EditText) value3).getText().toString(), 15);
        java.lang.Object value4 = ((jz5.n) vVar.f177006m).getValue();
        kotlin.jvm.internal.o.f(value4, "getValue(...)");
        int P2 = com.tencent.mm.sdk.platformtools.t8.P(((android.widget.EditText) value4).getText().toString(), 10);
        java.lang.Object value5 = ((jz5.n) vVar.f177008o).getValue();
        kotlin.jvm.internal.o.f(value5, "getValue(...)");
        int P3 = com.tencent.mm.sdk.platformtools.t8.P(((android.widget.EditText) value5).getText().toString(), 15);
        java.lang.Object value6 = ((jz5.n) vVar.f177009p).getValue();
        kotlin.jvm.internal.o.f(value6, "getValue(...)");
        java.lang.Object selectedItem = ((android.widget.Spinner) value6).getSelectedItem();
        kotlin.jvm.internal.o.e(selectedItem, "null cannot be cast to non-null type kotlin.String");
        int P4 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) selectedItem, 2);
        java.lang.Object value7 = ((jz5.n) vVar.f177007n).getValue();
        kotlin.jvm.internal.o.f(value7, "getValue(...)");
        vVar.f177000d.invoke(new com.tencent.mm.plugin.voip.ui.w(intValue, intValue2, P, P3, P2, P4, com.tencent.mm.sdk.platformtools.t8.P(((android.widget.EditText) value7).getText().toString(), 600)));
        vVar.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/voip/ui/QosParamDialog$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
