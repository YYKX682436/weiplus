package mf1;

/* loaded from: classes7.dex */
public class d implements com.tencent.websocket.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mf1.f f326033a;

    public d(mf1.f fVar) {
        this.f326033a = fVar;
    }

    @Override // com.tencent.websocket.a
    public void a(java.lang.String str, int i17, byte[] bArr, boolean z17) {
        mf1.f fVar = this.f326033a;
        if (z17) {
            try {
                ((yc1.o) ((mf1.a) fVar.f326050r).f326023c).d(new java.lang.String(bArr, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
                return;
            } catch (java.io.UnsupportedEncodingException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandWcWssSocket", e17, "onmessage unsupport encoding UnsupportedEncodingException", new java.lang.Object[0]);
                return;
            }
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        mf1.a aVar = (mf1.a) fVar.f326050r;
        if (wrap != null) {
            aVar.getClass();
            wrap.capacity();
        }
        ((yc1.o) aVar.f326023c).e(wrap);
    }

    @Override // com.tencent.websocket.a
    public void b(java.lang.String str, int i17, java.lang.String[] strArr, java.lang.String[] strArr2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWcWssSocket", "onHandShake group:%s, wssId:%s", str, java.lang.Integer.valueOf(i17));
        mf1.f fVar = this.f326033a;
        xk1.e f17 = mf1.f.f(fVar, 1, strArr, strArr2);
        mf1.a aVar = (mf1.a) fVar.f326050r;
        aVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkWcWssSocket", "onWebsocketHandshakeSentAsClient");
        ((yc1.o) aVar.f326023c).g((xk1.a) f17);
    }

    @Override // com.tencent.websocket.a
    public void c(java.lang.String str, int i17, boolean z17, java.lang.String[] strArr, java.lang.String[] strArr2, int i18, java.lang.String str2, java.lang.String[] strArr3, java.lang.String[] strArr4) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWcWssSocket", "onOpen group:%s,isSuc:%s, msg:%s, code:%s, wssId:%s", str, java.lang.Boolean.valueOf(z17), str2, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        mf1.f fVar = this.f326033a;
        if (!z17) {
            ((mf1.a) fVar.f326050r).a("onOpen fail code:" + i18 + ", msg:" + str2);
            return;
        }
        fVar.f326052t = mf1.e.OPEN;
        xk1.e f17 = mf1.f.f(fVar, 2, strArr, strArr2);
        fVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (strArr3 == null || strArr4 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandWcWssSocket", "buildProfileMap profileKey args is null");
        } else if (strArr3.length == strArr4.length) {
            for (int i19 = 0; i19 < strArr3.length; i19++) {
                hashMap.put(strArr3[i19], strArr4[i19]);
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandWcWssSocket", "buildProfileMap profileKey != profileValue profileKey.length:%d,profileValue.length:%d", java.lang.Integer.valueOf(strArr3.length), java.lang.Integer.valueOf(strArr4.length));
        }
        mf1.a aVar = (mf1.a) fVar.f326050r;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkWcWssSocket", "onSocketOpen taskId=%s", aVar.f326021a);
        aVar.f326025e.i(aVar.f326022b);
        ((yc1.o) aVar.f326023c).f((xk1.g) f17, hashMap);
    }

    @Override // com.tencent.websocket.a
    public void d(java.lang.String str, int i17, int i18, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWcWssSocket", "onClose group:%s,id:%s, reason:%s, code:%s", str, java.lang.Integer.valueOf(i17), str2, java.lang.Integer.valueOf(i18));
        mf1.e eVar = mf1.e.CLOSED;
        mf1.f fVar = this.f326033a;
        fVar.f326052t = eVar;
        mf1.a aVar = (mf1.a) fVar.f326050r;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkWcWssSocket", "onSocketClose url is %s ,state: closed ,reason: %s, errCode = %d,taskId=%s", aVar.f326024d, str2, java.lang.Integer.valueOf(i18), aVar.f326021a);
        mf1.c cVar = aVar.f326025e;
        mf1.k kVar = aVar.f326022b;
        cVar.i(kVar);
        cVar.h(kVar);
        mf1.h hVar = aVar.f326023c;
        if (i18 != -1) {
            ((yc1.o) hVar).a(i18, str2);
            return;
        }
        if (com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            ((yc1.o) hVar).c(com.tencent.mm.sdk.platformtools.t8.K0(str2) ? "abnormal closure" : str2);
        } else {
            ((yc1.o) hVar).c("network is down");
        }
        ((yc1.o) hVar).a(1006, str2);
    }

    @Override // com.tencent.websocket.a
    public int doCertificateVerify(java.lang.String str, byte[][] bArr) {
        mf1.f fVar = this.f326033a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWcWssSocket", "certifivate verify for " + str);
        try {
            com.tencent.mars.comm.AndroidCertVerifyResult verifyServerCertificates = com.tencent.mars.comm.X509Util.verifyServerCertificates(bArr, "RSA", str, 1, fVar.f326053u);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWcWssSocket", "host %s rsa verify result %d, isknownroots %b, ishostmatched %b", str, java.lang.Integer.valueOf(verifyServerCertificates.getStatus()), java.lang.Boolean.valueOf(verifyServerCertificates.isIssuedByKnownRoot()), java.lang.Boolean.valueOf(verifyServerCertificates.isIssuedByHostMatched()));
            if (verifyServerCertificates.getStatus() != 0) {
                verifyServerCertificates = com.tencent.mars.comm.X509Util.verifyServerCertificates(bArr, "ECDSA", str, 1, fVar.f326053u);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWcWssSocket", "host %s ecdsa verify result %d, isknownroots %b, ishostmatched %b", str, java.lang.Integer.valueOf(verifyServerCertificates.getStatus()), java.lang.Boolean.valueOf(verifyServerCertificates.isIssuedByKnownRoot()), java.lang.Boolean.valueOf(verifyServerCertificates.isIssuedByHostMatched()));
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
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandWcWssSocket", e17, "doCertificateVerify Exception", new java.lang.Object[0]);
            return -1;
        }
    }
}
