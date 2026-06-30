package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class o1 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.o1 f327767e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.o1 f327768f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.o1 f327769g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ml2.o1[] f327770h;

    /* renamed from: d, reason: collision with root package name */
    public final int f327771d;

    static {
        ml2.o1 o1Var = new ml2.o1("CLICK_CLEAR_SCREEN", 0, 1);
        f327767e = o1Var;
        ml2.o1 o1Var2 = new ml2.o1("CLICK_CLEAR_SCREEN_CANCEL", 1, 2);
        f327768f = o1Var2;
        ml2.o1 o1Var3 = new ml2.o1("CLICK_CLEAR_SCREEN_MENU", 2, 3);
        f327769g = o1Var3;
        ml2.o1[] o1VarArr = {o1Var, o1Var2, o1Var3};
        f327770h = o1VarArr;
        rz5.b.a(o1VarArr);
    }

    public o1(java.lang.String str, int i17, int i18) {
        this.f327771d = i18;
    }

    public static ml2.o1 valueOf(java.lang.String str) {
        return (ml2.o1) java.lang.Enum.valueOf(ml2.o1.class, str);
    }

    public static ml2.o1[] values() {
        return (ml2.o1[]) f327770h.clone();
    }
}
