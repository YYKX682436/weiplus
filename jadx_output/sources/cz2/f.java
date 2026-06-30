package cz2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final cz2.f f225002d;

    /* renamed from: e, reason: collision with root package name */
    public static final cz2.f f225003e;

    /* renamed from: f, reason: collision with root package name */
    public static final cz2.f f225004f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cz2.f[] f225005g;

    static {
        cz2.f fVar = new cz2.f("Default", 0);
        f225002d = fVar;
        cz2.f fVar2 = new cz2.f("Enable", 1);
        f225003e = fVar2;
        cz2.f fVar3 = new cz2.f("Disable", 2);
        f225004f = fVar3;
        cz2.f[] fVarArr = {fVar, fVar2, fVar3};
        f225005g = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17) {
    }

    public static cz2.f valueOf(java.lang.String str) {
        return (cz2.f) java.lang.Enum.valueOf(cz2.f.class, str);
    }

    public static cz2.f[] values() {
        return (cz2.f[]) f225005g.clone();
    }
}
