package ok4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final ok4.e f345992d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ok4.e[] f345993e;

    static {
        ok4.e eVar = new ok4.e("VIEW_DESTROY", 0);
        f345992d = eVar;
        ok4.e[] eVarArr = {eVar, new ok4.e("PRELOAD_FINISH", 1)};
        f345993e = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17) {
    }

    public static ok4.e valueOf(java.lang.String str) {
        return (ok4.e) java.lang.Enum.valueOf(ok4.e.class, str);
    }

    public static ok4.e[] values() {
        return (ok4.e[]) f345993e.clone();
    }
}
