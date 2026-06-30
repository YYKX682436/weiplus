package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes11.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug3.k f188062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.k0 f188063e;

    public s(ug3.k kVar, com.tencent.mm.plugin.webwx.ui.k0 k0Var) {
        this.f188062d = kVar;
        this.f188063e = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f188062d.f427562z + "&lang=" + com.tencent.mm.sdk.platformtools.m2.d());
        intent.putExtra("showShare", false);
        intent.putExtra("neverGetA8Key", false);
        j45.l.j(this.f188063e.f188021d, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
