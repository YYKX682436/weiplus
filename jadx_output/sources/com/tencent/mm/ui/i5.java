package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class i5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f208904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.FindMoreFriendsUI f208905e;

    public i5(com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI, android.content.Intent intent) {
        this.f208905e = findMoreFriendsUI;
        this.f208904d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        j45.l.j(this.f208905e.getContext(), "webview", ".ui.tools.WebViewUI", this.f208904d, null);
    }
}
