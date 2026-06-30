package yr0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final yr0.f f464631d;

    /* renamed from: e, reason: collision with root package name */
    public static final yr0.f f464632e;

    /* renamed from: f, reason: collision with root package name */
    public static final yr0.f f464633f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ yr0.f[] f464634g;

    static {
        yr0.f fVar = new yr0.f("Created", 0);
        f464631d = fVar;
        yr0.f fVar2 = new yr0.f("InUsed", 1);
        f464632e = fVar2;
        yr0.f fVar3 = new yr0.f("Destroyed", 2);
        f464633f = fVar3;
        yr0.f[] fVarArr = {fVar, fVar2, fVar3};
        f464634g = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17) {
    }

    public static yr0.f valueOf(java.lang.String str) {
        return (yr0.f) java.lang.Enum.valueOf(yr0.f.class, str);
    }

    public static yr0.f[] values() {
        return (yr0.f[]) f464634g.clone();
    }
}
