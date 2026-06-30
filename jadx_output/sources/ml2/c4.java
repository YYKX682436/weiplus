package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c4 {

    /* renamed from: d, reason: collision with root package name */
    public static final ml2.c4 f327332d;

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.c4 f327333e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.c4 f327334f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.c4 f327335g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ml2.c4[] f327336h;

    static {
        ml2.c4 c4Var = new ml2.c4("SHOW_AD_HALF", 0, 1);
        f327332d = c4Var;
        ml2.c4 c4Var2 = new ml2.c4("AD_HALF_AVATOR_EXPOSE", 1, 2);
        f327333e = c4Var2;
        ml2.c4 c4Var3 = new ml2.c4("AD_HALF_PROFILE_CLICK", 2, 3);
        f327334f = c4Var3;
        ml2.c4 c4Var4 = new ml2.c4("AD_HALF_FOLLOW_EXPOSE", 3, 4);
        f327335g = c4Var4;
        ml2.c4[] c4VarArr = {c4Var, c4Var2, c4Var3, c4Var4};
        f327336h = c4VarArr;
        rz5.b.a(c4VarArr);
    }

    public c4(java.lang.String str, int i17, int i18) {
    }

    public static ml2.c4 valueOf(java.lang.String str) {
        return (ml2.c4) java.lang.Enum.valueOf(ml2.c4.class, str);
    }

    public static ml2.c4[] values() {
        return (ml2.c4[]) f327336h.clone();
    }
}
