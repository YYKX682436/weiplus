package jf5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final jf5.j f299471d;

    /* renamed from: e, reason: collision with root package name */
    public static final jf5.j f299472e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ jf5.j[] f299473f;

    static {
        jf5.j jVar = new jf5.j("WORD", 0);
        jf5.j jVar2 = new jf5.j("PARAGRAPH", 1);
        f299471d = jVar2;
        jf5.j jVar3 = new jf5.j("FULL_CONTENT", 2);
        f299472e = jVar3;
        jf5.j[] jVarArr = {jVar, jVar2, jVar3};
        f299473f = jVarArr;
        rz5.b.a(jVarArr);
    }

    public j(java.lang.String str, int i17) {
    }

    public static jf5.j valueOf(java.lang.String str) {
        return (jf5.j) java.lang.Enum.valueOf(jf5.j.class, str);
    }

    public static jf5.j[] values() {
        return (jf5.j[]) f299473f.clone();
    }
}
