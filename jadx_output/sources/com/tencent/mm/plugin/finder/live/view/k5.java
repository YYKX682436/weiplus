package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes8.dex */
public final class k5 implements kk1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressItemView f116439a;

    public k5(com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressItemView finderLiveGameWelfareTaskProgressItemView) {
        this.f116439a = finderLiveGameWelfareTaskProgressItemView;
    }

    @Override // kk1.c
    public final void a(java.lang.String str) {
        android.content.Context context = this.f116439a.getContext();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("forceHideShare", true);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
