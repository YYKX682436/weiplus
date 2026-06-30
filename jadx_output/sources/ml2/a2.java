package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a2 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.a2 f327198e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.a2 f327199f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.a2 f327200g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ml2.a2[] f327201h;

    /* renamed from: d, reason: collision with root package name */
    public final int f327202d;

    static {
        ml2.a2 a2Var = new ml2.a2("EXPOSE", 0, 1);
        f327198e = a2Var;
        ml2.a2 a2Var2 = new ml2.a2("CLICK_2_FOLLOW", 1, 2);
        f327199f = a2Var2;
        ml2.a2 a2Var3 = new ml2.a2("CLICK_2_PROFILE", 2, 3);
        ml2.a2 a2Var4 = new ml2.a2("CLICK_2_AD_PROFILE", 3, 5);
        f327200g = a2Var4;
        ml2.a2[] a2VarArr = {a2Var, a2Var2, a2Var3, a2Var4, new ml2.a2("CLICK_2_FOLLOW_AND_AUDIENCE", 4, 6)};
        f327201h = a2VarArr;
        rz5.b.a(a2VarArr);
    }

    public a2(java.lang.String str, int i17, int i18) {
        this.f327202d = i18;
    }

    public static ml2.a2 valueOf(java.lang.String str) {
        return (ml2.a2) java.lang.Enum.valueOf(ml2.a2.class, str);
    }

    public static ml2.a2[] values() {
        return (ml2.a2[]) f327201h.clone();
    }
}
