package com.tencent.mm.plugin.game.luggage.jsapi;

@mk0.a
/* loaded from: classes.dex */
class k0 implements com.tencent.mm.ipcinvoker.j {
    private k0() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        ew4.a a17 = ew4.c.c().a(bundle.getString("appId"), bundle.getString("key"));
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("value", a17.field_value);
        bundle2.putString("weight", a17.field_weight);
        bundle2.putLong("expireTime", a17.field_expireTime - (java.lang.System.currentTimeMillis() / 1000));
        bundle2.putString(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME, a17.field_localFile);
        rVar.a(bundle2);
    }
}
