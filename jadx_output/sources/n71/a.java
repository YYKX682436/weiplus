package n71;

/* loaded from: classes14.dex */
public abstract class a {
    public static java.lang.String a() {
        return com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getString("reg_last_exit_ui", "");
    }

    public static void b(int i17, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(",");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(",");
        sb6.append(a());
        jx3.f.INSTANCE.f(i17, sb6.toString(), true, true);
    }

    public static void c(int i17, boolean z17, java.lang.String str) {
        java.lang.String sb6;
        if (z17) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append(",");
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb7.append(java.lang.System.currentTimeMillis());
            sb7.append(",");
            sb7.append(a());
            sb6 = sb7.toString();
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str);
            sb8.append(",");
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb8.append(java.lang.System.currentTimeMillis());
            sb8.append(",");
            sb8.append(com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getString("reg_next_enter_ui", ""));
            sb6 = sb8.toString();
        }
        jx3.f.INSTANCE.f(i17, sb6, true, true);
    }

    public static void d(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).edit().putString("reg_last_exit_ui", str).commit();
    }

    public static void e(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).edit().putString("reg_next_enter_ui", str).commit();
    }
}
