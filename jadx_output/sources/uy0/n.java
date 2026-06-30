package uy0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final uy0.n f431902e;

    /* renamed from: f, reason: collision with root package name */
    public static final uy0.n f431903f;

    /* renamed from: g, reason: collision with root package name */
    public static final uy0.n f431904g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ uy0.n[] f431905h;

    /* renamed from: d, reason: collision with root package name */
    public final int f431906d;

    static {
        uy0.n nVar = new uy0.n("EXPOSE", 0, 1);
        f431902e = nVar;
        uy0.n nVar2 = new uy0.n("POSITIVE_CLICK", 1, 2);
        f431903f = nVar2;
        uy0.n nVar3 = new uy0.n("NEGATIVE_CLICK", 2, 3);
        f431904g = nVar3;
        uy0.n[] nVarArr = {nVar, nVar2, nVar3};
        f431905h = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17, int i18) {
        this.f431906d = i18;
    }

    public static uy0.n valueOf(java.lang.String str) {
        return (uy0.n) java.lang.Enum.valueOf(uy0.n.class, str);
    }

    public static uy0.n[] values() {
        return (uy0.n[]) f431905h.clone();
    }
}
