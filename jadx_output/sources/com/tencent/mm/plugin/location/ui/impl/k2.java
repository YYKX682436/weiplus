package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes3.dex */
public class k2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.y1 f144840e;

    public k2(com.tencent.mm.plugin.location.ui.impl.y1 y1Var, java.lang.String str) {
        this.f144840e = y1Var;
        this.f144839d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/impl/TrackMapUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.location.ui.impl.y1 y1Var = this.f144840e;
        intent.setClass(y1Var.f144728d, com.tencent.mm.ui.w2.class);
        intent.putExtra("rawUrl", this.f144839d);
        intent.putExtra("showShare", false);
        j45.l.u(y1Var.f144728d, "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
