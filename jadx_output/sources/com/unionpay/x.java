package com.unionpay;

/* loaded from: classes13.dex */
public final class x implements com.unionpay.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.unionpay.UPPayWapActivity f220732a;

    public x(com.unionpay.UPPayWapActivity uPPayWapActivity) {
        this.f220732a = uPPayWapActivity;
    }

    @Override // com.unionpay.f
    public final void a(java.lang.String str, com.unionpay.g gVar) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                com.unionpay.utils.UPUtils.e(this.f220732a, jSONObject.getString(next), next);
            }
            if (gVar != null) {
                ((com.unionpay.d) gVar).a(com.unionpay.UPPayWapActivity.L6("0", ya.b.SUCCESS, null));
            }
        } catch (java.lang.Exception e17) {
            if (gVar != null) {
                ((com.unionpay.d) gVar).a(com.unionpay.UPPayWapActivity.L6("1", e17.getMessage(), null));
            }
        }
    }
}
