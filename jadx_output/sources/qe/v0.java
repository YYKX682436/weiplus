package qe;

/* loaded from: classes7.dex */
public class v0 implements com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssWebSocketListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f361997a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f361998b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qe.d1 f361999c;

    public v0(qe.d1 d1Var, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        this.f361999c = d1Var;
        this.f361997a = weakReference;
        this.f361998b = weakReference2;
    }

    @Override // com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssWebSocketListener
    public com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssWebSocketListener.BindAndDnsReturn bindSocketToCellularAndDnsByCellular(int i17, java.lang.String str) {
        com.tencent.mars.comm.MultiNetLinkWaysUtil.BindAndDnsReturnKt bindSocketToCellularAndDnsByCellular = com.tencent.mars.comm.MultiNetLinkWaysUtil.INSTANCE.instance().bindSocketToCellularAndDnsByCellular(i17, str, com.tencent.mm.sdk.platformtools.x2.f193071a);
        bindSocketToCellularAndDnsByCellular.getHostIpStr();
        com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssWebSocketListener.BindAndDnsReturn bindAndDnsReturn = new com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssWebSocketListener.BindAndDnsReturn();
        bindAndDnsReturn.hostIpStr = bindSocketToCellularAndDnsByCellular.getHostIpStr();
        bindAndDnsReturn.resultCode = bindSocketToCellularAndDnsByCellular.getResultCode();
        return bindAndDnsReturn;
    }

    @Override // com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssWebSocketListener
    public int doCertificateVerify(java.lang.String str, long j17, java.lang.String str2, byte[][] bArr) {
        com.tencent.mm.plugin.appbrand.jsapi.l lVar;
        qe.d1 d1Var = this.f361999c;
        if ((d1Var.f361930c == null || d1Var.f361931d == null) && (lVar = (com.tencent.mm.plugin.appbrand.jsapi.l) this.f361998b.get()) != null) {
            d1Var.f361930c = (uh1.a) lVar.b(uh1.a.class);
            uh1.a aVar = d1Var.f361930c;
            if (aVar != null) {
                d1Var.f361931d = uh1.j0.r(aVar);
                if (d1Var.f361931d == null) {
                    com.tencent.mars.xlog.Log.e("Luggage.WcWssNativeInstallHelper", "MMWcWss doCertificateVerify getTrustManager fail");
                }
            } else {
                com.tencent.mars.xlog.Log.e("Luggage.WcWssNativeInstallHelper", "MMWcWss doCertificateVerify getConfig fail");
            }
        }
        javax.net.ssl.X509TrustManager x509TrustManager = d1Var.f361931d;
        com.tencent.mars.xlog.Log.i("Luggage.WcWssNativeInstallHelper", "certifivate verify for " + str2);
        try {
            com.tencent.mars.comm.AndroidCertVerifyResult verifyServerCertificates = com.tencent.mars.comm.X509Util.verifyServerCertificates(bArr, "RSA", str2, 1, x509TrustManager);
            com.tencent.mars.xlog.Log.i("Luggage.WcWssNativeInstallHelper", "host %s rsa verify result %d, isknownroots %b, ishostmatched %b", str2, java.lang.Integer.valueOf(verifyServerCertificates.getStatus()), java.lang.Boolean.valueOf(verifyServerCertificates.isIssuedByKnownRoot()), java.lang.Boolean.valueOf(verifyServerCertificates.isIssuedByHostMatched()));
            if (verifyServerCertificates.getStatus() != 0) {
                verifyServerCertificates = com.tencent.mars.comm.X509Util.verifyServerCertificates(bArr, "ECDSA", str2, 1, x509TrustManager);
                com.tencent.mars.xlog.Log.i("Luggage.WcWssNativeInstallHelper", "host %s ecdsa verify result %d, isknownroots %b, ishostmatched %b", str2, java.lang.Integer.valueOf(verifyServerCertificates.getStatus()), java.lang.Boolean.valueOf(verifyServerCertificates.isIssuedByKnownRoot()), java.lang.Boolean.valueOf(verifyServerCertificates.isIssuedByHostMatched()));
            }
            if (verifyServerCertificates.getStatus() != 0) {
                ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(972L, 7L, 1L, false);
            }
            if (verifyServerCertificates.getStatus() == 0 && !verifyServerCertificates.isIssuedByHostMatched()) {
                ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(972L, 8L, 1L, false);
            }
            if (verifyServerCertificates.getStatus() == 0 && !verifyServerCertificates.isIssuedByKnownRoot()) {
                ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(972L, 9L, 1L, false);
            }
            if (verifyServerCertificates.getStatus() == 0) {
                return verifyServerCertificates.isIssuedByKnownRoot() ? 0 : -1;
            }
            return -1;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.WcWssNativeInstallHelper", e17, "doCertificateVerify Exception", new java.lang.Object[0]);
            return -1;
        }
    }

    @Override // com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssWebSocketListener
    public void onStateChange(java.lang.String str, long j17, int i17) {
        ((com.tencent.mm.plugin.appbrand.jsruntime.f0) this.f361997a.get()).post(new qe.u0(this, str, j17, i17));
    }
}
