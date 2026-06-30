package rh2;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final rh2.j f395654a = new rh2.j();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f395655b = kz5.c0.i(new jz5.l("live_ai_assistran_kws_engine_for_android", "libDecoderOff_DNN_arm64.so"), new jz5.l("live_ai_assistrant_kws_so", "libkws_jni.so"), new jz5.l("live_ai_assistant_kws_model", "libwxvoiceembed_bin_zhibo_iter06"));

    public final void a(com.tencent.mm.udr.e0 e0Var) {
        java.lang.String path;
        java.lang.String c17;
        for (jz5.l lVar : f395655b) {
            java.lang.String str = (java.lang.String) lVar.f302833d;
            java.lang.String str2 = (java.lang.String) lVar.f302834e;
            com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) e0Var).Ui("ilinkres_4e2919fe", str);
            if (Ui != null && (path = Ui.getPath()) != null && (c17 = Ui.c()) != null) {
                java.lang.String str3 = c17 + '/' + str2;
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str3);
                if (!r6Var.m() || r6Var.C() <= 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.KWSResourceLoader", "[ensurePostPath] copying " + str + " -> " + str3);
                    com.tencent.mm.vfs.w6.u(c17);
                    try {
                        com.tencent.mm.vfs.w6.c(path, str3);
                        if (!r6Var.m() || r6Var.C() <= 0) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.KWSResourceLoader", "[ensurePostPath] copy result missing/empty: ".concat(str));
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.KWSResourceLoader", "[ensurePostPath] ready " + str + ", size=" + r6Var.C());
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.KWSResourceLoader", "[ensurePostPath] copyFile threw: " + str + " -> " + str3 + ": " + e17.getMessage());
                    }
                }
            }
        }
    }
}
