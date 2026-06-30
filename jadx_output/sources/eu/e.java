package eu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final eu.e f256691d;

    /* renamed from: e, reason: collision with root package name */
    public static final eu.e f256692e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ eu.e[] f256693f;

    static {
        eu.e eVar = new eu.e("Success", 0);
        f256691d = eVar;
        eu.e eVar2 = new eu.e("Error", 1);
        eu.e eVar3 = new eu.e("InvalidMsg", 2);
        f256692e = eVar3;
        eu.e[] eVarArr = {eVar, eVar2, eVar3};
        f256693f = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17) {
    }

    public static eu.e valueOf(java.lang.String str) {
        return (eu.e) java.lang.Enum.valueOf(eu.e.class, str);
    }

    public static eu.e[] values() {
        return (eu.e[]) f256693f.clone();
    }
}
