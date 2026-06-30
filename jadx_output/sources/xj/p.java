package xj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class p {

    /* renamed from: e, reason: collision with root package name */
    public static final xj.o f454765e;

    /* renamed from: f, reason: collision with root package name */
    public static final xj.p f454766f;

    /* renamed from: g, reason: collision with root package name */
    public static final xj.p f454767g;

    /* renamed from: h, reason: collision with root package name */
    public static final xj.p f454768h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ xj.p[] f454769i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f454770m;

    /* renamed from: d, reason: collision with root package name */
    public final int f454771d;

    static {
        xj.p pVar = new xj.p("CONTROL", 0, 0);
        f454766f = pVar;
        xj.p pVar2 = new xj.p("BIZ_CLIENT_NAVIGATOR", 1, 1);
        xj.p pVar3 = new xj.p("BIZ_CLIENT_LAUNCH", 2, 2);
        xj.p pVar4 = new xj.p("BIZ_SERVER_DIRECT", 3, 3);
        f454767g = pVar4;
        xj.p pVar5 = new xj.p("SMART_ROUTE", 4, 4);
        f454768h = pVar5;
        xj.p[] pVarArr = {pVar, pVar2, pVar3, pVar4, pVar5};
        f454769i = pVarArr;
        f454770m = rz5.b.a(pVarArr);
        f454765e = new xj.o(null);
    }

    public p(java.lang.String str, int i17, int i18) {
        this.f454771d = i18;
    }

    public static xj.p valueOf(java.lang.String str) {
        return (xj.p) java.lang.Enum.valueOf(xj.p.class, str);
    }

    public static xj.p[] values() {
        return (xj.p[]) f454769i.clone();
    }
}
