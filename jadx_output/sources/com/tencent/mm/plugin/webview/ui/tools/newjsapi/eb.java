package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class eb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f186063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186065f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186066g;

    public eb(com.tencent.mm.ui.widget.dialog.z2 z2Var, java.lang.String str, nw4.k kVar, nw4.y2 y2Var) {
        this.f186063d = z2Var;
        this.f186064e = str;
        this.f186065f = kVar;
        this.f186066g = y2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber$showRequestPhoneNumDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f186063d.B();
        java.lang.String str = this.f186064e;
        boolean z17 = str == null || str.length() == 0;
        nw4.y2 y2Var = this.f186066g;
        nw4.k kVar = this.f186065f;
        if (z17) {
            kVar.f340863d.e(y2Var.f341013c, "requestBindPhoneNumber:fail not bind phone", null);
        } else {
            kVar.f340863d.e(y2Var.f341013c, "requestBindPhoneNumber:ok", kz5.b1.e(new jz5.l("phoneNumber", str)));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber$showRequestPhoneNumDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
