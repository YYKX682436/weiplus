package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f175111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.z0 f175112e;

    public y0(com.tencent.mm.plugin.topstory.ui.home.z0 z0Var, int i17) {
        this.f175112e = z0Var;
        this.f175111d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.topstory.ui.home.z0 z0Var = this.f175112e;
        com.tencent.mm.plugin.topstory.ui.home.j jVar = z0Var.f175120d;
        int i17 = jVar.I;
        if (this.f175111d == i17) {
            ((com.tencent.mm.plugin.topstory.ui.home.c1) ((java.util.ArrayList) jVar.H).get(i17)).f174944c.setVisibility(8);
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "onPageScrollStateChanged hide fakeIv " + z0Var.f175120d.I);
        }
    }
}
