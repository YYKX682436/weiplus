package su2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final su2.g f412740d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ su2.g[] f412741e;

    static {
        su2.g gVar = new su2.g("AUTO_CHECK_WHEN_APP_START", 0, 1);
        su2.g gVar2 = new su2.g("AUTO_CHECK_WHEN_FIRST_ENTER_FINDER", 1, 2);
        su2.g gVar3 = new su2.g("LAZY_CHECK", 2, 3);
        f412740d = gVar3;
        su2.g[] gVarArr = {gVar, gVar2, gVar3};
        f412741e = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17, int i18) {
    }

    public static su2.g valueOf(java.lang.String str) {
        return (su2.g) java.lang.Enum.valueOf(su2.g.class, str);
    }

    public static su2.g[] values() {
        return (su2.g[]) f412741e.clone();
    }
}
