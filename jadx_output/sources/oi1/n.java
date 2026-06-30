package oi1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final oi1.n f345607d;

    /* renamed from: e, reason: collision with root package name */
    public static final oi1.n f345608e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ oi1.n[] f345609f;

    static {
        oi1.n nVar = new oi1.n("NONE", 0);
        oi1.n nVar2 = new oi1.n("SILENT", 1);
        f345607d = nVar2;
        oi1.n nVar3 = new oi1.n("WITH_CONFIRM_DIALOG", 2);
        f345608e = nVar3;
        oi1.n[] nVarArr = {nVar, nVar2, nVar3};
        f345609f = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17) {
    }

    public static oi1.n valueOf(java.lang.String str) {
        return (oi1.n) java.lang.Enum.valueOf(oi1.n.class, str);
    }

    public static oi1.n[] values() {
        return (oi1.n[]) f345609f.clone();
    }
}
