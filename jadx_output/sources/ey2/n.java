package ey2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final ey2.n f257432d;

    /* renamed from: e, reason: collision with root package name */
    public static final ey2.n f257433e;

    /* renamed from: f, reason: collision with root package name */
    public static final ey2.n f257434f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ey2.n[] f257435g;

    static {
        ey2.n nVar = new ey2.n("None", 0);
        f257432d = nVar;
        ey2.n nVar2 = new ey2.n("Insert", 1);
        f257433e = nVar2;
        ey2.n nVar3 = new ey2.n("Remove", 2);
        ey2.n nVar4 = new ey2.n("Update", 3);
        f257434f = nVar4;
        ey2.n[] nVarArr = {nVar, nVar2, nVar3, nVar4};
        f257435g = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17) {
    }

    public static ey2.n valueOf(java.lang.String str) {
        return (ey2.n) java.lang.Enum.valueOf(ey2.n.class, str);
    }

    public static ey2.n[] values() {
        return (ey2.n[]) f257435g.clone();
    }
}
