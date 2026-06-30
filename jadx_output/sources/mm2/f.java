package mm2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final mm2.f f329013d;

    /* renamed from: e, reason: collision with root package name */
    public static final mm2.f f329014e;

    /* renamed from: f, reason: collision with root package name */
    public static final mm2.f f329015f;

    /* renamed from: g, reason: collision with root package name */
    public static final mm2.f f329016g;

    /* renamed from: h, reason: collision with root package name */
    public static final mm2.f f329017h;

    /* renamed from: i, reason: collision with root package name */
    public static final mm2.f f329018i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ mm2.f[] f329019m;

    static {
        mm2.f fVar = new mm2.f("IDLE", 0, 1);
        f329013d = fVar;
        mm2.f fVar2 = new mm2.f("STARTUP_VIDEO_PLAYING", 1, 2);
        f329014e = fVar2;
        mm2.f fVar3 = new mm2.f("STARTUP_VIDEO_COMPLETE", 2, 3);
        f329015f = fVar3;
        mm2.f fVar4 = new mm2.f("LIVING_VIDEO_PLAYING", 3, 4);
        f329016g = fVar4;
        mm2.f fVar5 = new mm2.f("LIVING_VIDEO_COMPLETE", 4, 5);
        f329017h = fVar5;
        mm2.f fVar6 = new mm2.f("STARTUP_VIDEO_PLAYING_FIRST_FRAME", 5, 6);
        f329018i = fVar6;
        mm2.f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6};
        f329019m = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17, int i18) {
    }

    public static mm2.f valueOf(java.lang.String str) {
        return (mm2.f) java.lang.Enum.valueOf(mm2.f.class, str);
    }

    public static mm2.f[] values() {
        return (mm2.f[]) f329019m.clone();
    }
}
