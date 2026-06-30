package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class a2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.y1 f182143d;

    public a2(com.tencent.mm.plugin.webview.luggage.y1 y1Var) {
        this.f182143d = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/luggage/LuggageWebActionBar$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = this.f182143d.f182693e;
        if (e0Var == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/webview/luggage/LuggageWebActionBar$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            e0Var.f406655i.c(new com.tencent.mm.plugin.webview.luggage.z1(this));
            yj0.a.h(this, "com/tencent/mm/plugin/webview/luggage/LuggageWebActionBar$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
