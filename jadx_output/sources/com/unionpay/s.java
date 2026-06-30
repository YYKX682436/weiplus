package com.unionpay;

/* loaded from: classes13.dex */
public final class s implements com.unionpay.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.unionpay.UPPayWapActivity f220725a;

    public s(com.unionpay.UPPayWapActivity uPPayWapActivity) {
        this.f220725a = uPPayWapActivity;
    }

    @Override // com.unionpay.f
    public final void a(java.lang.String str, com.unionpay.g gVar) {
        try {
            this.f220725a.f220673n = gVar;
            java.lang.String optString = new org.json.JSONObject(str).optString("scheme");
            if (android.text.TextUtils.isEmpty(optString)) {
                if (gVar != null) {
                    ((com.unionpay.d) gVar).a(com.unionpay.UPPayWapActivity.L6("1", "Parameter error", null));
                    return;
                }
                return;
            }
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.setData(android.net.Uri.parse(optString));
            try {
                com.unionpay.UPPayWapActivity uPPayWapActivity = this.f220725a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(uPPayWapActivity, arrayList.toArray(), "com/unionpay/o", "a", "(Ljava/lang/String;Lcom/unionpay/ae;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                uPPayWapActivity.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(uPPayWapActivity, "com/unionpay/o", "a", "(Ljava/lang/String;Lcom/unionpay/ae;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception unused) {
                if (gVar != null) {
                    ((com.unionpay.d) gVar).a(com.unionpay.UPPayWapActivity.L6("2", "Call application error", null));
                }
            }
        } catch (java.lang.Exception e17) {
            if (gVar != null) {
                ((com.unionpay.d) gVar).a(com.unionpay.UPPayWapActivity.L6("1", e17.getMessage(), null));
            }
        }
    }
}
