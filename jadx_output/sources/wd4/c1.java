package wd4;

/* loaded from: classes9.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wd4.l1 f444881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f444882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f444883f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f444884g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(wd4.l1 l1Var, boolean z17, r45.jj4 jj4Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        super(1);
        this.f444881d = l1Var;
        this.f444882e = z17;
        this.f444883f = jj4Var;
        this.f444884g = snsInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String imagePath;
        android.graphics.Bitmap i07;
        jd5.c cVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$addQuickShare$1");
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$addQuickShare$1");
        wd4.l1 l1Var = this.f444881d;
        boolean z17 = l1Var.c() instanceof androidx.appcompat.app.AppCompatActivity;
        r45.jj4 media = this.f444883f;
        boolean z18 = this.f444882e;
        if (z17) {
            ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f444884g;
            if (!z18) {
                jd5.c cVar2 = new jd5.c();
                wd4.z0 z0Var = wd4.l1.f444950g;
                java.lang.String localid = snsInfo.getLocalid();
                kotlin.jvm.internal.o.f(localid, "getLocalid(...)");
                jz5.l b17 = z0Var.b(media, localid);
                java.lang.String str2 = (java.lang.String) b17.f302833d;
                java.lang.String str3 = (java.lang.String) b17.f302834e;
                com.tencent.mars.xlog.Log.i("MicroMsg.ShareSheet", "pathResult imgPath: " + str2 + " fullPath: " + str3);
                if (!(str2 == null || str2.length() == 0)) {
                    if (((str3 == null || str3.length() == 0) ? 1 : 0) == 0) {
                        cVar2.q(ca4.z0.S(str3));
                        cVar2.o(str2);
                        cVar2.r(str3);
                        java.lang.String localid2 = snsInfo.getLocalid();
                        kotlin.jvm.internal.o.f(localid2, "getLocalid(...)");
                        cVar2.set(cVar2.f43702d + 4, localid2);
                        cVar = cVar2;
                    }
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.ShareSheet", "path is invalid");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$addQuickShare$1");
                jz5.f0 f0Var = jz5.f0.f302826a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$addQuickShare$1");
                return f0Var;
            }
            jd5.a aVar = new jd5.a();
            java.lang.String l17 = com.tencent.mm.plugin.sns.model.i1.l(media);
            kotlin.jvm.internal.o.f(l17, "getExistSnsDirectPath(...)");
            aVar.p(l17);
            java.lang.String localid3 = snsInfo.getLocalid();
            kotlin.jvm.internal.o.f(localid3, "getLocalid(...)");
            aVar.set(aVar.f43702d + 4, localid3);
            cVar = aVar;
            n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
            android.app.Activity c17 = l1Var.c();
            wd4.a1 a1Var = new wd4.a1(this.f444881d, this.f444884g, str, this.f444882e, this.f444883f);
            n13.t tVar = new n13.t();
            tVar.f334133a = a1Var;
            tVar.f334138f.f334139a = 7;
            ((dk5.y) a0Var).wi(c17, cVar, str, tVar);
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
            kotlin.jvm.internal.o.g(media, "media");
            if (z18) {
                imagePath = com.tencent.mm.plugin.sns.model.i1.l(media);
                kotlin.jvm.internal.o.d(imagePath);
            } else {
                java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), media.f377855d);
                kotlin.jvm.internal.o.f(d17, "getMediaFilePath(...)");
                java.lang.String R = ca4.z0.R(media);
                kotlin.jvm.internal.o.f(R, "getSnsSightName(...)");
                if (com.tencent.mm.vfs.w6.j(d17.concat(R))) {
                    imagePath = d17 + ca4.z0.U(media);
                } else {
                    imagePath = "";
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
            if (z18) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getThumbBitmap", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
                kotlin.jvm.internal.o.g(imagePath, "path");
                if (com.tencent.mm.sdk.platformtools.t8.K0(imagePath)) {
                    i07 = null;
                } else {
                    i07 = com.tencent.mm.sdk.platformtools.x.w0(com.tencent.mm.sdk.platformtools.x.j0(imagePath, 140, 140, i65.a.g(com.tencent.mm.sdk.platformtools.x2.f193071a)), com.tencent.mm.compatible.util.Exif.fromFile(imagePath).getOrientationInDegree() >= 0 ? r5 : 0);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getThumbBitmap", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoThumb", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
                kotlin.jvm.internal.o.g(imagePath, "imagePath");
                i07 = com.tencent.mm.sdk.platformtools.x.i0(imagePath);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoThumb", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
            }
            ((r35.k1) ((o25.q1) i95.n0.c(o25.q1.class))).Ni(l1Var.c(), str, i07, l1Var.c().getString(com.tencent.mm.R.string.f490551ya), z18 ? 3 : 2, new wd4.b1(this.f444881d, this.f444884g, str, this.f444882e, this.f444883f)).show();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$addQuickShare$1");
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$addQuickShare$1");
        return f0Var2;
    }
}
