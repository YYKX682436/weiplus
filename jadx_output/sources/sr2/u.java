package sr2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final sr2.u f411726d;

    /* renamed from: e, reason: collision with root package name */
    public static final sr2.u f411727e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ sr2.u[] f411728f;

    static {
        sr2.u uVar = new sr2.u("ATTACH", 0);
        f411726d = uVar;
        sr2.u uVar2 = new sr2.u("SCROLL", 1);
        f411727e = uVar2;
        sr2.u[] uVarArr = {uVar, uVar2};
        f411728f = uVarArr;
        rz5.b.a(uVarArr);
    }

    public u(java.lang.String str, int i17) {
    }

    public static sr2.u valueOf(java.lang.String str) {
        return (sr2.u) java.lang.Enum.valueOf(sr2.u.class, str);
    }

    public static sr2.u[] values() {
        return (sr2.u[]) f411728f.clone();
    }
}
