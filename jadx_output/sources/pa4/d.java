package pa4;

/* loaded from: classes4.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f353021f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353022g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353023h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pa4.e f353024i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f353025m;

    public d(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, pa4.e eVar, int i18) {
        this.f353019d = str;
        this.f353020e = str2;
        this.f353021f = i17;
        this.f353022g = str3;
        this.f353023h = str4;
        this.f353024i = eVar;
        this.f353025m = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        int queryQuality;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$onPostScene$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("upload ok ");
        java.lang.String str2 = this.f353019d;
        sb6.append(str2);
        sb6.append("  ");
        java.lang.String str3 = this.f353020e;
        sb6.append(str3);
        sb6.append("  ");
        int i17 = this.f353021f;
        sb6.append(i17);
        sb6.append(" thumbUrl: ");
        java.lang.String str4 = this.f353022g;
        sb6.append(str4);
        sb6.append(" md5: ");
        java.lang.String str5 = this.f353023h;
        sb6.append(str5);
        sb6.append(" thread: ");
        sb6.append(java.lang.Thread.currentThread().getName());
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoImgUpload", sb6.toString());
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        pa4.e eVar = this.f353024i;
        com.tencent.mm.sdk.platformtools.x.J(pa4.e.I(eVar), options);
        java.lang.String str6 = options.outMimeType;
        if (str6 != null) {
            java.util.Locale locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.o.f(locale, "getDefault(...)");
            str = str6.toLowerCase(locale);
            kotlin.jvm.internal.o.f(str, "toLowerCase(...)");
        } else {
            str = "";
        }
        if ((!r26.i0.n(str, "jpg", false) && !r26.i0.n(str, "jpeg", false)) || (queryQuality = com.tencent.mm.sdk.platformtools.MMNativeJpeg.queryQuality(pa4.e.I(eVar))) == 0) {
            queryQuality = -1;
        }
        com.tencent.mm.plugin.sns.statistics.r.e(pa4.e.I(eVar), this.f353019d, options.outMimeType, options.outWidth, options.outHeight, queryQuality, com.tencent.mm.vfs.w6.k(pa4.e.I(eVar)));
        pa4.e.J(eVar).k(str3);
        r45.cj4 cj4Var = new r45.cj4();
        cj4Var.f371596e = i17;
        cj4Var.f371595d = str2;
        pa4.e.K(eVar).f380566g = cj4Var;
        pa4.e.K(eVar).f380570n = 0;
        pa4.e.K(eVar).f380579w = str5;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            r45.cj4 cj4Var2 = new r45.cj4();
            cj4Var2.f371596e = this.f353025m;
            cj4Var2.f371595d = str4;
            pa4.e.K(eVar).f380568i.add(cj4Var2);
        }
        try {
            pa4.e.J(eVar).m(pa4.e.K(eVar).toByteArray());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsLivePhotoImgUpload", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getUploadCallback$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getUploadCallback$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        ((pa4.i) eVar.f353028f).a(true, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$onPostScene$1");
    }
}
