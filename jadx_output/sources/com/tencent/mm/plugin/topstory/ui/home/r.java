package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f175073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f175074e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.j f175075f;

    public r(com.tencent.mm.plugin.topstory.ui.home.j jVar, int i17, int i18) {
        this.f175075f = jVar;
        this.f175073d = i17;
        this.f175074e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f175073d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        int i18 = this.f175074e;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "showNavBarShadow %s, %s", valueOf, java.lang.Integer.valueOf(i18));
        int i19 = i17 + (i18 * com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62);
        com.tencent.mm.plugin.topstory.ui.home.j jVar = this.f175075f;
        jVar.f174996p.setBackgroundColor(i19);
        android.view.View view = jVar.f174996p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$16", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$16", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        jVar.f175004v = true;
        jVar.f174996p.setOnClickListener(new com.tencent.mm.plugin.topstory.ui.home.q(this));
    }
}
