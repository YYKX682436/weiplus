package nk3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final nk3.a f338023e;

    /* renamed from: f, reason: collision with root package name */
    public static final nk3.a f338024f;

    /* renamed from: g, reason: collision with root package name */
    public static final nk3.a f338025g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ nk3.a[] f338026h;

    /* renamed from: d, reason: collision with root package name */
    public final int f338027d;

    static {
        nk3.a aVar = new nk3.a("UNKNOWN", 0, 0);
        nk3.a aVar2 = new nk3.a("FLOAT", 1, 1);
        f338023e = aVar2;
        nk3.a aVar3 = new nk3.a("STAR", 2, 2);
        f338024f = aVar3;
        nk3.a aVar4 = new nk3.a("NONE", 3, 9);
        f338025g = aVar4;
        nk3.a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f338026h = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
        this.f338027d = i18;
    }

    public static nk3.a valueOf(java.lang.String str) {
        return (nk3.a) java.lang.Enum.valueOf(nk3.a.class, str);
    }

    public static nk3.a[] values() {
        return (nk3.a[]) f338026h.clone();
    }
}
