package pr3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final pr3.f f357971d;

    /* renamed from: e, reason: collision with root package name */
    public static final pr3.f f357972e;

    /* renamed from: f, reason: collision with root package name */
    public static final pr3.f f357973f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ pr3.f[] f357974g;

    static {
        pr3.f fVar = new pr3.f("AlwaysShow", 0);
        f357971d = fVar;
        pr3.f fVar2 = new pr3.f("AutoHide", 1);
        f357972e = fVar2;
        pr3.f fVar3 = new pr3.f("AlwaysHide", 2);
        f357973f = fVar3;
        pr3.f[] fVarArr = {fVar, fVar2, fVar3};
        f357974g = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17) {
    }

    public static pr3.f valueOf(java.lang.String str) {
        return (pr3.f) java.lang.Enum.valueOf(pr3.f.class, str);
    }

    public static pr3.f[] values() {
        return (pr3.f[]) f357974g.clone();
    }
}
