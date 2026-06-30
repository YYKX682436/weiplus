package cs2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final cs2.n f222079d;

    /* renamed from: e, reason: collision with root package name */
    public static final cs2.n f222080e;

    /* renamed from: f, reason: collision with root package name */
    public static final cs2.n f222081f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cs2.n[] f222082g;

    static {
        cs2.n nVar = new cs2.n("IDLE", 0);
        f222079d = nVar;
        cs2.n nVar2 = new cs2.n("ONE", 1);
        f222080e = nVar2;
        cs2.n nVar3 = new cs2.n("TWO", 2);
        f222081f = nVar3;
        cs2.n[] nVarArr = {nVar, nVar2, nVar3};
        f222082g = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17) {
    }

    public static cs2.n valueOf(java.lang.String str) {
        return (cs2.n) java.lang.Enum.valueOf(cs2.n.class, str);
    }

    public static cs2.n[] values() {
        return (cs2.n[]) f222082g.clone();
    }
}
