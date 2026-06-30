package vk4;

/* loaded from: classes2.dex */
public final class c extends com.tencent.mm.modelbase.i {
    public c(bw5.v70 listenItem) {
        kotlin.jvm.internal.o.g(listenItem, "listenItem");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        bw5.x70 x70Var = new bw5.x70();
        x70Var.f34991m = listenItem;
        boolean[] zArr = x70Var.f34994p;
        zArr[8] = true;
        x70Var.f34986e = 2;
        zArr[3] = true;
        byte[] byteArray = x70Var.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        lVar.f70664a = new qk.s9(byteArray);
        lVar.f70665b = new qk.t9();
        lVar.f70666c = "/cgi-bin/mmlistenappsvr/listenitem";
        lVar.f70667d = 8167;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.TingFetchListenItemCGI", "fetchListenItem listenId: " + listenItem.getListenId() + ", title: " + listenItem.getTitle());
    }
}
