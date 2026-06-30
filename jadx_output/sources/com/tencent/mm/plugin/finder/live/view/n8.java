package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes.dex */
public final class n8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f116524d;

    public n8(java.lang.String str) {
        this.f116524d = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordPlayWidget$updateWidgetVisibilityAndImage$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("FinderLiveProductRecordPlayWidget", "click widget");
        com.tencent.mm.ipcinvoker.d0.e(com.tencent.mm.sdk.platformtools.x2.f193072b, new com.tencent.mm.ipcinvoker.type.IPCString(this.f116524d), com.tencent.mm.plugin.finder.live.view.e8.class, com.tencent.mm.plugin.finder.live.view.m8.f116477d, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordPlayWidget$updateWidgetVisibilityAndImage$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
