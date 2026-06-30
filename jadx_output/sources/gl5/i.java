package gl5;

/* loaded from: classes5.dex */
public abstract class i {
    public static boolean a(java.lang.String str, android.os.Bundle bundle, fl5.e eVar) {
        android.net.Uri uri;
        if (!com.tencent.mm.sdk.platformtools.t8.D0(str, "com.sogou.inputmethod.exp.commit") || bundle == null || (uri = (android.net.Uri) bundle.getParcelable("EXP_PATH_URI")) == null || eVar == null) {
            return false;
        }
        com.tencent.mm.ui.chatting.component.lk lkVar = (com.tencent.mm.ui.chatting.component.lk) ((sb5.w1) ((com.tencent.mm.pluginsdk.ui.chat.h1) eVar).f190339a.f189955a3.a().f460708c.a(sb5.w1.class));
        lkVar.getClass();
        com.tencent.mm.vfs.z7 z7Var = new com.tencent.mm.vfs.z7(uri);
        java.lang.String str2 = z7Var.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                z7Var = new com.tencent.mm.vfs.z7(z7Var.f213277d, z7Var.f213278e, l17, z7Var.f213280g, z7Var.f213281h);
            }
        }
        return lkVar.p0(z7Var.toString()).f199861a;
    }
}
