package h52;

/* loaded from: classes15.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static volatile h52.c f279038b;

    /* renamed from: a, reason: collision with root package name */
    public final h52.a f279039a = new h52.d();

    public c() {
        if (b52.b.m()) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.ActivityDao_MMKV", "ActivityDao_MMKV reset");
            c52.c.d("hell_aty_action_mmkv_key", new byte[0]);
        }
    }

    public static h52.c a() {
        if (f279038b == null) {
            synchronized (h52.c.class) {
                if (f279038b == null) {
                    f279038b = new h52.c();
                }
            }
        }
        return f279038b;
    }
}
