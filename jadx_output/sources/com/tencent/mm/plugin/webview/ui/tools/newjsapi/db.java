package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class db implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f186039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186040e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186041f;

    public db(com.tencent.mm.ui.widget.dialog.z2 z2Var, nw4.k kVar, nw4.y2 y2Var) {
        this.f186039d = z2Var;
        this.f186040e = kVar;
        this.f186041f = y2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber$showRequestPhoneNumDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f186039d.B();
        this.f186040e.f340863d.e(this.f186041f.f341013c, "requestBindPhoneNumber:cancel", null);
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber$showRequestPhoneNumDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
