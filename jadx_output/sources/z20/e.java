package z20;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final z20.e f469542d;

    /* renamed from: e, reason: collision with root package name */
    public static final z20.e f469543e;

    /* renamed from: f, reason: collision with root package name */
    public static final z20.e f469544f;

    /* renamed from: g, reason: collision with root package name */
    public static final z20.e f469545g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ z20.e[] f469546h;

    static {
        z20.e eVar = new z20.e("START", 0);
        f469542d = eVar;
        z20.e eVar2 = new z20.e("STEP", 1);
        f469543e = eVar2;
        z20.e eVar3 = new z20.e("SUCCESS", 2);
        f469544f = eVar3;
        z20.e eVar4 = new z20.e("FAIL", 3);
        f469545g = eVar4;
        z20.e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
        f469546h = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17) {
    }

    public static z20.e valueOf(java.lang.String str) {
        return (z20.e) java.lang.Enum.valueOf(z20.e.class, str);
    }

    public static z20.e[] values() {
        return (z20.e[]) f469546h.clone();
    }
}
