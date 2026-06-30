package wb3;

/* loaded from: classes8.dex */
public class a extends com.tencent.mm.wallet_core.model.h1 {
    public a(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27) {
        r45.o43 o43Var = new r45.o43();
        o43Var.f381898d = str;
        o43Var.f381901g = str2;
        o43Var.f381899e = i17;
        o43Var.f381900f = i18;
        o43Var.f381902h = i19;
        o43Var.f381903i = i27;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = o43Var;
        lVar.f70665b = new r45.p43();
        lVar.f70667d = 4889;
        lVar.f70666c = "/cgi-bin/mmpay-bin/foreignhbdetail";
        com.tencent.mm.modelbase.o a17 = lVar.a();
        a17.setIsUserCmd(true);
        p(a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiHKHbDetail", "nativeurl: %s, sendid: %s, limit: %s, offset: %s, scene: %s", str, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i27));
    }
}
