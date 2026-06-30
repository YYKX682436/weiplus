package rk4;

/* loaded from: classes2.dex */
public final class i extends com.tencent.mm.modelbase.i {
    public i(java.lang.String categoryId) {
        kotlin.jvm.internal.o.g(categoryId, "categoryId");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        bw5.d50 d50Var = new bw5.d50();
        d50Var.f26328e = categoryId;
        d50Var.f26336p[4] = true;
        byte[] byteArray = d50Var.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        lVar.f70664a = new qk.s9(byteArray);
        lVar.f70665b = new qk.t9();
        lVar.f70666c = "/cgi-bin/mmlistenappsvr/listencategories";
        lVar.f70667d = 6264;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("TingFlutterPluginHelperImpl", "getListenCategoriesCGI categoryId: ".concat(categoryId));
    }
}
