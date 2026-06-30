package ec3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final ec3.n f251060d;

    /* renamed from: e, reason: collision with root package name */
    public static final ec3.n f251061e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ec3.n[] f251062f;

    static {
        ec3.n nVar = new ec3.n("CELL", 0);
        f251060d = nVar;
        ec3.n nVar2 = new ec3.n("CONTENT", 1);
        f251061e = nVar2;
        ec3.n[] nVarArr = {nVar, nVar2};
        f251062f = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17) {
    }

    public static ec3.n valueOf(java.lang.String str) {
        return (ec3.n) java.lang.Enum.valueOf(ec3.n.class, str);
    }

    public static ec3.n[] values() {
        return (ec3.n[]) f251062f.clone();
    }
}
