package cx0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final cx0.a f224493d;

    /* renamed from: e, reason: collision with root package name */
    public static final cx0.a f224494e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ cx0.a[] f224495f;

    static {
        cx0.a aVar = new cx0.a("Undo", 0);
        f224493d = aVar;
        cx0.a aVar2 = new cx0.a("Redo", 1);
        f224494e = aVar2;
        cx0.a[] aVarArr = {aVar, aVar2};
        f224495f = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static cx0.a valueOf(java.lang.String str) {
        return (cx0.a) java.lang.Enum.valueOf(cx0.a.class, str);
    }

    public static cx0.a[] values() {
        return (cx0.a[]) f224495f.clone();
    }
}
