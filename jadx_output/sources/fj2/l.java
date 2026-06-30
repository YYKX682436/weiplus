package fj2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final fj2.l f263178d;

    /* renamed from: e, reason: collision with root package name */
    public static final fj2.l f263179e;

    /* renamed from: f, reason: collision with root package name */
    public static final fj2.l f263180f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ fj2.l[] f263181g;

    static {
        fj2.l lVar = new fj2.l("NORMAL_MIC_FOCUS", 0);
        f263178d = lVar;
        fj2.l lVar2 = new fj2.l("VISITOR_SCRREN_SHARE", 1);
        f263179e = lVar2;
        fj2.l lVar3 = new fj2.l("ANCHOR_SCRREN_SHARE", 2);
        f263180f = lVar3;
        fj2.l[] lVarArr = {lVar, lVar2, lVar3};
        f263181g = lVarArr;
        rz5.b.a(lVarArr);
    }

    public l(java.lang.String str, int i17) {
    }

    public static fj2.l valueOf(java.lang.String str) {
        return (fj2.l) java.lang.Enum.valueOf(fj2.l.class, str);
    }

    public static fj2.l[] values() {
        return (fj2.l[]) f263181g.clone();
    }
}
