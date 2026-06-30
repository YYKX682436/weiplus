package cq5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final cq5.f f221525e;

    /* renamed from: f, reason: collision with root package name */
    public static final cq5.f f221526f;

    /* renamed from: g, reason: collision with root package name */
    public static final cq5.f f221527g;

    /* renamed from: h, reason: collision with root package name */
    public static final cq5.f f221528h;

    /* renamed from: i, reason: collision with root package name */
    public static final cq5.f f221529i;

    /* renamed from: m, reason: collision with root package name */
    public static final cq5.f f221530m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ cq5.f[] f221531n;

    /* renamed from: d, reason: collision with root package name */
    public final int f221532d;

    static {
        cq5.f fVar = new cq5.f("SUCCESS", 0, 0);
        f221525e = fVar;
        cq5.f fVar2 = new cq5.f("FIRST_EDU", 1, 1);
        f221526f = fVar2;
        cq5.f fVar3 = new cq5.f("NO_PERMISSION", 2, 2);
        f221527g = fVar3;
        cq5.f fVar4 = new cq5.f("SWITCH_OFF", 3, 3);
        f221528h = fVar4;
        cq5.f fVar5 = new cq5.f("NETWORK_ERROR", 4, 4);
        f221529i = fVar5;
        cq5.f fVar6 = new cq5.f("OTHER_ERROR", 5, 5);
        f221530m = fVar6;
        cq5.f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6};
        f221531n = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17, int i18) {
        this.f221532d = i18;
    }

    public static cq5.f valueOf(java.lang.String str) {
        return (cq5.f) java.lang.Enum.valueOf(cq5.f.class, str);
    }

    public static cq5.f[] values() {
        return (cq5.f[]) f221531n.clone();
    }
}
