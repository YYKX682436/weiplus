package sr3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final sr3.a f411829e;

    /* renamed from: f, reason: collision with root package name */
    public static final sr3.a f411830f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ sr3.a[] f411831g;

    /* renamed from: d, reason: collision with root package name */
    public final int f411832d;

    static {
        sr3.a aVar = new sr3.a("BIZ_ACCOUNTS", 0, 1);
        f411829e = aVar;
        sr3.a aVar2 = new sr3.a("PHOTO_ACCOUNTS", 1, 2);
        f411830f = aVar2;
        sr3.a[] aVarArr = {aVar, aVar2};
        f411831g = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
        this.f411832d = i18;
    }

    public static sr3.a valueOf(java.lang.String str) {
        return (sr3.a) java.lang.Enum.valueOf(sr3.a.class, str);
    }

    public static sr3.a[] values() {
        return (sr3.a[]) f411831g.clone();
    }
}
