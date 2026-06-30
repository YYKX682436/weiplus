package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.q f140388d;

    public o(com.tencent.mm.plugin.game.model.q qVar) {
        this.f140388d = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.model.q qVar = this.f140388d;
        if (qVar == null || com.tencent.mm.sdk.platformtools.t8.K0(qVar.f140408a) || com.tencent.mm.sdk.platformtools.t8.K0(qVar.f140409b)) {
            return;
        }
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(qVar.f140409b).openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setRequestMethod(qVar.f140408a.toUpperCase());
            httpURLConnection.setUseCaches(false);
            com.tencent.mars.xlog.Log.i("MicroMsg.GameControlCmdParser", "requestNet, method:%s, url:%s, responseCode:%d", qVar.f140408a, qVar.f140409b, java.lang.Integer.valueOf(httpURLConnection.getResponseCode()));
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameControlCmdParser", e17, "", new java.lang.Object[0]);
        }
    }
}
