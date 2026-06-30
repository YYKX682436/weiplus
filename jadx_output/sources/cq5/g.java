package cq5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final cq5.g f221533e;

    /* renamed from: f, reason: collision with root package name */
    public static final cq5.g f221534f;

    /* renamed from: g, reason: collision with root package name */
    public static final cq5.g f221535g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ cq5.g[] f221536h;

    /* renamed from: d, reason: collision with root package name */
    public final int f221537d;

    static {
        cq5.g gVar = new cq5.g("SUCCESS", 0, 0);
        f221533e = gVar;
        cq5.g gVar2 = new cq5.g("FAILURE", 1, 1);
        f221534f = gVar2;
        cq5.g gVar3 = new cq5.g("USER_END", 2, 2);
        f221535g = gVar3;
        cq5.g[] gVarArr = {gVar, gVar2, gVar3};
        f221536h = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17, int i18) {
        this.f221537d = i18;
    }

    public static cq5.g valueOf(java.lang.String str) {
        return (cq5.g) java.lang.Enum.valueOf(cq5.g.class, str);
    }

    public static cq5.g[] values() {
        return (cq5.g[]) f221536h.clone();
    }
}
