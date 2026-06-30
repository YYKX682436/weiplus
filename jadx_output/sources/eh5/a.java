package eh5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final eh5.a f252951d;

    /* renamed from: e, reason: collision with root package name */
    public static final eh5.a f252952e;

    /* renamed from: f, reason: collision with root package name */
    public static final eh5.a f252953f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ eh5.a[] f252954g;

    static {
        eh5.a aVar = new eh5.a("Header", 0);
        f252951d = aVar;
        eh5.a aVar2 = new eh5.a("Footer", 1);
        f252952e = aVar2;
        eh5.a aVar3 = new eh5.a("Content", 2);
        eh5.a aVar4 = new eh5.a("Overlay", 3);
        f252953f = aVar4;
        eh5.a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f252954g = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static eh5.a valueOf(java.lang.String str) {
        return (eh5.a) java.lang.Enum.valueOf(eh5.a.class, str);
    }

    public static eh5.a[] values() {
        return (eh5.a[]) f252954g.clone();
    }
}
