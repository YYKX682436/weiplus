package oh2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final oh2.e f345366d;

    /* renamed from: e, reason: collision with root package name */
    public static final oh2.e f345367e;

    /* renamed from: f, reason: collision with root package name */
    public static final oh2.e f345368f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ oh2.e[] f345369g;

    static {
        oh2.e eVar = new oh2.e("CENTER", 0);
        f345366d = eVar;
        oh2.e eVar2 = new oh2.e("LEFT", 1);
        f345367e = eVar2;
        oh2.e eVar3 = new oh2.e("RIGHT", 2);
        f345368f = eVar3;
        oh2.e[] eVarArr = {eVar, eVar2, eVar3};
        f345369g = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17) {
    }

    public static oh2.e valueOf(java.lang.String str) {
        return (oh2.e) java.lang.Enum.valueOf(oh2.e.class, str);
    }

    public static oh2.e[] values() {
        return (oh2.e[]) f345369g.clone();
    }
}
