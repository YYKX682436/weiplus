package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class na implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f201225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.oa f201226e;

    public na(com.tencent.mm.ui.chatting.gallery.oa oaVar, android.content.Intent intent) {
        this.f201226e = oaVar;
        this.f201225d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        j45.l.j(this.f201226e.f201247d.f201424b.f201092g.getContext(), "webview", ".ui.tools.WebViewUI", this.f201225d, null);
    }
}
