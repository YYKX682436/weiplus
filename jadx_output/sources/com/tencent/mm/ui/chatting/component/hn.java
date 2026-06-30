package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class hn implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.TranslateControllerView f199177d;

    public hn(com.tencent.mm.ui.chatting.component.TranslateControllerView translateControllerView) {
        this.f199177d = translateControllerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.component.TranslateControllerView translateControllerView = this.f199177d;
        com.tencent.mars.xlog.Log.i(translateControllerView.f198572e, "showLanguage: postDelayed");
        translateControllerView.b(translateControllerView.f198573f, translateControllerView.targetLanTvOriginWidth);
    }
}
