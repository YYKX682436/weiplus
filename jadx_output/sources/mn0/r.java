package mn0;

/* loaded from: classes10.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn0.y f329793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.rtmp.ui.TXCloudVideoView f329794e;

    public r(mn0.y yVar, com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        this.f329793d = yVar;
        this.f329794e = tXCloudVideoView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mn0.y yVar = this.f329793d;
        r45.p72 p72Var = yVar.P;
        jz5.g gVar = yVar.N;
        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView = this.f329794e;
        if (p72Var != null) {
            p72Var.set(5, java.lang.Integer.valueOf((((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() <= 0 || tXCloudVideoView.getWidth() <= 0 || tXCloudVideoView.getHeight() <= 0 || ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() / 5 < tXCloudVideoView.getWidth() * tXCloudVideoView.getHeight()) ? 0 : 1));
        }
        java.lang.String b17 = yVar.f329806e.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BaseLiveTXPlayer update isSmallScale=");
        r45.p72 p72Var2 = yVar.P;
        sb6.append(p72Var2 != null ? java.lang.Integer.valueOf(p72Var2.getInteger(5)) : null);
        sb6.append(", screenArea=");
        sb6.append(((java.lang.Number) ((jz5.n) gVar).getValue()).intValue());
        sb6.append(", view width=");
        sb6.append(tXCloudVideoView.getWidth());
        sb6.append(", height=");
        sb6.append(tXCloudVideoView.getHeight());
        com.tencent.mars.xlog.Log.i(b17, sb6.toString());
    }
}
