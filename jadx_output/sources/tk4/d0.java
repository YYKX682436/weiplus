package tk4;

/* loaded from: classes9.dex */
public final class d0 extends com.tencent.mm.modelbase.i {
    public d0(int i17, bw5.y40 y40Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        bw5.z40 z40Var = new bw5.z40();
        z40Var.f35814d = i17;
        boolean[] zArr = z40Var.f35817g;
        zArr[2] = true;
        if (y40Var != null) {
            z40Var.f35816f = y40Var;
            zArr[4] = true;
        }
        byte[] byteArray = z40Var.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        lVar.f70664a = new qk.s9(byteArray);
        lVar.f70665b = new qk.t9();
        lVar.f70666c = "/cgi-bin/mmlistenappsvr/listenaudiopush";
        lVar.f70667d = 11313;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.TingGetAudioPushCGI", "MMListenAudioPushRequese scene: " + i17);
    }
}
