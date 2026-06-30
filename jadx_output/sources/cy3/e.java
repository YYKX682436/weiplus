package cy3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final cy3.e f224770d;

    /* renamed from: e, reason: collision with root package name */
    public static final cy3.e f224771e;

    /* renamed from: f, reason: collision with root package name */
    public static final cy3.e f224772f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cy3.e[] f224773g;

    static {
        cy3.e eVar = new cy3.e("PLAY", 0);
        f224770d = eVar;
        cy3.e eVar2 = new cy3.e("SWITCH", 1);
        f224771e = eVar2;
        cy3.e eVar3 = new cy3.e("SWITCH_DEFAULT", 2);
        f224772f = eVar3;
        cy3.e[] eVarArr = {eVar, eVar2, eVar3, new cy3.e("MORE", 3)};
        f224773g = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17) {
    }

    public static cy3.e valueOf(java.lang.String str) {
        return (cy3.e) java.lang.Enum.valueOf(cy3.e.class, str);
    }

    public static cy3.e[] values() {
        return (cy3.e[]) f224773g.clone();
    }
}
