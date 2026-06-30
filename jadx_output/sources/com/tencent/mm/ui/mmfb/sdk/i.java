package com.tencent.mm.ui.mmfb.sdk;

/* loaded from: classes13.dex */
public class i extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mmfb.sdk.l f209200a;

    public i(com.tencent.mm.ui.mmfb.sdk.l lVar) {
        this.f209200a = lVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra(com.tencent.mm.ui.mmfb.sdk.l.f209202f);
        com.tencent.mars.xlog.Log.i("MicroMsg.FacebookLoginUI", "data = %s, action = %s.", stringExtra, intent.getAction());
        android.os.Bundle bundle = new android.os.Bundle();
        if (com.tencent.mm.ui.mmfb.sdk.l.f209208l.equals(intent.getAction()) && stringExtra != null && stringExtra.startsWith("fb290293790992170://authorize")) {
            android.os.Bundle e17 = com.tencent.mm.ui.mmfb.sdk.l.e(stringExtra);
            bundle.putString("access_token", e17.getString("access_token"));
            try {
                bundle.putLong("data_access_expiration_time", java.lang.Long.parseLong(e17.getString("data_access_expiration_time")) * 1000);
                com.tencent.mars.xlog.Log.i("MicroMsg.FacebookLoginUI", "DATAACCESSEXPIRATIONTIME = %s", java.lang.Long.valueOf(bundle.getLong("data_access_expiration_time")));
            } catch (java.lang.Exception unused) {
            }
            bundle.putString("expires_in", e17.getString("expires_in"));
            bundle.putString("service_disabled", e17.getString("service_disabled"));
            com.tencent.mm.ui.mmfb.sdk.k kVar = this.f209200a.f209216d;
            if (kVar != null) {
                ((com.tencent.mm.ui.mmfb.sdk.j) kVar).b(bundle);
            }
        }
    }
}
