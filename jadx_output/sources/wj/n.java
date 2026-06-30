package wj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final wj.n f446447d;

    /* renamed from: e, reason: collision with root package name */
    public static final wj.n f446448e;

    /* renamed from: f, reason: collision with root package name */
    public static final wj.n f446449f;

    /* renamed from: g, reason: collision with root package name */
    public static final wj.n f446450g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ wj.n[] f446451h;

    static {
        wj.n nVar = new wj.n("NotFound", 0);
        f446447d = nVar;
        wj.n nVar2 = new wj.n("NoInstall", 1);
        f446448e = nVar2;
        wj.n nVar3 = new wj.n("InstallNotMatchVersion", 2);
        f446449f = nVar3;
        wj.n nVar4 = new wj.n("InstallMatchVersion", 3);
        f446450g = nVar4;
        wj.n[] nVarArr = {nVar, nVar2, nVar3, nVar4};
        f446451h = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17) {
    }

    public static wj.n valueOf(java.lang.String str) {
        return (wj.n) java.lang.Enum.valueOf(wj.n.class, str);
    }

    public static wj.n[] values() {
        return (wj.n[]) f446451h.clone();
    }
}
