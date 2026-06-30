package zf4;

/* loaded from: classes13.dex */
public class b0 extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f472647f = {l75.n0.getCreateSQLs(zf4.q.V, "VoiceRemindInfo")};

    /* renamed from: g, reason: collision with root package name */
    public static long f472648g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f472649d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f472650e;

    public b0(l75.k0 k0Var) {
        super(k0Var, zf4.q.V, "VoiceRemindInfo", dm.tb.f240180y);
        this.f472650e = new java.util.HashMap();
        this.f472649d = k0Var;
    }

    public static java.lang.String y0(java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String format = new java.text.SimpleDateFormat("ssHHmmMMddyy").format(new java.util.Date(currentTimeMillis));
        if (str != null && str.length() > 1) {
            format = format + kk.k.g(str.getBytes()).substring(0, 7);
        }
        java.lang.String str2 = format + (currentTimeMillis % com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str2);
        long j17 = f472648g;
        f472648g = 1 + j17;
        sb6.append(j17);
        return sb6.toString();
    }

    public boolean d(java.lang.String str) {
        iz5.a.g(null, str.length() > 0);
        if (this.f472649d.delete("VoiceRemindInfo", "filename= ?", new java.lang.String[]{str}) <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VoiceRemindStorage", "delete failed, no such file:".concat(str));
        }
        return true;
    }
}
