package d55;

/* loaded from: classes12.dex */
public class a0 {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f226554i;

    /* renamed from: a, reason: collision with root package name */
    public int f226555a;

    /* renamed from: b, reason: collision with root package name */
    public int f226556b;

    /* renamed from: c, reason: collision with root package name */
    public long f226557c;

    /* renamed from: d, reason: collision with root package name */
    public long f226558d;

    /* renamed from: e, reason: collision with root package name */
    public long f226559e;

    /* renamed from: f, reason: collision with root package name */
    public long f226560f;

    /* renamed from: g, reason: collision with root package name */
    public long f226561g;

    /* renamed from: h, reason: collision with root package name */
    public final d55.x f226562h;

    public a0(android.content.Context context) {
        d55.w wVar = new d55.w(context, "recovery_setting");
        this.f226562h = wVar;
        wVar.a();
        f226554i = wVar.getBoolean("setting_debug_mode", false);
        this.f226555a = java.lang.Math.max(wVar.getInt("setting_threshold_1", 3), 2);
        int max = java.lang.Math.max(wVar.getInt("setting_threshold_2", 5), 3);
        this.f226556b = max;
        int i17 = this.f226555a;
        if (max < i17) {
            this.f226556b = i17;
        }
        this.f226557c = java.lang.Math.max(wVar.getLong("setting_crash_interval", com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT), 5000L);
        this.f226558d = java.lang.Math.max(wVar.getLong("setting_crash_interval_sub", 30000L), 5000L);
        this.f226559e = java.lang.Math.max(wVar.getLong("setting_crash_minimal_interval", 1000L), 0L);
        this.f226560f = java.lang.Math.max(wVar.getLong("setting_reset_delay", 5000L), 1000L);
        this.f226561g = java.lang.Math.max(wVar.getLong("setting_app_exit_info_interval", 1800000L), 0L);
    }

    public void a() {
        d55.w wVar = (d55.w) this.f226562h;
        wVar.putBoolean("setting_debug_mode", f226554i);
        wVar.putInt("setting_threshold_1", this.f226555a);
        wVar.putInt("setting_threshold_2", this.f226556b);
        wVar.putLong("setting_crash_interval", this.f226557c);
        wVar.putLong("setting_crash_interval_sub", this.f226558d);
        wVar.putLong("setting_crash_minimal_interval", this.f226559e);
        wVar.putLong("setting_reset_delay", this.f226560f);
        wVar.putLong("setting_app_exit_info_interval", this.f226561g);
        wVar.c();
    }
}
