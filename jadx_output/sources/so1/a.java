package so1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final so1.a f410222d;

    /* renamed from: e, reason: collision with root package name */
    public static final so1.a f410223e;

    /* renamed from: f, reason: collision with root package name */
    public static final so1.a f410224f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ so1.a[] f410225g;

    static {
        so1.a aVar = new so1.a("SUPPORTED", 0);
        f410222d = aVar;
        so1.a aVar2 = new so1.a("UNSUPPORTED", 1);
        f410223e = aVar2;
        so1.a aVar3 = new so1.a("UNKNOWN", 2);
        f410224f = aVar3;
        so1.a[] aVarArr = {aVar, aVar2, aVar3};
        f410225g = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static so1.a valueOf(java.lang.String str) {
        return (so1.a) java.lang.Enum.valueOf(so1.a.class, str);
    }

    public static so1.a[] values() {
        return (so1.a[]) f410225g.clone();
    }
}
