package com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder;

/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f186996e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.lang.String str, yz5.l lVar) {
        super(1);
        this.f186995d = str;
        this.f186996e = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper result = (com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper) obj;
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFinderPlayInfo callback localFeedId: ");
        sb6.append(this.f186995d);
        sb6.append(", finderVideoInfo.mediaId: ");
        r45.n23 n23Var = result.f186983d;
        sb6.append(n23Var != null ? n23Var.getString(1) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewVideoFinderActionHandler", sb6.toString());
        r45.n23 n23Var2 = result.f186983d;
        yz5.l lVar = this.f186996e;
        if (n23Var2 == null) {
            lVar.invoke(null);
        } else {
            lVar.invoke(n23Var2);
        }
        return jz5.f0.f302826a;
    }
}
