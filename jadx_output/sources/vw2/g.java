package vw2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final vw2.g f440840d;

    /* renamed from: e, reason: collision with root package name */
    public static final vw2.g f440841e;

    /* renamed from: f, reason: collision with root package name */
    public static final vw2.g f440842f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ vw2.g[] f440843g;

    static {
        vw2.g gVar = new vw2.g("OneInterceptorPerHolder", 0);
        f440840d = gVar;
        vw2.g gVar2 = new vw2.g("OncePerHolder", 1);
        f440841e = gVar2;
        vw2.g gVar3 = new vw2.g("Unlimited", 2);
        f440842f = gVar3;
        vw2.g[] gVarArr = {gVar, gVar2, gVar3};
        f440843g = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17) {
    }

    public static vw2.g valueOf(java.lang.String str) {
        return (vw2.g) java.lang.Enum.valueOf(vw2.g.class, str);
    }

    public static vw2.g[] values() {
        return (vw2.g[]) f440843g.clone();
    }
}
