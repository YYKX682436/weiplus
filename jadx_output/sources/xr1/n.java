package xr1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final xr1.n f456203e;

    /* renamed from: f, reason: collision with root package name */
    public static final xr1.n f456204f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ xr1.n[] f456205g;

    /* renamed from: d, reason: collision with root package name */
    public final int f456206d;

    static {
        xr1.n nVar = new xr1.n("DATE", 0, 1);
        f456203e = nVar;
        xr1.n nVar2 = new xr1.n("RECORD", 1, 2);
        f456204f = nVar2;
        xr1.n[] nVarArr = {nVar, nVar2};
        f456205g = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17, int i18) {
        this.f456206d = i18;
    }

    public static xr1.n valueOf(java.lang.String str) {
        return (xr1.n) java.lang.Enum.valueOf(xr1.n.class, str);
    }

    public static xr1.n[] values() {
        return (xr1.n[]) f456205g.clone();
    }
}
