package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class b0 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.j f174936d;

    public b0(com.tencent.mm.plugin.topstory.ui.home.j jVar) {
        this.f174936d = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.a aVar = (com.tencent.mm.plugin.finder.extension.reddot.a) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "redDotObserver invoke() called with: result = [" + aVar + "]");
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (aVar != null) {
            com.tencent.mm.plugin.topstory.ui.home.j jVar = this.f174936d;
            if (jVar.E) {
                if (pm4.w.n(jVar.h() != null ? jVar.h().f447318b : 0)) {
                    ((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).Ri(jVar.F, "onUniformReddotDataChanged", cn4.a.f43677a.a(aVar.f105331e).toJson());
                }
            }
            com.tencent.mm.plugin.topstory.ui.webview.l lVar = jVar.f174993m;
            if (lVar != null) {
                lVar.w(aVar.f105331e);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "invoke:topStoryWebViewJSApi  topStoryWebViewJSApi is null");
            }
        }
        return f0Var;
    }
}
