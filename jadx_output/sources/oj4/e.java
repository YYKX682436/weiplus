package oj4;

/* loaded from: classes11.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final oj4.e f345811d = new oj4.e();

    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList<pj4.g2> linkedList;
        byte[] j17;
        oj4.j jVar = oj4.j.f345815a;
        pj4.f2 f2Var = new pj4.f2();
        com.tencent.mm.sdk.platformtools.o4 c17 = jVar.c();
        jz5.f0 f0Var = null;
        if (c17 == null || (j17 = c17.j("upload_cache_array")) == null) {
            linkedList = null;
        } else {
            f2Var.parseFrom(j17);
            linkedList = f2Var.f355044d;
        }
        if (linkedList != null) {
            for (pj4.g2 g2Var : linkedList) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doCheck: LastUploadTask:");
                oj4.j jVar2 = oj4.j.f345815a;
                sb6.append(jVar2.a(g2Var));
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.UploadManager", sb6.toString());
                si4.a G = ai4.m0.f5173a.G();
                java.lang.String text_status_id = g2Var.f355073r;
                kotlin.jvm.internal.o.f(text_status_id, "text_status_id");
                mj4.h t17 = G.t(text_status_id);
                if (t17 != null) {
                    mj4.a aVar = ((mj4.k) t17).f327067b;
                    if (aVar.field_CreateTime > g2Var.f355062d.f354982q) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.TextStatus.UploadManager", "doCheck, last item is new.(cur:" + aVar.field_CreateTime + ", new:" + g2Var.f355062d.f354982q + ')');
                        java.lang.String str = g2Var.f355072q;
                        if (str != null) {
                            ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Bi(8, "StatusTextPost_".concat(str), pj4.h2.class, new qj4.o(str, 6L, "", ""));
                            f0Var = jz5.f0.f302826a;
                        }
                        if (f0Var == null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.tsReport", "postReport: cliPostID is null");
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.UploadManager", "clearUploadTask: ");
                        return;
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.UploadManager", "trigger upload last post");
                jVar2.f(g2Var);
            }
        }
    }
}
