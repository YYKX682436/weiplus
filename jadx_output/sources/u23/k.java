package u23;

/* loaded from: classes10.dex */
public final class k {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.List f424084g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.List f424085h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.List f424086i;

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f424087a = jz5.h.b(u23.f.f424073d);

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f424088b = jz5.h.b(new u23.j(this));

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f424089c = jz5.h.b(new u23.h(this));

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f424090d = jz5.h.b(new u23.i(this));

    /* renamed from: e, reason: collision with root package name */
    public final long f424091e = com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f424092f = jz5.h.b(u23.g.f424075d);

    static {
        java.util.List i17 = kz5.c0.i("camera", "screenshots", "download");
        f424084g = i17;
        f424085h = i17;
        f424086i = kz5.b0.c("camera");
    }

    public static final java.lang.String a(u23.k kVar) {
        kVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("date_modified<=2147483647 AND date_modified>0");
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            sb6.append(" AND is_pending<>1");
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return " AND ".concat(sb7);
    }

    public final java.util.List b(java.lang.Integer num) {
        return (num != null && num.intValue() == 1) ? f424085h : (num != null && num.intValue() == 2) ? f424086i : f424084g;
    }
}
