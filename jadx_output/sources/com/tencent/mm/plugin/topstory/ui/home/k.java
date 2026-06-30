package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f175022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.j f175023e;

    public k(com.tencent.mm.plugin.topstory.ui.home.j jVar, int i17) {
        this.f175023e = jVar;
        this.f175022d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.topstory.ui.home.j jVar = this.f175023e;
        int i17 = jVar.I;
        if (this.f175022d == i17) {
            ((com.tencent.mm.plugin.topstory.ui.home.c1) ((java.util.ArrayList) jVar.H).get(i17)).f174944c.setVisibility(8);
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "onH5RenderFinished hide fakeIv " + jVar.I);
        }
    }
}
