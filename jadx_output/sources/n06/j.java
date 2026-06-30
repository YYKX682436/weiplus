package n06;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final n06.j f333988d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ n06.j[] f333989e;

    static {
        n06.j jVar = new n06.j("FROM_DEPENDENCIES", 0);
        f333988d = jVar;
        n06.j[] jVarArr = {jVar, new n06.j("FROM_CLASS_LOADER", 1), new n06.j("FALLBACK", 2)};
        f333989e = jVarArr;
        rz5.b.a(jVarArr);
    }

    public j(java.lang.String str, int i17) {
    }

    public static n06.j valueOf(java.lang.String str) {
        return (n06.j) java.lang.Enum.valueOf(n06.j.class, str);
    }

    public static n06.j[] values() {
        return (n06.j[]) f333989e.clone();
    }
}
