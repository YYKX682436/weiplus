package ym3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static final ym3.p f463179d;

    /* renamed from: e, reason: collision with root package name */
    public static final ym3.p f463180e;

    /* renamed from: f, reason: collision with root package name */
    public static final ym3.p f463181f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ym3.p[] f463182g;

    static {
        ym3.p pVar = new ym3.p("AfterLoadPage", 0);
        f463179d = pVar;
        ym3.p pVar2 = new ym3.p("BeforeLoadPage", 1);
        f463180e = pVar2;
        ym3.p pVar3 = new ym3.p("UIRefresh", 2);
        f463181f = pVar3;
        ym3.p[] pVarArr = {pVar, pVar2, pVar3};
        f463182g = pVarArr;
        rz5.b.a(pVarArr);
    }

    public p(java.lang.String str, int i17) {
    }

    public static ym3.p valueOf(java.lang.String str) {
        return (ym3.p) java.lang.Enum.valueOf(ym3.p.class, str);
    }

    public static ym3.p[] values() {
        return (ym3.p[]) f463182g.clone();
    }
}
