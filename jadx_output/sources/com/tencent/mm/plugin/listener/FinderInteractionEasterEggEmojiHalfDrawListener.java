package com.tencent.mm.plugin.listener;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/listener/FinderInteractionEasterEggEmojiHalfDrawListener;", "Lcom/tencent/mm/plugin/lite/api/LiteAppHalfScreenStatusChangeListener;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderInteractionEasterEggEmojiHalfDrawListener extends com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener {
    @Override // com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener
    public void b() {
        com.tencent.mars.xlog.Log.i("Finder.FinderInteractionEasterEggEmojiHalfDrawListener", "onCloseAnimEnd");
        ox2.q0.f349704a--;
    }

    @Override // com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener
    public void c() {
        com.tencent.mars.xlog.Log.i("Finder.FinderInteractionEasterEggEmojiHalfDrawListener", "onCloseAnimStart");
    }

    @Override // com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener
    public void e() {
        com.tencent.mars.xlog.Log.i("Finder.FinderInteractionEasterEggEmojiHalfDrawListener", "onFullScreenAnimEnd");
    }

    @Override // com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener
    public void f(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("Finder.FinderInteractionEasterEggEmojiHalfDrawListener", "onHeightChanged currentHeight: " + i17 + ", baseHeight: " + i18);
    }

    @Override // com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener
    public void g() {
        com.tencent.mars.xlog.Log.i("Finder.FinderInteractionEasterEggEmojiHalfDrawListener", "onOpenAnimEnd");
    }

    @Override // com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener
    public void h() {
        com.tencent.mars.xlog.Log.i("Finder.FinderInteractionEasterEggEmojiHalfDrawListener", "onOpenAnimStart");
    }

    @Override // com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener
    public void i() {
    }

    @Override // com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener
    public void m() {
    }

    @Override // com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener
    public void n() {
        com.tencent.mars.xlog.Log.i("Finder.FinderInteractionEasterEggEmojiHalfDrawListener", "onResumeHalfScreenAnimStart");
    }
}
