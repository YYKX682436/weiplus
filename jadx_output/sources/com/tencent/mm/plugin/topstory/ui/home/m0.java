package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class m0 extends com.tencent.mm.network.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.j f175039d;

    public m0(com.tencent.mm.plugin.topstory.ui.home.j jVar) {
        this.f175039d = jVar;
    }

    @Override // com.tencent.mm.network.s0
    public void onNetworkChange(int i17) {
        try {
            com.tencent.mm.plugin.topstory.ui.webview.l lVar = this.f175039d.f174993m;
            lVar.getClass();
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.topstory.ui.webview.m(lVar));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", e17, "", new java.lang.Object[0]);
        }
    }
}
