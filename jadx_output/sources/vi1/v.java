package vi1;

/* loaded from: classes7.dex */
public class v implements vi1.g0 {
    @Override // vi1.g0
    public void Ei(android.content.Context context, java.lang.String appId, java.lang.String extDesc, vi1.j2 j2Var, com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem, vi1.f0 f0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(extDesc, "extDesc");
        kotlin.jvm.internal.o.g(phoneItem, "phoneItem");
        new vi1.k3(context, appId, j2Var, extDesc, phoneItem, f0Var).e(true);
    }

    @Override // vi1.g0
    public void Ha(android.content.Context context, java.lang.String appId, yz5.p callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(callback, "callback");
        nf.g a17 = nf.g.a(context);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberAddUI.class);
        intent.putExtra("APPID", appId);
        a17.j(intent, new vi1.t(callback));
    }

    @Override // vi1.g0
    public void M6(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        boolean z17 = context instanceof com.tencent.mm.ui.BaseActivity;
    }

    @Override // vi1.g0
    public vi1.d0 R5(android.content.Context context, java.lang.String appId, yz5.a onDone) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(onDone, "onDone");
        return new vi1.b1(context, appId, onDone);
    }

    @Override // vi1.g0
    public vi1.h0 U1(android.content.Context context, java.lang.String appId, java.lang.String pagePath) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(pagePath, "pagePath");
        return new vi1.b2(context, appId, pagePath);
    }

    @Override // vi1.g0
    public android.text.SpannableString ka(android.content.Context context, java.lang.String appId, java.lang.String pagePath) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(pagePath, "pagePath");
        java.lang.String string = context.getString(com.tencent.mm.R.string.a3i);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.a3j);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        java.lang.String format = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{string}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return new android.text.SpannableString(format);
    }

    @Override // vi1.g0
    public void o8(android.content.Context context, yz5.l callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        callback.invoke(0);
    }

    @Override // vi1.g0
    public void oc(android.content.Context context, java.lang.String appId, java.lang.String pagePath, yz5.p callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(pagePath, "pagePath");
        kotlin.jvm.internal.o.g(callback, "callback");
        nf.g a17 = nf.g.a(context);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberManagerUI.class);
        intent.putExtra("APPID", appId);
        intent.putExtra("PAGEPATH", pagePath);
        a17.j(intent, new vi1.u(callback));
    }

    @Override // vi1.g0
    public boolean r8() {
        return true;
    }

    @Override // vi1.g0
    public void ud(vi1.j2 report) {
        kotlin.jvm.internal.o.g(report, "report");
        com.tencent.mars.xlog.Log.i("Luggage.FULL.DefaultPhoneNumberLogic", "report:" + report);
    }
}
