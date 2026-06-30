package wb3;

/* loaded from: classes8.dex */
public class c extends com.tencent.mm.wallet_core.model.h1 {
    public c(java.lang.String str, java.lang.String str2, int i17, int i18) {
        r45.t43 t43Var = new r45.t43();
        t43Var.f386133d = str;
        t43Var.f386134e = str2;
        t43Var.f386137h = i17;
        t43Var.f386138i = i18;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(c01.z1.r(), true);
        if (n17 != null) {
            t43Var.f386135f = n17.x3();
            t43Var.f386136g = n17.v3();
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = t43Var;
        lVar.f70665b = new r45.u43();
        lVar.f70667d = 4787;
        lVar.f70666c = "/cgi-bin/mmpay-bin/foreignhbreceive";
        com.tencent.mm.modelbase.o a17 = lVar.a();
        a17.setIsUserCmd(true);
        p(a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiHKHbReceive", "nativeUrl: %s, sendId: %s", str, str2);
    }
}
