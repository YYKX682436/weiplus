package oj4;

/* loaded from: classes11.dex */
public final class m implements oj4.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f345819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oj4.n f345820b;

    public m(long j17, oj4.n nVar) {
        this.f345819a = j17;
        this.f345820b = nVar;
    }

    public void a(int i17, boolean z17, dn.h hVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUploadEnd cost");
        sb6.append(java.lang.System.currentTimeMillis() - this.f345819a);
        sb6.append(".errorCode");
        sb6.append(i17);
        sb6.append(",isOk");
        sb6.append(z17);
        sb6.append(",mediaType");
        oj4.n nVar = this.f345820b;
        pj4.b0 b0Var = nVar.f345821a.f355062d;
        jz5.f0 f0Var = null;
        sb6.append(b0Var != null ? java.lang.Integer.valueOf(b0Var.f354974f) : null);
        sb6.append(",sceneResult");
        sb6.append(hVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.UploadTask", sb6.toString());
        pj4.g2 postInfo = nVar.f345821a;
        if (z17 && hVar != null) {
            java.lang.String str = hVar.field_fileUrl;
            if (!(str == null || r26.n0.N(str))) {
                java.lang.String str2 = hVar.field_thumbUrl;
                if (!(str2 == null || r26.n0.N(str2))) {
                    pj4.b0 b0Var2 = postInfo.f355062d;
                    b0Var2.f354976h = hVar.field_fileUrl;
                    b0Var2.f354978m = hVar.field_thumbUrl;
                    pm0.v.X(new oj4.a(new oj4.b(postInfo)));
                    return;
                }
            }
        }
        oj4.j jVar = oj4.j.f345815a;
        kotlin.jvm.internal.o.g(postInfo, "postInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.UploadManager", "makeCdnFail " + jVar.a(postInfo));
        postInfo.f355067i = postInfo.f355067i + 1;
        jVar.g(postInfo);
        java.lang.String str3 = postInfo.f355072q;
        if (str3 != null) {
            ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Bi(8, "StatusTextPost_".concat(str3), pj4.h2.class, new qj4.o(str3, 2L, "", ""));
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.tsReport", "postReport: cliPostID is null");
        }
        jVar.f(postInfo);
    }
}
