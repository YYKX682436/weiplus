package jp3;

/* loaded from: classes14.dex */
public final class k implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.palm.ui.PalmPrintMainUI f301011d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f301012e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f301013f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f301014g;

    /* renamed from: h, reason: collision with root package name */
    public kp3.h f301015h;

    /* renamed from: i, reason: collision with root package name */
    public kp3.g f301016i;

    public k(com.tencent.mm.plugin.palm.ui.PalmPrintMainUI activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f301011d = activity;
        this.f301012e = "";
        this.f301013f = "";
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    public final dn.m a(java.lang.String str) {
        dn.m mVar = new dn.m();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime());
        sb6.append(", ");
        sb6.append(str);
        byte[] bytes = sb6.toString().getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        mVar.field_mediaId = kk.k.g(bytes);
        mVar.field_fullpath = str;
        mVar.field_thumbpath = "";
        mVar.field_fileType = 5;
        mVar.field_talker = "";
        mVar.field_priority = 2;
        mVar.field_needStorage = false;
        mVar.field_isStreamMedia = false;
        mVar.field_appType = 1;
        mVar.field_bzScene = 0;
        mVar.field_largesvideo = 0;
        mVar.f241789h = 5;
        return mVar;
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        byte[] bArr;
        com.tencent.youtu.YTBizPalmRegister.ImageDataResult imageDataResult;
        com.tencent.youtu.YTBizPalmRegister.ImageDataResult imageDataResult2;
        com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintLogic", "[cdnCallback] mediaId:" + str + "，startRet:" + i17 + "，proginfo:" + gVar + "，res:" + hVar);
        if (i17 == -21005) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PalmPrintLogic", "[cdnCallback] failed，repeated request, this mediaID is uploading");
            return 0;
        }
        jp3.g gVar2 = jp3.g.f301000a;
        com.tencent.mm.plugin.palm.ui.PalmPrintMainUI palmPrintMainUI = this.f301011d;
        if (hVar == null || hVar.field_retCode != 0 || !kotlin.jvm.internal.o.b(this.f301012e, str)) {
            if (i17 != 0) {
                jp3.t.f301029a.e(this.f301012e, hVar != null ? hVar.field_fileId : null, palmPrintMainUI.f152873f, java.lang.Integer.valueOf(i17), hVar != null ? java.lang.Long.valueOf(hVar.field_fileLength) : null);
                com.tencent.mars.xlog.Log.e("MicroMsg.PalmPrintLogic", "[cdnCallback] failed：startRet != 0");
                gVar2.a(this.f301013f);
                com.tencent.mm.plugin.palm.ui.PalmPrintMainUI palmPrintMainUI2 = this.f301011d;
                gVar2.i(palmPrintMainUI2, 80042, "ERR_PALM_CDN_UPLOAD", palmPrintMainUI2.U6() ? this.f301015h : null, palmPrintMainUI.U6() ? this.f301016i : null);
            }
            return 0;
        }
        jp3.t tVar = jp3.t.f301029a;
        tVar.e(this.f301012e, hVar.field_fileId, palmPrintMainUI.f152873f, 0, java.lang.Long.valueOf(hVar.field_fileLength));
        com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintLogic", "[cdnCallback] success, do check palm result");
        gVar2.a(this.f301013f);
        java.lang.String str2 = hVar.field_fileId;
        java.lang.String str3 = hVar.field_aesKey;
        kp3.h hVar2 = this.f301015h;
        java.lang.String str4 = (hVar2 == null || (imageDataResult2 = hVar2.f310993b) == null) ? null : imageDataResult2.md5Hex;
        java.lang.String str5 = str4 == null ? "" : str4;
        java.lang.String str6 = (hVar2 == null || (imageDataResult = hVar2.f310994c) == null) ? null : imageDataResult.md5Hex;
        java.lang.String str7 = str6 == null ? "" : str6;
        kp3.g gVar3 = this.f301016i;
        java.lang.String str8 = gVar3 != null ? gVar3.f310990b : null;
        if (str3 != null) {
            bArr = str3.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bArr, "getBytes(...)");
        } else {
            bArr = null;
        }
        java.lang.String f17 = gVar2.f(bArr, "0425f42ebcd1f19badf9b41753227383721e2df2a36b36420cda9b46d9f9c72f6025b2bc388defa7cb1c6482b156e7c9c44ffdd5a16a82f007e1e929a178769554");
        java.lang.String f18 = gVar2.f(this.f301014g, "0425f42ebcd1f19badf9b41753227383721e2df2a36b36420cda9b46d9f9c72f6025b2bc388defa7cb1c6482b156e7c9c44ffdd5a16a82f007e1e929a178769554");
        if (!(f17.length() == 0)) {
            if (!(f18.length() == 0)) {
                tVar.d("checkpalmuseronlineopenresource");
                pq5.g l17 = new ip3.a(palmPrintMainUI.f152873f, f17, f18, str2, palmPrintMainUI.f152880p, str5, str7, str8).l();
                l17.f(palmPrintMainUI);
                l17.K(new jp3.h(this));
                return 0;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.PalmPrintLogic", "[doCheckPalmResult] error, encrypt key failed. encryptedCdnKey.len:" + f17.length() + "，encryptedPalmFileKey.len:" + f18.length());
        gVar2.i(palmPrintMainUI, 80044, "ERR_PALM_KEY_ENCRYPT_FAIL", palmPrintMainUI.U6() ? this.f301015h : null, palmPrintMainUI.U6() ? this.f301016i : null);
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
