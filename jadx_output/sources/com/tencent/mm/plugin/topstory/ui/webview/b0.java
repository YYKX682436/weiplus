package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes8.dex */
public class b0 implements tg0.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.webview.l f175179a;

    public b0(com.tencent.mm.plugin.topstory.ui.webview.l lVar) {
        this.f175179a = lVar;
    }

    @Override // tg0.h1
    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanCommentPermission, dismiss.");
        this.f175179a.q("notifyHaoKanCommentPermission", false, true);
        aw4.n0.a(2L, 2L, 2L);
    }

    @Override // tg0.h1
    public void b() {
        this.f175179a.q("notifyHaoKanCommentPermission", true, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanCommentPermission, onPosition.");
        aw4.n0.a(1L, 2L, 2L);
    }
}
