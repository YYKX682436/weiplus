package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.j f175078d;

    public s(com.tencent.mm.plugin.topstory.ui.home.j jVar) {
        this.f175078d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "hideNavBarShadow");
        com.tencent.mm.plugin.topstory.ui.home.j jVar = this.f175078d;
        android.view.View view = jVar.f174996p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        jVar.f175004v = false;
    }
}
