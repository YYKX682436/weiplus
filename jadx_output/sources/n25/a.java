package n25;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f334317a = "";

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f334318b = "";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f334319c = "";

    /* renamed from: d, reason: collision with root package name */
    public static long f334320d;

    public static java.lang.String a() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(f334317a)) {
            f334317a = gm0.m.v().getString("message_channel_id", "message_channel_new_id");
        }
        return f334317a;
    }

    public static java.lang.String b() {
        boolean z17;
        if (fp.h.c(26)) {
            android.text.format.Time time = new android.text.format.Time();
            time.setToNow();
            if (ip.b.q(time.hour, time.minute, com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                z17 = false;
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.NotificationHelper", "no shake & sound notification during background deactive time");
                z17 = true;
            }
            if (z17) {
                return "message_dnd_mode_channel_id";
            }
        }
        return a();
    }
}
