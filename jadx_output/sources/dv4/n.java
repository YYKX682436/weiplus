package dv4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final dv4.m f244017e;

    /* renamed from: f, reason: collision with root package name */
    public static final dv4.n f244018f;

    /* renamed from: g, reason: collision with root package name */
    public static final dv4.n f244019g;

    /* renamed from: h, reason: collision with root package name */
    public static final dv4.n f244020h;

    /* renamed from: i, reason: collision with root package name */
    public static final dv4.n f244021i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ dv4.n[] f244022m;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f244023d;

    static {
        dv4.n nVar = new dv4.n("Unknown", 0, "");
        f244018f = nVar;
        dv4.n nVar2 = new dv4.n("Low", 1, "low");
        f244019g = nVar2;
        dv4.n nVar3 = new dv4.n("Medium", 2, ya.b.MEDIUM);
        f244020h = nVar3;
        dv4.n nVar4 = new dv4.n("High", 3, "high");
        f244021i = nVar4;
        dv4.n[] nVarArr = {nVar, nVar2, nVar3, nVar4};
        f244022m = nVarArr;
        rz5.b.a(nVarArr);
        f244017e = new dv4.m(null);
    }

    public n(java.lang.String str, int i17, java.lang.String str2) {
        this.f244023d = str2;
    }

    public static dv4.n valueOf(java.lang.String str) {
        return (dv4.n) java.lang.Enum.valueOf(dv4.n.class, str);
    }

    public static dv4.n[] values() {
        return (dv4.n[]) f244022m.clone();
    }
}
