package pr4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final pr4.j f358012d;

    /* renamed from: e, reason: collision with root package name */
    public static final pr4.j f358013e;

    /* renamed from: f, reason: collision with root package name */
    public static final pr4.j f358014f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ pr4.j[] f358015g;

    static {
        pr4.j jVar = new pr4.j("Default", 0);
        f358012d = jVar;
        pr4.j jVar2 = new pr4.j("NoMoney", 1);
        f358013e = jVar2;
        pr4.j jVar3 = new pr4.j("Intercept", 2);
        f358014f = jVar3;
        pr4.j[] jVarArr = {jVar, jVar2, jVar3};
        f358015g = jVarArr;
        rz5.b.a(jVarArr);
    }

    public j(java.lang.String str, int i17) {
    }

    public static pr4.j valueOf(java.lang.String str) {
        return (pr4.j) java.lang.Enum.valueOf(pr4.j.class, str);
    }

    public static pr4.j[] values() {
        return (pr4.j[]) f358015g.clone();
    }
}
