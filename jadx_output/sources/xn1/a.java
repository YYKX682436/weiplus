package xn1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final xn1.a f455451d;

    /* renamed from: e, reason: collision with root package name */
    public static final xn1.a f455452e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ xn1.a[] f455453f;

    static {
        xn1.a aVar = new xn1.a("PHONE", 0);
        f455451d = aVar;
        xn1.a aVar2 = new xn1.a("PC", 1);
        f455452e = aVar2;
        xn1.a[] aVarArr = {aVar, aVar2, new xn1.a("NAS", 2)};
        f455453f = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static xn1.a valueOf(java.lang.String str) {
        return (xn1.a) java.lang.Enum.valueOf(xn1.a.class, str);
    }

    public static xn1.a[] values() {
        return (xn1.a[]) f455453f.clone();
    }
}
