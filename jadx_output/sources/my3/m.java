package my3;

/* loaded from: classes8.dex */
public final class m implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my3.q f332814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332815e;

    public m(my3.q qVar, java.lang.String str) {
        this.f332814d = qVar;
        this.f332815e = str;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.protobuf.g gVar;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle != null ? bundle.getString("licence") : null;
        java.lang.String string2 = bundle != null ? bundle.getString(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID) : null;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(string);
        my3.q qVar = this.f332814d;
        if (K0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosServiceImpl", "get licence fail.");
            qVar.Ri(fy3.i.f267246e);
            qVar.fj(0, 3);
            return;
        }
        qVar.getClass();
        if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "getOAuthTicket deviceId:%s json:%s", string2, string);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "getOAuthTicket deviceId:%s json:%s", string2, com.tencent.mm.sdk.platformtools.t8.G1(string));
        }
        try {
            cl0.g gVar2 = new cl0.g(string);
            int optInt = gVar2.optInt("product_id", 0);
            int optInt2 = gVar2.optInt("key_version", 0);
            java.lang.String optString = gVar2.optString("device_sn", "");
            kotlin.jvm.internal.o.f(optString, "optString(...)");
            java.lang.String optString2 = gVar2.optString("device_signature", "");
            kotlin.jvm.internal.o.f(optString2, "optString(...)");
            if (com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                qVar.fj(0, 4);
                return;
            }
            if (gm0.j1.d().f70764d == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosServiceImpl", "dispatcher null");
                qVar.fj(0, 6);
                return;
            }
            kotlin.jvm.internal.o.d(string2);
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.GetIlinkDeviceOauthTicketHelper", "setAuthInfo productId:" + optInt + " deviceSn:" + optString + " deviceId:" + string2 + " deviceSignature:" + optString2);
            r45.eh3 eh3Var = new r45.eh3();
            r45.fy3 fy3Var = new r45.fy3();
            fy3Var.f374729g = optInt2;
            try {
                gVar = new com.tencent.mm.protobuf.g(android.util.Base64.decode(optString2, 0));
            } catch (java.lang.IllegalArgumentException unused) {
                gVar = null;
            }
            fy3Var.f374728f = gVar;
            fy3Var.f374727e = optString;
            fy3Var.f374726d = optInt;
            eh3Var.f373479d = fy3Var;
            int length = string2.length();
            int i17 = length / 2;
            byte[] bArr = new byte[i17];
            for (int i18 = 0; i18 < length; i18 += 2) {
                bArr[i18 / 2] = (byte) ((java.lang.Character.digit(string2.charAt(i18), 16) << 4) + java.lang.Character.digit(string2.charAt(i18 + 1), 16));
            }
            eh3Var.f373480e = new com.tencent.mm.protobuf.g(bArr, 0, i17);
            kotlinx.coroutines.l.d(qVar.f332823f, null, null, new my3.h(eh3Var, qVar, this.f332815e, null), 3, null);
        } catch (java.lang.Exception unused2) {
            qVar.fj(0, 5);
        }
    }
}
