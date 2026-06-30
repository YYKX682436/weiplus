package zd0;

@j95.b
/* loaded from: classes7.dex */
public class e extends i95.w implements ae0.h {
    public java.lang.String Ai(java.lang.String str) {
        return xp1.d.d(str, wo.w0.g(true));
    }

    public java.lang.String Bi(java.lang.String str) {
        return xp1.d.d(str, wo.w0.c());
    }

    public java.lang.String Di(java.lang.String str, boolean z17) {
        if (str != null && str.length() > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShortcutUtil", "process name: %s", com.tencent.mm.sdk.platformtools.t8.W(com.tencent.mm.sdk.platformtools.x2.f193071a, android.os.Process.myPid()));
            wo.w0.f447839a = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.DeviceInfo", "allowGetSensitiveDataFromSys");
            java.lang.String h17 = xp1.c.h(str, z17 ? wo.w0.c() : wo.w0.g(true));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(h17)) {
                return "shortcut_" + xp1.c.o(h17.getBytes());
            }
        }
        return null;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        java.util.Set<java.lang.String> stringSet;
        super.onAccountInitialized(context);
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("app_brand_global_sp", 0);
        if (sharedPreferences == null || (stringSet = sharedPreferences.getStringSet("uin_set", new java.util.HashSet())) == null) {
            return;
        }
        if (stringSet.add("" + gm0.j1.b().h())) {
            android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.remove("uin_set");
            edit.commit();
            edit.putStringSet("uin_set", stringSet);
            edit.commit();
        }
    }

    public java.lang.String wi(java.lang.String str, java.lang.String str2) {
        return kk.k.g((kk.k.g(str.getBytes()) + xp1.c.h(str2, str)).getBytes());
    }
}
