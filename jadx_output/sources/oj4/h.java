package oj4;

/* loaded from: classes11.dex */
public final class h extends com.tencent.mm.sdk.platformtools.n3 {
    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Object obj = msg.obj;
        if (obj instanceof pj4.g2) {
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusPostInfo");
            pj4.g2 g2Var = (pj4.g2) obj;
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.UploadManager", "retryHandler " + oj4.j.f345815a.a(g2Var));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(g2Var.f355071p)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.TextStatus.UploadManager", "business fial " + g2Var.f355071p);
                return;
            }
            if (g2Var.f355070o) {
                if (g2Var.f355068m > 3) {
                    ai4.m0.f5173a.H(5, en1.a.a(), g2Var.f355062d.f354982q);
                    return;
                }
            } else if (g2Var.f355067i > 5) {
                ai4.m0.f5173a.H(5, en1.a.a(), g2Var.f355062d.f354982q);
                return;
            }
            if (c01.id.e() - g2Var.f355062d.f354982q > 1800) {
                com.tencent.mars.xlog.Log.w("MicroMsg.TextStatus.UploadManager", "exceed 30min to fial");
                ai4.m0.f5173a.H(5, en1.a.a(), g2Var.f355062d.f354982q);
            } else {
                ((ku5.t0) ku5.t0.f312615d).h(new oj4.k(g2Var), "MicroMsg.TextStatus.UploadPackHelper");
            }
        }
    }
}
