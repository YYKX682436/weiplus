package com.tencent.mm.ui;

/* loaded from: classes7.dex */
public class nk implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.pk f209432d;

    public nk(com.tencent.mm.ui.pk pkVar) {
        this.f209432d = pkVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        java.util.LinkedList linkedList;
        synchronized (this.f209432d.f209518e) {
            com.tencent.mm.ui.qk qkVar = this.f209432d.f209518e;
            new android.view.WindowInsets(windowInsets);
            qkVar.getClass();
        }
        synchronized (this.f209432d.f209518e.f209575a) {
            linkedList = new java.util.LinkedList(this.f209432d.f209518e.f209575a);
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((android.view.View.OnApplyWindowInsetsListener) it.next()).onApplyWindowInsets(view, windowInsets);
        }
        return view.onApplyWindowInsets(windowInsets);
    }
}
