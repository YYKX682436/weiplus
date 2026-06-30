package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class b2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.y1 f182151d;

    public b2(com.tencent.mm.plugin.webview.luggage.y1 y1Var) {
        this.f182151d = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/luggage/LuggageWebActionBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.luggage.y1 y1Var = this.f182151d;
        if (!y1Var.h()) {
            y1Var.c();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/luggage/LuggageWebActionBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
