package wo;

/* loaded from: classes11.dex */
public class h1 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f447716b;

    /* renamed from: a, reason: collision with root package name */
    public java.util.Map f447717a = null;

    public void a(java.util.Map map) {
        this.f447717a = map;
    }

    public void b(int i17) {
        f447716b = true;
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "system_config_prefs", 4);
        o4Var.getClass();
        o4Var.putInt("update_swip_back_status", i17);
    }
}
