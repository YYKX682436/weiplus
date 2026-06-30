package ea2;

/* loaded from: classes2.dex */
public final class g {
    public g(kotlin.jvm.internal.i iVar) {
    }

    public static void b(ea2.g gVar, android.content.Context context, java.lang.String username, java.lang.String str, int i17, java.lang.Object obj) {
        java.lang.String kv6 = (i17 & 4) != 0 ? "" : str;
        gVar.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(kv6, "kv");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", username);
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        intent.putExtra("key_udf_kv", kv6);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        intent.putExtra("key_enter_profile_tab", ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.I2).getValue()).r()).intValue() == 1 ? 6 : 5);
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, context, intent, 0L, null, 0, 1, false, 0, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(context, intent);
    }

    public final void a(android.content.Context context, r45.iw2 singerInfo) {
        java.lang.String str;
        java.lang.String string;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(singerInfo, "singerInfo");
        r45.sd1 sd1Var = (r45.sd1) singerInfo.getCustom(4);
        java.lang.String string2 = sd1Var != null ? sd1Var.getString(0) : null;
        android.os.Bundle bundle = new android.os.Bundle();
        r45.sd1 sd1Var2 = (r45.sd1) singerInfo.getCustom(4);
        java.lang.String str2 = "";
        if (sd1Var2 == null || (str = sd1Var2.getString(1)) == null) {
            str = "";
        }
        r45.sd1 sd1Var3 = (r45.sd1) singerInfo.getCustom(4);
        if (sd1Var3 != null && (string = sd1Var3.getString(2)) != null) {
            str2 = string;
        }
        bundle.putString("appId", string2);
        bundle.putString("query", str2);
        bundle.putInt("nextAnimIn", com.tencent.mm.R.anim.f477886ea);
        bundle.putInt("currentAnimOut", com.tencent.mm.R.anim.f477889ed);
        com.tencent.mars.xlog.Log.i("FinderMusicTopicHeaderUIC", "OpenLiteApp: " + string2 + ", page:" + str + " query:" + str2);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f460472a;
        java.lang.String string3 = singerInfo.getString(2);
        if (e1Var.L(context, bundle, !(string3 == null || string3.length() == 0), new ea2.f(string2, context, singerInfo))) {
            return;
        }
        java.lang.String string4 = singerInfo.getString(2);
        if (string4 == null || string4.length() == 0) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", string4);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
