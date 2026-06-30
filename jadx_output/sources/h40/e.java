package h40;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final h40.e f278736d;

    /* renamed from: e, reason: collision with root package name */
    public static final h40.e f278737e;

    /* renamed from: f, reason: collision with root package name */
    public static final h40.e f278738f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ h40.e[] f278739g;

    static {
        h40.e eVar = new h40.e("SUCCESS", 0);
        f278736d = eVar;
        h40.e eVar2 = new h40.e("CANCEL", 1);
        f278737e = eVar2;
        h40.e eVar3 = new h40.e("ERROR", 2);
        f278738f = eVar3;
        h40.e[] eVarArr = {eVar, eVar2, eVar3};
        f278739g = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17) {
    }

    public static h40.e valueOf(java.lang.String str) {
        return (h40.e) java.lang.Enum.valueOf(h40.e.class, str);
    }

    public static h40.e[] values() {
        return (h40.e[]) f278739g.clone();
    }
}
