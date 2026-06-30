package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class nn implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.zn f119194d;

    public nn(com.tencent.mm.plugin.finder.live.widget.zn znVar) {
        this.f119194d = znVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f119194d.f120585e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
