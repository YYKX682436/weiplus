package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes8.dex */
public class a0 implements tg0.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.webview.l f175178a;

    public a0(com.tencent.mm.plugin.topstory.ui.webview.l lVar) {
        this.f175178a = lVar;
    }

    @Override // tg0.h1
    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanPermission, dismiss");
        this.f175178a.q("notifyHaoKanPermission", false, true);
        aw4.n0.a(2L, 1L, 2L);
    }

    @Override // tg0.h1
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanPermission onPosition");
        this.f175178a.q("notifyHaoKanPermission", true, true);
        aw4.n0.a(1L, 1L, 2L);
    }
}
