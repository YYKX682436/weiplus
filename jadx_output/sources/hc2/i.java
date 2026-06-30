package hc2;

/* loaded from: classes8.dex */
public abstract class i {
    public static final void a(android.app.Activity activity, android.view.View view, android.view.View view2) {
        kotlin.jvm.internal.o.g(activity, "<this>");
        android.view.View decorView = activity.getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        decorView.getViewTreeObserver().addOnPreDrawListener(new hc2.g(decorView, activity, view, view2));
    }

    public static final java.lang.String b(android.content.Context context, long j17, int i17) {
        java.lang.String valueOf;
        java.lang.String valueOf2;
        kotlin.jvm.internal.o.g(context, "<this>");
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(new java.util.Date(j17));
        int i18 = calendar.get(11);
        if (i18 < 10) {
            valueOf = "0" + i18;
        } else {
            valueOf = java.lang.String.valueOf(i18);
        }
        int i19 = calendar.get(12);
        if (i19 < 10) {
            valueOf2 = "0" + i19;
        } else {
            valueOf2 = java.lang.String.valueOf(i19);
        }
        java.lang.String string = context.getResources().getString(i17, java.lang.Integer.valueOf(calendar.get(1)), java.lang.Integer.valueOf(calendar.get(2) + 1), java.lang.Integer.valueOf(calendar.get(5)), valueOf, valueOf2);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public static final void c(android.app.Activity activity, java.lang.String str) {
        try {
            com.tencent.mars.xlog.Log.i("FinderExt", "[handleShareJumpErrorDirect] json = " + str);
            cl0.g gVar = new cl0.g(str);
            int i17 = gVar.getInt("link_type");
            if (i17 == 1) {
                f(activity, gVar.a("link_h5").optString("link"));
            } else if (i17 == 2) {
                cl0.g a17 = gVar.a("link_lite_app");
                java.lang.String optString = a17.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID);
                java.lang.String optString2 = a17.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE);
                java.lang.String optString3 = a17.optString("query");
                java.lang.String optString4 = a17.optString("default_url");
                java.lang.String optString5 = a17.optString("ext_info");
                r45.k41 k41Var = new r45.k41();
                k41Var.set(0, optString);
                k41Var.set(1, optString2);
                k41Var.set(2, optString3);
                k41Var.set(3, optString4);
                k41Var.set(4, optString5);
                g(activity, k41Var);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("FinderExt", "[handleShareJumpErrorDirect] catch exception:" + e17.getMessage());
        }
    }

    public static final void d(android.app.Activity activity, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(activity, "<this>");
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        if (com.tencent.mm.sdk.platformtools.t8.K0(errMsg)) {
            return;
        }
        try {
            com.tencent.mars.xlog.Log.i("FinderExt", "[handleShareJumpErrorUi] json = ".concat(errMsg));
            if (new cl0.g(errMsg).getInt("show_type") != 1) {
                return;
            }
            c(activity, errMsg);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("FinderExt", "[handleShareJumpErrorUi] catch exception:" + e17.getMessage());
        }
    }

    public static final void e(com.tencent.mm.ui.MMActivity mMActivity, boolean z17) {
        kotlin.jvm.internal.o.g(mMActivity, "<this>");
        mMActivity.setActionbarColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.a9e));
        androidx.appcompat.app.b supportActionBar = mMActivity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.w(new android.graphics.drawable.ColorDrawable(0));
            supportActionBar.o();
        }
        if (z17) {
            return;
        }
        android.view.View decorView = mMActivity.getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(1280);
        com.tencent.mm.ui.r0.a(mMActivity, false);
        mMActivity.updataStatusBarIcon(com.tencent.mm.ui.bk.C());
    }

    public static final void f(android.app.Activity activity, java.lang.String str) {
        if (!(str == null || str.length() == 0)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str);
            j45.l.j(activity, "webview", ".ui.tools.WebViewUI", intent, null);
        }
        com.tencent.mm.sdk.platformtools.u3.i(new nf.d(new hc2.f(activity)), 800L);
    }

    public static final void g(android.app.Activity activity, r45.k41 k41Var) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", k41Var.getString(0));
        bundle.putString("query", k41Var.getString(2));
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, k41Var.getString(1));
        bundle.putInt("nextAnimIn", com.tencent.mm.R.anim.f477721i);
        bundle.putInt("currentAnimOut", com.tencent.mm.R.anim.f477889ed);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f460472a;
        java.lang.String string = k41Var.getString(3);
        if (e1Var.L(activity, bundle, !(string == null || string.length() == 0), new hc2.h(activity, k41Var))) {
            return;
        }
        f(activity, k41Var.getString(3));
    }

    public static final void h(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "<this>");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://weixin.qq.com/cgi-bin/readtemplate?t=page/agreement/finder_live_user_event");
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
