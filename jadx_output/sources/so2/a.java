package so2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final so2.a f410240d;

    /* renamed from: e, reason: collision with root package name */
    public static final so2.a f410241e;

    /* renamed from: f, reason: collision with root package name */
    public static final so2.a f410242f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ so2.a[] f410243g;

    static {
        so2.a aVar = new so2.a("NONE", 0);
        f410240d = aVar;
        so2.a aVar2 = new so2.a("MODIFY", 1);
        f410241e = aVar2;
        so2.a aVar3 = new so2.a("DELETE", 2);
        f410242f = aVar3;
        so2.a[] aVarArr = {aVar, aVar2, aVar3};
        f410243g = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static so2.a valueOf(java.lang.String str) {
        return (so2.a) java.lang.Enum.valueOf(so2.a.class, str);
    }

    public static so2.a[] values() {
        return (so2.a[]) f410243g.clone();
    }
}
