package pz5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final pz5.a f359186d;

    /* renamed from: e, reason: collision with root package name */
    public static final pz5.a f359187e;

    /* renamed from: f, reason: collision with root package name */
    public static final pz5.a f359188f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ pz5.a[] f359189g;

    static {
        pz5.a aVar = new pz5.a("COROUTINE_SUSPENDED", 0);
        f359186d = aVar;
        pz5.a aVar2 = new pz5.a("UNDECIDED", 1);
        f359187e = aVar2;
        pz5.a aVar3 = new pz5.a("RESUMED", 2);
        f359188f = aVar3;
        pz5.a[] aVarArr = {aVar, aVar2, aVar3};
        f359189g = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static pz5.a valueOf(java.lang.String str) {
        return (pz5.a) java.lang.Enum.valueOf(pz5.a.class, str);
    }

    public static pz5.a[] values() {
        return (pz5.a[]) f359189g.clone();
    }
}
