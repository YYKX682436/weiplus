package k71;

/* loaded from: classes14.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final k71.l f304692a = new k71.l();

    public static final void a(k71.l lVar, androidx.appcompat.app.AppCompatActivity appCompatActivity, int i17, int i18) {
        java.lang.String str;
        lVar.getClass();
        k71.m mVar = k71.m.f304693f;
        if (i17 == 5001) {
            lVar.c(appCompatActivity, appCompatActivity.getString(com.tencent.mm.R.string.l8n) + com.tencent.mm.sdk.platformtools.m2.d());
            lVar.d(i18);
            v61.d.g("security_center_login", i18);
            return;
        }
        if (i17 == 5002) {
            lVar.c(appCompatActivity, appCompatActivity.getString(com.tencent.mm.R.string.l8k) + com.tencent.mm.sdk.platformtools.m2.d());
            lVar.d(i18);
            return;
        }
        if (i17 != 5004) {
            if (i17 == 5005) {
                com.tencent.mm.plugin.account.ui.GateWayMobileUI.f73277p.a(appCompatActivity, new android.content.Intent(appCompatActivity, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.class));
                lVar.d(i18);
                v61.d.g("register_account", i18);
                return;
            }
            if (i17 == 7012) {
                java.lang.String string = appCompatActivity.getString(com.tencent.mm.R.string.ff_, com.tencent.mm.sdk.platformtools.m2.d());
                kotlin.jvm.internal.o.f(string, "getString(...)");
                lVar.c(appCompatActivity, string);
                v61.d.g("frozen_account_login", i18);
                lVar.d(i18);
                return;
            }
            return;
        }
        java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
        java.lang.String str2 = wo.w0.k() + '_' + java.lang.System.currentTimeMillis();
        java.lang.String e17 = com.tencent.mm.sdk.platformtools.m2.e();
        u11.a a17 = u11.b.a(e17);
        if (a17 != null) {
            java.lang.String countryName = a17.f423729c;
            kotlin.jvm.internal.o.f(countryName, "countryName");
            java.lang.String str3 = a17.f423728b;
            str = countryName;
            e17 = str3;
        } else {
            str = "";
        }
        java.lang.String string2 = appCompatActivity.getString(com.tencent.mm.R.string.lse, d17, str2, e17, str);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        lVar.c(appCompatActivity, string2);
        lVar.d(i18);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.tencent.mm.ui.MMBottomButtonList b(androidx.appcompat.app.AppCompatActivity r16, java.util.List r17, int r18) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k71.l.b(androidx.appcompat.app.AppCompatActivity, java.util.List, int):com.tencent.mm.ui.MMBottomButtonList");
    }

    public final void c(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("KRightBtn", true);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        j45.l.j(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
    }

    public final void d(int i17) {
        if (i17 > 0) {
            v61.d.f(i17);
        }
    }
}
