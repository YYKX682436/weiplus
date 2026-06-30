package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f175066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.j f175067e;

    public p0(com.tencent.mm.plugin.topstory.ui.home.j jVar, android.view.View view) {
        this.f175067e = jVar;
        this.f175066d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        int width = this.f175066d.getWidth();
        int i17 = this.f175067e.P;
        if (width < i17) {
            int i18 = i17 - width;
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "expand back touch right:%s", java.lang.Integer.valueOf(i18));
            com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.INSTANCE.expand(this.f175066d, 0, 0, i18, 0);
        }
    }
}
