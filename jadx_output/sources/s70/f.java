package s70;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final s70.f f403936d;

    /* renamed from: e, reason: collision with root package name */
    public static final s70.f f403937e;

    /* renamed from: f, reason: collision with root package name */
    public static final s70.f f403938f;

    /* renamed from: g, reason: collision with root package name */
    public static final s70.f f403939g;

    /* renamed from: h, reason: collision with root package name */
    public static final s70.f f403940h;

    /* renamed from: i, reason: collision with root package name */
    public static final s70.f f403941i;

    /* renamed from: m, reason: collision with root package name */
    public static final s70.f f403942m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ s70.f[] f403943n;

    static {
        s70.f fVar = new s70.f("Start", 0);
        f403936d = fVar;
        s70.f fVar2 = new s70.f("Prepare", 1);
        f403937e = fVar2;
        s70.f fVar3 = new s70.f("CheckCDN", 2);
        f403938f = fVar3;
        s70.f fVar4 = new s70.f("Download", 3);
        f403939g = fVar4;
        s70.f fVar5 = new s70.f("TransformImg", 4);
        f403940h = fVar5;
        s70.f fVar6 = new s70.f("Upload", 5);
        f403941i = fVar6;
        s70.f fVar7 = new s70.f("Finish", 6);
        f403942m = fVar7;
        s70.f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7};
        f403943n = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17) {
    }

    public static s70.f valueOf(java.lang.String str) {
        return (s70.f) java.lang.Enum.valueOf(s70.f.class, str);
    }

    public static s70.f[] values() {
        return (s70.f[]) f403943n.clone();
    }
}
