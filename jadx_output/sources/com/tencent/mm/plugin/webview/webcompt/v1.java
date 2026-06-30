package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class v1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.webcompt.y1 f187941d;

    public v1(com.tencent.mm.plugin.webview.webcompt.y1 y1Var) {
        this.f187941d = y1Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/webcompt/WebComptTagJsApiHandler$debugListener$2$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.webview.webcompt.y1 y1Var = this.f187941d;
        boolean z17 = !r26.n0.N(y1Var.f187953d);
        if (z17) {
            android.content.Context context = view.getContext();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[webCompts]\n            ");
            java.util.Collection values = y1Var.f187954e.values();
            kotlin.jvm.internal.o.f(values, "<get-values>(...)");
            sb6.append(kz5.n0.g0(values, "\n\n", null, null, 0, null, com.tencent.mm.plugin.webview.webcompt.u1.f187936d, 30, null));
            sb6.append("\n\n            ");
            sb6.append(com.tencent.mm.plugin.webview.webcompt.f1.f187797e.f());
            sb6.append("\n            ");
            db5.e1.s(context, r26.b0.b(sb6.toString()), "");
        }
        yj0.a.i(z17, this, "com/tencent/mm/plugin/webview/webcompt/WebComptTagJsApiHandler$debugListener$2$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return z17;
    }
}
