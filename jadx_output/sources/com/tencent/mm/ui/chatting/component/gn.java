package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class gn implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.TranslateControllerView f199117d;

    public gn(com.tencent.mm.ui.chatting.component.TranslateControllerView translateControllerView) {
        this.f199117d = translateControllerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.component.TranslateControllerView translateControllerView = this.f199117d;
        com.tencent.mars.xlog.Log.i(translateControllerView.f198572e, "hideLanguage: postDelayed");
        translateControllerView.b(translateControllerView.f198573f, 0);
    }
}
