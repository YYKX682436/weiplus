package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class n1 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.n1 f327723e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.n1 f327724f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.n1 f327725g;

    /* renamed from: h, reason: collision with root package name */
    public static final ml2.n1 f327726h;

    /* renamed from: i, reason: collision with root package name */
    public static final ml2.n1 f327727i;

    /* renamed from: m, reason: collision with root package name */
    public static final ml2.n1 f327728m;

    /* renamed from: n, reason: collision with root package name */
    public static final ml2.n1 f327729n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ ml2.n1[] f327730o;

    /* renamed from: d, reason: collision with root package name */
    public final int f327731d;

    static {
        ml2.n1 n1Var = new ml2.n1("CAST_SCREEN_EXPOSE", 0, 1);
        f327723e = n1Var;
        ml2.n1 n1Var2 = new ml2.n1("CAST_SCREEN_CLICK_MENU", 1, 2);
        f327724f = n1Var2;
        ml2.n1 n1Var3 = new ml2.n1("CAST_SCREEN_DEVICE_EXPOSE", 2, 3);
        f327725g = n1Var3;
        ml2.n1 n1Var4 = new ml2.n1("CAST_SCREEN_CLICK_DEVICE", 3, 4);
        f327726h = n1Var4;
        ml2.n1 n1Var5 = new ml2.n1("CAST_SCREEN_SUCCESS", 4, 5);
        f327727i = n1Var5;
        ml2.n1 n1Var6 = new ml2.n1("CAST_SCREEN_BREAK", 5, 6);
        f327728m = n1Var6;
        ml2.n1 n1Var7 = new ml2.n1("CAST_SCREEN_TIMEOUT", 6, 7);
        f327729n = n1Var7;
        ml2.n1[] n1VarArr = {n1Var, n1Var2, n1Var3, n1Var4, n1Var5, n1Var6, n1Var7};
        f327730o = n1VarArr;
        rz5.b.a(n1VarArr);
    }

    public n1(java.lang.String str, int i17, int i18) {
        this.f327731d = i18;
    }

    public static ml2.n1 valueOf(java.lang.String str) {
        return (ml2.n1) java.lang.Enum.valueOf(ml2.n1.class, str);
    }

    public static ml2.n1[] values() {
        return (ml2.n1[]) f327730o.clone();
    }
}
