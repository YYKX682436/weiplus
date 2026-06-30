package rb2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final rb2.a f393570g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ rb2.b[] f393571h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f393572i;

    /* renamed from: d, reason: collision with root package name */
    public final float f393573d;

    /* renamed from: e, reason: collision with root package name */
    public final int f393574e;

    /* renamed from: f, reason: collision with root package name */
    public final int f393575f;

    static {
        rb2.b[] bVarArr = {new rb2.b("RATIO_4_3", 0, 1.3333334f, com.tencent.mm.R.dimen.f479664c2, com.tencent.mm.R.dimen.f479657bu), new rb2.b("RATIO_3_4", 1, 0.75f, com.tencent.mm.R.dimen.f479657bu, com.tencent.mm.R.dimen.f479664c2), new rb2.b("RATIO_1_1", 2, 1.0f, com.tencent.mm.R.dimen.f479657bu, com.tencent.mm.R.dimen.f479657bu), new rb2.b("RATIO_16_9", 3, 1.7777778f, com.tencent.mm.R.dimen.f479664c2, com.tencent.mm.R.dimen.f479734dr), new rb2.b("RATIO_9_16", 4, 0.5625f, com.tencent.mm.R.dimen.f479734dr, com.tencent.mm.R.dimen.f479664c2)};
        f393571h = bVarArr;
        f393572i = rz5.b.a(bVarArr);
        f393570g = new rb2.a(null);
    }

    public b(java.lang.String str, int i17, float f17, int i18, int i19) {
        this.f393573d = f17;
        this.f393574e = i18;
        this.f393575f = i19;
    }

    public static rb2.b valueOf(java.lang.String str) {
        return (rb2.b) java.lang.Enum.valueOf(rb2.b.class, str);
    }

    public static rb2.b[] values() {
        return (rb2.b[]) f393571h.clone();
    }
}
