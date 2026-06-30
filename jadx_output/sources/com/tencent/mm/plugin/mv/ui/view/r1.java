package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class r1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f151933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView f151934e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f151935f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f151936g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f151937h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f151938i;

    public r1(java.lang.String str, com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView musicMvCommentView, java.lang.Long l17, java.lang.String str2, long j17, java.lang.String str3) {
        this.f151933d = str;
        this.f151934e = musicMvCommentView;
        this.f151935f = l17;
        this.f151936g = str2;
        this.f151937h = j17;
        this.f151938i = str3;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        java.lang.String str = this.f151936g;
        java.lang.Long l17 = this.f151935f;
        long j17 = this.f151937h;
        com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView musicMvCommentView = this.f151934e;
        if (itemId == 1) {
            com.tencent.mm.sdk.platformtools.b0.e(this.f151933d);
            dp.a.makeText(musicMvCommentView.getContext(), com.tencent.mm.R.string.f490361st, 0).show();
            rm3.a aVar = musicMvCommentView.f151661g;
            if (aVar != null) {
                aVar.a(l17, str, j17);
                return;
            }
            return;
        }
        if (itemId != 2) {
            return;
        }
        ka0.r0 r0Var = (ka0.r0) i95.n0.c(ka0.r0.class);
        android.content.Context context = musicMvCommentView.getContext();
        java.lang.String u17 = pm0.v.u(j17);
        ((ja0.o0) r0Var).getClass();
        int i18 = ll3.j2.f319185a;
        java.lang.String format = java.lang.String.format("https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fys) + "/security/readtemplate?t=weixin_report/w_type&scene=%d&content_ID=%s&comment_ID=%s", 71, this.f151938i, u17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", format);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        rm3.a aVar2 = musicMvCommentView.f151661g;
        if (aVar2 != null) {
            aVar2.b(l17, str, j17);
        }
    }
}
