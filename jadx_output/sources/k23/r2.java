package k23;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class r2 {

    /* renamed from: e, reason: collision with root package name */
    public static final k23.r2 f303683e;

    /* renamed from: f, reason: collision with root package name */
    public static final k23.r2 f303684f;

    /* renamed from: g, reason: collision with root package name */
    public static final k23.r2 f303685g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ k23.r2[] f303686h;

    /* renamed from: d, reason: collision with root package name */
    public final int f303687d;

    static {
        k23.r2 r2Var = new k23.r2("NONE", 0, 0);
        f303683e = r2Var;
        k23.r2 r2Var2 = new k23.r2("VoiceText", 1, 1);
        f303684f = r2Var2;
        k23.r2 r2Var3 = new k23.r2("FloatingBigButtonVoiceText", 2, 2);
        f303685g = r2Var3;
        k23.r2[] r2VarArr = {r2Var, r2Var2, r2Var3};
        f303686h = r2VarArr;
        rz5.b.a(r2VarArr);
    }

    public r2(java.lang.String str, int i17, int i18) {
        this.f303687d = i18;
    }

    public static k23.r2 valueOf(java.lang.String str) {
        return (k23.r2) java.lang.Enum.valueOf(k23.r2.class, str);
    }

    public static k23.r2[] values() {
        return (k23.r2[]) f303686h.clone();
    }
}
