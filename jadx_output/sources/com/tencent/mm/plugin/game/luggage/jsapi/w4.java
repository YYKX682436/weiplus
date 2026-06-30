package com.tencent.mm.plugin.game.luggage.jsapi;

@mk0.a
/* loaded from: classes.dex */
class w4 implements com.tencent.mm.ipcinvoker.j {
    private w4() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        boolean z17;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("appId");
        java.lang.String string2 = bundle.getString("key");
        java.lang.String string3 = bundle.getString("value");
        java.lang.String string4 = bundle.getString("weight");
        java.lang.String string5 = bundle.getString("expireTime");
        boolean z18 = bundle.getBoolean("autoClean");
        long j17 = bundle.getLong("storeSize");
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (com.tencent.mm.sdk.platformtools.t8.K0(string3)) {
            boolean e17 = ew4.c.c().e(string, string2, "", string4, string5, z18, j17, string2);
            bundle2.putBoolean("backIsFile", true);
            bundle2.putString("backFileName", string2);
            z17 = e17;
        } else {
            ew4.c c17 = ew4.c.c();
            c17.getClass();
            z17 = c17.e(string, string2, string3, string4, string5, z18, string2.getBytes().length + string3.getBytes().length, "");
        }
        bundle2.putBoolean("backRet", z17);
        rVar.a(bundle2);
    }
}
