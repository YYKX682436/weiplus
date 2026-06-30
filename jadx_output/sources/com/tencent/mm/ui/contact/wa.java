package com.tencent.mm.ui.contact;

/* loaded from: classes9.dex */
public final class wa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f207238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f207239e;

    public wa(com.tencent.mm.modelbase.f fVar, java.lang.String str) {
        this.f207238d = fVar;
        this.f207239e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String string;
        java.util.HashMap hashMap;
        com.tencent.mm.ui.vas.VASActivity vASActivity = com.tencent.mm.ui.contact.bb.f206632d;
        com.tencent.mm.ui.contact.bb bbVar = com.tencent.mm.ui.contact.bb.f206629a;
        if (vASActivity != null) {
            int i17 = 0;
            if (!(vASActivity.isFinishing())) {
                com.tencent.mars.xlog.Log.i("SelectPocketMoneyHelper", "[dismissLoading] dismiss ");
                android.app.Dialog dialog = com.tencent.mm.ui.contact.bb.f206633e;
                if (dialog != null) {
                    dialog.dismiss();
                }
                com.tencent.mm.modelbase.f fVar = this.f207238d;
                if (fVar.f70615a != 0 || fVar.f70616b != 0) {
                    com.tencent.mars.xlog.Log.e("SelectPocketMoneyHelper", "Locate NetWorkError: errType: " + fVar.f70615a + ", errCode: " + fVar.f70616b + ", errmsg: " + fVar.f70617c);
                    com.tencent.mm.ui.contact.bb.a(bbVar, fVar.f70616b, fVar.f70617c, (r45.m04) fVar.f70618d);
                    return;
                }
                r45.m04 m04Var = (r45.m04) fVar.f70618d;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("InviteCoManagerForAccountResponse retCode: ");
                sb6.append(m04Var != null ? java.lang.Integer.valueOf(m04Var.getInteger(1)) : null);
                sb6.append(", retmsg: ");
                sb6.append(m04Var != null ? m04Var.getString(2) : null);
                com.tencent.mars.xlog.Log.i("SelectPocketMoneyHelper", sb6.toString());
                int integer = m04Var != null ? m04Var.getInteger(1) : -1;
                if (integer != 0) {
                    string = m04Var != null ? m04Var.getString(2) : null;
                    com.tencent.mm.ui.contact.bb.a(bbVar, integer, string != null ? string : "", m04Var);
                    return;
                }
                java.lang.String str = this.f207239e;
                if (str != null && str.length() > 0) {
                    com.tencent.mars.xlog.Log.i("SelectPocketMoneyHelper", "forwardDialogClick has text content: " + str);
                    java.lang.String str2 = com.tencent.mm.ui.contact.bb.f206631c;
                    if (str == null) {
                        str = "";
                    }
                    if (str.length() == 0) {
                        com.tencent.mars.xlog.Log.i("SelectPocketMoneyHelper", "[processTextTransfer] msgContent is empty");
                    }
                    int i18 = 4;
                    if (com.tencent.mm.storage.z3.R4(str2)) {
                        hashMap = com.tencent.mm.ui.i1.a(str);
                        if (hashMap != null) {
                            i18 = 5;
                            i17 = 1;
                        }
                    } else {
                        hashMap = null;
                    }
                    if (w11.t1.a(str2)) {
                        w11.r1 b17 = w11.s1.b(str2, null, 2, null);
                        b17.g(str2);
                        b17.e(str);
                        b17.f442130e = c01.e2.C(str2);
                        b17.f442131f = i17;
                        b17.f442133h = hashMap;
                        w11.r1.d(b17, null, 1, null);
                    } else {
                        w11.r1 b18 = w11.s1.b(str2, null, 2, null);
                        b18.g(str2);
                        b18.e(str);
                        b18.f442130e = c01.e2.C(str2);
                        b18.f442131f = i17;
                        b18.f442133h = hashMap;
                        b18.f442134i = i18;
                        b18.a().a();
                    }
                }
                string = m04Var != null ? m04Var.getString(2) : null;
                java.lang.String str3 = string != null ? string : "";
                com.tencent.mars.xlog.Log.i("SelectPocketMoneyHelper", "CGI request success");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("pocket_money_result_status", -102);
                intent.putExtra("Select_Conv_User", com.tencent.mm.ui.contact.bb.f206631c);
                intent.putExtra("pocket_money_result_errcode", integer);
                intent.putExtra("pocket_money_result_message", str3);
                if (m04Var != null) {
                    java.lang.String jSONObject = pm0.b0.g(m04Var).toString();
                    kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
                    com.tencent.mars.xlog.Log.i("SelectPocketMoneyHelper", "handleCgiFailure response: ".concat(jSONObject));
                    intent.putExtra("pocket_money_result_response", jSONObject);
                }
                com.tencent.mm.ui.vas.VASActivity vASActivity2 = com.tencent.mm.ui.contact.bb.f206632d;
                if (vASActivity2 != null) {
                    vASActivity2.setResult(-1, intent);
                }
                com.tencent.mm.ui.vas.VASActivity vASActivity3 = com.tencent.mm.ui.contact.bb.f206632d;
                if (vASActivity3 != null) {
                    vASActivity3.finish();
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("SelectPocketMoneyHelper", "Activity is finishing, ignore response");
        com.tencent.mars.xlog.Log.i("SelectPocketMoneyHelper", "[dismissLoading] dismiss ");
        android.app.Dialog dialog2 = com.tencent.mm.ui.contact.bb.f206633e;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
    }
}
