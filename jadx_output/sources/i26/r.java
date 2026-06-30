package i26;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes16.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static final i26.r f288089e;

    /* renamed from: f, reason: collision with root package name */
    public static final i26.r f288090f;

    /* renamed from: g, reason: collision with root package name */
    public static final i26.r f288091g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ i26.r[] f288092h;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f288093d;

    static {
        i26.r rVar = new i26.r("IN", 0, "in");
        f288089e = rVar;
        i26.r rVar2 = new i26.r("OUT", 1, "out");
        f288090f = rVar2;
        i26.r rVar3 = new i26.r("INV", 2, "");
        f288091g = rVar3;
        i26.r[] rVarArr = {rVar, rVar2, rVar3};
        f288092h = rVarArr;
        rz5.b.a(rVarArr);
    }

    public r(java.lang.String str, int i17, java.lang.String str2) {
        this.f288093d = str2;
    }

    public static i26.r valueOf(java.lang.String str) {
        return (i26.r) java.lang.Enum.valueOf(i26.r.class, str);
    }

    public static i26.r[] values() {
        return (i26.r[]) f288092h.clone();
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.f288093d;
    }
}
