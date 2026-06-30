package com.tencent.mm.ui.contact;

/* loaded from: classes9.dex */
public final class bb {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.contact.bb f206629a = new com.tencent.mm.ui.contact.bb();

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.ui.PocketMoneyEntryInfo f206630b = null;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f206631c = "";

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.ui.vas.VASActivity f206632d;

    /* renamed from: e, reason: collision with root package name */
    public static android.app.Dialog f206633e;

    public static final void a(com.tencent.mm.ui.contact.bb bbVar, int i17, java.lang.String str, r45.m04 m04Var) {
        bbVar.getClass();
        com.tencent.mars.xlog.Log.e("SelectPocketMoneyHelper", "CGI request failed: " + str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("pocket_money_result_status", -101);
        if (str == null) {
            str = com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED;
        }
        intent.putExtra("pocket_money_result_message", str);
        intent.putExtra("pocket_money_result_errcode", i17);
        intent.putExtra("Select_Conv_User", f206631c);
        if (m04Var != null) {
            java.lang.String jSONObject = pm0.b0.g(m04Var).toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            com.tencent.mars.xlog.Log.i("SelectPocketMoneyHelper", "handleCgiFailure response: ".concat(jSONObject));
            intent.putExtra("pocket_money_result_response", jSONObject);
        }
        com.tencent.mm.ui.vas.VASActivity vASActivity = f206632d;
        if (vASActivity != null) {
            vASActivity.setResult(-1, intent);
        }
        com.tencent.mm.ui.vas.VASActivity vASActivity2 = f206632d;
        if (vASActivity2 != null) {
            vASActivity2.finish();
        }
    }
}
