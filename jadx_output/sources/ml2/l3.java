package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class l3 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.l3 f327694e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.l3 f327695f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.l3 f327696g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ml2.l3[] f327697h;

    /* renamed from: d, reason: collision with root package name */
    public final int f327698d;

    static {
        ml2.l3 l3Var = new ml2.l3("ENTER_PAGE_EXPLORE", 0, 1);
        f327694e = l3Var;
        ml2.l3 l3Var2 = new ml2.l3("CLICK_CANCEL_RETURN", 1, 2);
        f327695f = l3Var2;
        ml2.l3 l3Var3 = new ml2.l3("CLICK_START_LIVE", 2, 3);
        f327696g = l3Var3;
        ml2.l3[] l3VarArr = {l3Var, l3Var2, l3Var3};
        f327697h = l3VarArr;
        rz5.b.a(l3VarArr);
    }

    public l3(java.lang.String str, int i17, int i18) {
        this.f327698d = i18;
    }

    public static ml2.l3 valueOf(java.lang.String str) {
        return (ml2.l3) java.lang.Enum.valueOf(ml2.l3.class, str);
    }

    public static ml2.l3[] values() {
        return (ml2.l3[]) f327697h.clone();
    }
}
