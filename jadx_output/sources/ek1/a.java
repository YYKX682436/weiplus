package ek1;

/* loaded from: classes7.dex */
public abstract class a {
    public static boolean a() {
        return ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode() && ((uh4.c0) i95.n0.c(uh4.c0.class)).hd() != 1;
    }

    public static boolean b() {
        if (a()) {
            return false;
        }
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_recommend_use_fake_native, -1) == 1;
    }

    public static boolean c() {
        if (a()) {
            return false;
        }
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_app_brand_find_more_entry_use_fake_native, 0) > 0;
    }
}
