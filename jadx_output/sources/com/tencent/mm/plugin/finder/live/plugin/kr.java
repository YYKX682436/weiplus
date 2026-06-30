package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class kr implements com.tencent.mm.pluginsdk.ui.chat.v9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f113315a;

    public kr(yz5.l lVar) {
        this.f113315a = lVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void a(boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "onSearchDialogShow");
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void b(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        this.f113315a.invoke(iEmojiInfo);
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void c() {
        com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "onHidePanel");
    }
}
