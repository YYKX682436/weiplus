package wr;

/* loaded from: classes4.dex */
public final class a implements com.tencent.mars.cdn.CdnManager.DownloadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wr.b f448727d;

    public a(wr.b bVar) {
        this.f448727d = bVar;
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onC2CDownloadCompleted(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult) {
        byte[] bArr;
        jz5.f0 f0Var;
        byte[] bArr2;
        boolean z17 = c2CDownloadResult != null && c2CDownloadResult.errorCode == 0;
        wr.b bVar = this.f448727d;
        if (!z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("failed to download thumb. id: ");
            sb6.append(bVar.b());
            sb6.append(", error code: ");
            sb6.append(c2CDownloadResult != null ? java.lang.Integer.valueOf(c2CDownloadResult.errorCode) : null);
            com.tencent.mars.xlog.Log.e("EmoticonThumbImageCdnDownloader", sb6.toString());
            bVar.a();
            return;
        }
        com.tencent.mars.xlog.Log.i("EmoticonThumbImageCdnDownloader", "succeeded in downloading thumb. id: " + bVar.b());
        java.lang.String str2 = bVar.f448731d;
        if (!com.tencent.mm.vfs.w6.j(str2)) {
            com.tencent.mars.xlog.Log.e("EmoticonThumbImageCdnDownloader", "download ok but file not exist for thumb. id: " + bVar.b());
            bVar.a();
            return;
        }
        java.lang.String key = bVar.f448730c;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(key);
        yz5.p pVar = bVar.f448732e;
        if (K0) {
            com.tencent.mars.xlog.Log.i("EmoticonThumbImageCdnDownloader", "no need to decrypt since input aeskey is empty");
            if (pVar != null) {
                pVar.invoke(bVar.b(), java.lang.Boolean.TRUE);
                return;
            }
            return;
        }
        byte[] N = com.tencent.mm.vfs.w6.N(str2, 0, -1);
        kk.a aVar = kk.a.f308464a;
        kotlin.jvm.internal.o.d(N);
        kotlin.jvm.internal.o.g(key, "key");
        try {
            if (key.length() < 1) {
                bArr2 = null;
            } else {
                bArr2 = new byte[key.length() / 2];
                for (int i17 = 0; i17 < key.length() / 2; i17++) {
                    int i18 = i17 * 2;
                    int i19 = i18 + 1;
                    bArr2[i17] = (byte) ((java.lang.Integer.parseInt(key.substring(i18, i19), 16) * 16) + java.lang.Integer.parseInt(key.substring(i19, i18 + 2), 16));
                }
            }
            kotlin.jvm.internal.o.d(bArr2);
            bArr = aVar.a(N, bArr2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("AESGCMUtils", e17, "failed to decypt aes-gcm-128 data. " + e17.getMessage(), new java.lang.Object[0]);
            bArr = null;
        }
        com.tencent.mm.vfs.w6.h(str2);
        if (bArr != null) {
            if (true ^ (bArr.length == 0)) {
                com.tencent.mars.xlog.Log.i("EmoticonThumbImageCdnDownloader", "decypt downloaded thumb ok. id: " + bVar.b());
                com.tencent.mm.vfs.w6.S(str2, bArr, 0, bArr.length);
                if (pVar != null) {
                    pVar.invoke(bVar.b(), java.lang.Boolean.TRUE);
                    return;
                }
                return;
            }
            com.tencent.mars.xlog.Log.e("EmoticonThumbImageCdnDownloader", "decypt downloaded thumb failed. id: " + bVar.b());
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("EmoticonThumbImageCdnDownloader", "decypt downloaded thumb failed. id: " + bVar.b());
        }
        bVar.a();
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onDownloadProgressChanged(java.lang.String str, long j17, long j18, boolean z17) {
    }
}
