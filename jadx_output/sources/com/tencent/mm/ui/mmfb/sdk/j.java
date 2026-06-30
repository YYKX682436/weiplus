package com.tencent.mm.ui.mmfb.sdk;

/* loaded from: classes13.dex */
public class j implements com.tencent.mm.ui.mmfb.sdk.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mmfb.sdk.l f209201a;

    public j(com.tencent.mm.ui.mmfb.sdk.l lVar) {
        this.f209201a = lVar;
    }

    @Override // com.tencent.mm.ui.mmfb.sdk.k
    public void b(android.os.Bundle bundle) {
        com.tencent.xweb.d.g().flush();
        java.lang.String string = bundle.getString("access_token");
        com.tencent.mm.ui.mmfb.sdk.l lVar = this.f209201a;
        lVar.g(string);
        java.lang.String string2 = bundle.getString("expires_in");
        if (string2 != null) {
            lVar.f209214b = string2.equals("0") ? 0L : java.lang.System.currentTimeMillis() + (com.tencent.mm.sdk.platformtools.t8.E1(string2) * 1000);
        }
        if (bundle.getLong("data_access_expiration_time") > java.lang.System.currentTimeMillis() / 1000) {
            lVar.f209214b = bundle.getLong("data_access_expiration_time");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FacebookLoginUI", "onComplete, onError, values.getLong(DATAACCESSEXPIRATIONTIME) = " + bundle.getLong("data_access_expiration_time") + ", System.currentTimeMillis() = " + java.lang.System.currentTimeMillis());
        }
        if (lVar.d()) {
            lVar.f209215c.b(bundle);
        } else {
            lVar.f209215c.d(new com.tencent.mm.ui.mmfb.sdk.n("Failed to receive access token."));
        }
    }

    @Override // com.tencent.mm.ui.mmfb.sdk.k
    public void c(com.tencent.mm.ui.mmfb.sdk.h hVar) {
        java.util.Objects.toString(hVar);
        this.f209201a.f209215c.c(hVar);
    }

    @Override // com.tencent.mm.ui.mmfb.sdk.k
    public void d(com.tencent.mm.ui.mmfb.sdk.n nVar) {
        java.util.Objects.toString(nVar);
        this.f209201a.f209215c.d(nVar);
    }

    @Override // com.tencent.mm.ui.mmfb.sdk.k
    public void onCancel() {
        this.f209201a.f209215c.onCancel();
    }
}
