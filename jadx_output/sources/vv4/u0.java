package vv4;

/* loaded from: classes12.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f440508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI f440509f;

    public u0(java.lang.String str, long j17, com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI webSearchImageLoadingUI) {
        this.f440507d = str;
        this.f440508e = j17;
        this.f440509f = webSearchImageLoadingUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(this.f440507d, this.f440508e);
        com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI webSearchImageLoadingUI = this.f440509f;
        int i17 = com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI.f181653s;
        webSearchImageLoadingUI.getClass();
        boolean z17 = n17.A0() == 1 ? !n17.z2() : !n17.z2();
        com.tencent.mars.xlog.Log.i(this.f440509f.f181654d, "tryDownloadImage msgId: %s, msgSvrId: %s, talker: %s, canDownload: %b", java.lang.Long.valueOf(this.f440508e), java.lang.Long.valueOf(n17.I0()), n17.Q0(), java.lang.Boolean.valueOf(z17));
        if (z17) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            this.f440509f.f181660m = m11.b1.Di().b2(n17.Q0(), n17.I0()).f322633a;
            k70.x Di = ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di();
            long j17 = this.f440509f.f181660m;
            long j18 = this.f440508e;
            if (((m11.j) Di).b(j17, new com.tencent.mm.plugin.msg.MsgIdTalker(j18, this.f440507d), 0, java.lang.Long.valueOf(j18), com.tencent.mm.R.drawable.bzt, this.f440509f.f181664q, 0, true) == 0) {
                this.f440509f.f181661n = true;
                ((ku5.t0) ku5.t0.f312615d).B(new vv4.t0(this.f440509f));
            } else {
                com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI webSearchImageLoadingUI2 = this.f440509f;
                webSearchImageLoadingUI2.getClass();
                ((ku5.t0) ku5.t0.f312615d).B(new vv4.n0(webSearchImageLoadingUI2));
            }
        }
    }
}
