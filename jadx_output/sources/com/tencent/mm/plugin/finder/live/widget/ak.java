package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ak implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.dk f117785d;

    public ak(com.tencent.mm.plugin.finder.live.widget.dk dkVar) {
        this.f117785d = dkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.dk dkVar = this.f117785d;
        android.view.ViewGroup viewGroup = dkVar.f118108d;
        dkVar.f118114m = (android.view.ViewGroup) viewGroup.findViewById(com.tencent.mm.R.id.gmn);
        dkVar.f118115n = viewGroup.findViewById(com.tencent.mm.R.id.gmm);
        android.view.ViewGroup viewGroup2 = dkVar.f118114m;
        java.lang.Integer valueOf = viewGroup2 != null ? java.lang.Integer.valueOf(viewGroup2.indexOfChild(dkVar)) : null;
        if (valueOf != null && valueOf.intValue() == -1) {
            zl2.r4.f473950a.Q2(dkVar);
            android.view.ViewGroup viewGroup3 = dkVar.f118114m;
            if (viewGroup3 != null) {
                viewGroup3.addView(dkVar);
            }
        } else {
            com.tencent.mars.xlog.Log.i(dkVar.f118110f, "bubbleAttachToParent, have contain child!");
        }
        android.view.ViewGroup viewGroup4 = dkVar.f118114m;
        if (viewGroup4 != null) {
            viewGroup4.setVisibility(0);
        }
        android.view.View view = dkVar.f118115n;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveGameJoinGuideBubbleWidget$bubbleAttachToParent$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGameJoinGuideBubbleWidget$bubbleAttachToParent$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.ViewGroup viewGroup5 = dkVar.f118114m;
        if (viewGroup5 != null) {
            viewGroup5.setTag(java.lang.Integer.valueOf(dkVar.getId()));
        }
        dkVar.f118122u = 0;
        dkVar.f118123v = 0;
        dkVar.g();
    }
}
