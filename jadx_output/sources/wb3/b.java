package wb3;

/* loaded from: classes9.dex */
public class b extends com.tencent.mm.wallet_core.model.h1 {
    public b(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.String str4) {
        r45.q43 q43Var = new r45.q43();
        q43Var.f383668d = str;
        q43Var.f383669e = str2;
        q43Var.f383670f = str3;
        q43Var.f383674m = i17;
        q43Var.f383675n = i18;
        q43Var.f383673i = str4;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(c01.z1.r(), true);
        if (n17 != null) {
            q43Var.f383671g = n17.x3();
            q43Var.f383672h = n17.v3();
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = q43Var;
        lVar.f70665b = new r45.r43();
        lVar.f70667d = 4583;
        lVar.f70666c = "/cgi-bin/mmpay-bin/foreignhbopen";
        com.tencent.mm.modelbase.o a17 = lVar.a();
        a17.setIsUserCmd(true);
        p(a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiHKHbOpen", "nativeUrl: %s, sendId: %s, username: %s", str, str2, str3);
    }
}
