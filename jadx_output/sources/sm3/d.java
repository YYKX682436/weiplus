package sm3;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f409842d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f409843e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f409844f;

    /* renamed from: a, reason: collision with root package name */
    public int f409845a = 2;

    /* renamed from: b, reason: collision with root package name */
    public long f409846b = ((java.lang.Number) f409842d.get(2)).longValue();

    /* renamed from: c, reason: collision with root package name */
    public float f409847c = 1.0f;

    static {
        new sm3.c(null);
        f409842d = kz5.c0.i(1000L, 2000L, 3000L, 5000L, java.lang.Long.valueOf(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT), 15000L, 30000L);
        f409843e = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 40);
        f409844f = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 80);
    }

    public final void a(long j17) {
        float f17;
        float f18;
        int i17 = j17 < u04.d.f423477c ? 2 : 3;
        this.f409845a = i17;
        this.f409846b = ((java.lang.Number) f409842d.get(i17)).longValue();
        int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);
        if (j17 < u04.d.f423477c) {
            f17 = b17;
            f18 = 2.0f;
        } else if (j17 < 240000) {
            f17 = b17;
            f18 = 1.5f;
        } else {
            f17 = b17;
            f18 = 1.0f;
        }
        this.f409847c = (f17 * f18) / 1000;
    }
}
