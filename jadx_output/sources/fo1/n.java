package fo1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final fo1.n f264884d;

    /* renamed from: e, reason: collision with root package name */
    public static final fo1.n f264885e;

    /* renamed from: f, reason: collision with root package name */
    public static final fo1.n f264886f;

    /* renamed from: g, reason: collision with root package name */
    public static final fo1.n f264887g;

    /* renamed from: h, reason: collision with root package name */
    public static final fo1.n f264888h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ fo1.n[] f264889i;

    static {
        fo1.n nVar = new fo1.n("SUCCESS", 0);
        f264884d = nVar;
        fo1.n nVar2 = new fo1.n("PATH_ERROR", 1);
        f264885e = nVar2;
        fo1.n nVar3 = new fo1.n("META_CORRUPTED", 2);
        f264886f = nVar3;
        fo1.n nVar4 = new fo1.n("PERMISSION_DENIED", 3);
        f264887g = nVar4;
        fo1.n nVar5 = new fo1.n("GENERAL_ERROR", 4);
        f264888h = nVar5;
        fo1.n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5};
        f264889i = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17) {
    }

    public static fo1.n valueOf(java.lang.String str) {
        return (fo1.n) java.lang.Enum.valueOf(fo1.n.class, str);
    }

    public static fo1.n[] values() {
        return (fo1.n[]) f264889i.clone();
    }
}
