package d82;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final d82.f f226926d;

    /* renamed from: e, reason: collision with root package name */
    public static final d82.f f226927e;

    /* renamed from: f, reason: collision with root package name */
    public static final d82.f f226928f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ d82.f[] f226929g;

    static {
        d82.f fVar = new d82.f("COMPRESSING", 0);
        f226926d = fVar;
        d82.f fVar2 = new d82.f("COMPLETED", 1);
        f226927e = fVar2;
        d82.f fVar3 = new d82.f("FAILED", 2);
        f226928f = fVar3;
        d82.f[] fVarArr = {fVar, fVar2, fVar3};
        f226929g = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17) {
    }

    public static d82.f valueOf(java.lang.String str) {
        return (d82.f) java.lang.Enum.valueOf(d82.f.class, str);
    }

    public static d82.f[] values() {
        return (d82.f[]) f226929g.clone();
    }
}
