package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes8.dex */
public class e0 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.webview.l f175188d;

    public e0(com.tencent.mm.plugin.topstory.ui.webview.l lVar) {
        this.f175188d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.a aVar = (com.tencent.mm.plugin.finder.extension.reddot.a) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "redDotObserver invoke() called with: result = [" + aVar + "]");
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (aVar != null && aVar.f105329c != null) {
            this.f175188d.w(aVar.f105331e);
        }
        return f0Var;
    }
}
