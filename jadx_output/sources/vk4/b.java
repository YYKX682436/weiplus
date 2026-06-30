package vk4;

/* loaded from: classes2.dex */
public final class b extends com.tencent.mm.modelbase.i {
    public b(bw5.v70 listenItem, bw5.ar0 scene) {
        kotlin.jvm.internal.o.g(listenItem, "listenItem");
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        bw5.g40 g40Var = new bw5.g40();
        g40Var.f27676d = 2;
        boolean[] zArr = g40Var.f27684o;
        zArr[7] = true;
        g40Var.f27682m = scene.f25422d;
        zArr[8] = true;
        g40Var.f27677e = listenItem;
        zArr[2] = true;
        g40Var.f27680h = false;
        zArr[4] = true;
        byte[] byteArray = g40Var.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        lVar.f70664a = new qk.s9(byteArray);
        lVar.f70665b = new qk.t9();
        lVar.f70666c = "/cgi-bin/mmlistenappsvr/listenaddtoplaylist";
        lVar.f70667d = 10585;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.TingAddToPlayListCGI", "addToPlayListCgi request listenType: " + listenItem.f34189e + ", listenId: " + listenItem.getListenId() + ", scene: " + scene);
    }
}
