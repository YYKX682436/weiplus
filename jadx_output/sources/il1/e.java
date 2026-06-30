package il1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final il1.e f292030d;

    /* renamed from: e, reason: collision with root package name */
    public static final il1.e f292031e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ il1.e[] f292032f;

    static {
        il1.e eVar = new il1.e("FULL_PAGE", 0);
        f292030d = eVar;
        il1.e eVar2 = new il1.e("HALF_PAGE", 1);
        f292031e = eVar2;
        il1.e[] eVarArr = {eVar, eVar2};
        f292032f = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17) {
    }

    public static il1.e valueOf(java.lang.String str) {
        return (il1.e) java.lang.Enum.valueOf(il1.e.class, str);
    }

    public static il1.e[] values() {
        return (il1.e[]) f292032f.clone();
    }
}
