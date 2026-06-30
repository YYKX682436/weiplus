package eu2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final eu2.e f256782d;

    /* renamed from: e, reason: collision with root package name */
    public static final eu2.e f256783e;

    /* renamed from: f, reason: collision with root package name */
    public static final eu2.e f256784f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ eu2.e[] f256785g;

    static {
        eu2.e eVar = new eu2.e("VIDEO", 0);
        f256782d = eVar;
        eu2.e eVar2 = new eu2.e("LIVE", 1);
        f256783e = eVar2;
        eu2.e eVar3 = new eu2.e("NONE", 2);
        f256784f = eVar3;
        eu2.e[] eVarArr = {eVar, eVar2, eVar3};
        f256785g = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17) {
    }

    public static eu2.e valueOf(java.lang.String str) {
        return (eu2.e) java.lang.Enum.valueOf(eu2.e.class, str);
    }

    public static eu2.e[] values() {
        return (eu2.e[]) f256785g.clone();
    }
}
