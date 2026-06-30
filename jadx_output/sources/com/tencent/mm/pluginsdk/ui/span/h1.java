package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes3.dex */
public class h1 implements android.view.View.OnLongClickListener {
    public h1(com.tencent.mm.pluginsdk.ui.span.j1 j1Var) {
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/span/SpanProcessor$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (view == null) {
            yj0.a.i(false, this, "com/tencent/mm/pluginsdk/ui/span/SpanProcessor$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SpanProcessor", "shouldPerformLongClick and click");
        boolean performLongClick = view.performLongClick();
        yj0.a.i(performLongClick, this, "com/tencent/mm/pluginsdk/ui/span/SpanProcessor$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return performLongClick;
    }
}
