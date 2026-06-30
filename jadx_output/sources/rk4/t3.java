package rk4;

/* loaded from: classes2.dex */
public final class t3 extends com.tencent.mm.modelbase.i {
    public t3(java.lang.String listenId) {
        kotlin.jvm.internal.o.g(listenId, "listenId");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        bw5.x70 x70Var = new bw5.x70();
        x70Var.f34985d.add(listenId);
        x70Var.f34994p[2] = true;
        byte[] byteArray = x70Var.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        lVar.f70664a = new qk.s9(byteArray);
        lVar.f70665b = new qk.t9();
        lVar.f70666c = "/cgi-bin/mmlistenappsvr/listenitem";
        lVar.f70667d = 8167;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("TingFlutterPluginHelperImpl", "getListenItemCGI listenId: ".concat(listenId));
    }
}
