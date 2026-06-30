package oj4;

/* loaded from: classes11.dex */
public final class b implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final pj4.g2 f345808d;

    /* renamed from: e, reason: collision with root package name */
    public long f345809e;

    public b(pj4.g2 postInfo) {
        kotlin.jvm.internal.o.g(postInfo, "postInfo");
        this.f345808d = postInfo;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.PostTask", "[doPost] end cost:" + (java.lang.System.currentTimeMillis() - this.f345809e) + ",errType" + i17 + ",errCode" + i18 + ", errMsg=" + str);
        gm0.j1.d().q(5293, this);
        if (i17 == 0 && i18 == 0) {
            return;
        }
        java.lang.String r17 = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.jx_);
        oj4.j jVar = oj4.j.f345815a;
        pj4.g2 postInfo = this.f345808d;
        kotlin.jvm.internal.o.g(postInfo, "postInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.UploadManager", "makeCgiFail " + jVar.a(postInfo));
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(r17);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (K0) {
            postInfo.f355068m++;
            jVar.g(postInfo);
            java.lang.String str2 = postInfo.f355072q;
            if (str2 != null) {
                ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Bi(8, "StatusTextPost_".concat(str2), pj4.h2.class, new qj4.o(str2, 2L, "", ""));
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.tsReport", "postReport: cliPostID is null");
            }
            jVar.f(postInfo);
            return;
        }
        postInfo.f355071p = r17;
        jVar.g(postInfo);
        ai4.m0.f5173a.H(6, en1.a.a(), postInfo.f355062d.f354982q);
        java.lang.String str3 = postInfo.f355072q;
        if (str3 != null) {
            ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Bi(8, "StatusTextPost_".concat(str3), pj4.h2.class, new qj4.o(str3, 5L, "", ""));
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.tsReport", "postReport: cliPostID is null");
        }
    }
}
