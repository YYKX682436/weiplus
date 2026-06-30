package vl2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final vl2.g f437816d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ vl2.g[] f437817e;

    static {
        vl2.g gVar = new vl2.g("AUTO_CHECK_WHEN_APP_START", 0, 1);
        vl2.g gVar2 = new vl2.g("AUTO_CHECK_WHEN_FIRST_ENTER_LIVE", 1, 2);
        vl2.g gVar3 = new vl2.g("LAZY_CHECK", 2, 3);
        f437816d = gVar3;
        vl2.g[] gVarArr = {gVar, gVar2, gVar3};
        f437817e = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17, int i18) {
    }

    public static vl2.g valueOf(java.lang.String str) {
        return (vl2.g) java.lang.Enum.valueOf(vl2.g.class, str);
    }

    public static vl2.g[] values() {
        return (vl2.g[]) f437817e.clone();
    }
}
