package so2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class h2 {

    /* renamed from: e, reason: collision with root package name */
    public static final so2.h2 f410385e;

    /* renamed from: f, reason: collision with root package name */
    public static final so2.h2 f410386f;

    /* renamed from: g, reason: collision with root package name */
    public static final so2.h2 f410387g;

    /* renamed from: h, reason: collision with root package name */
    public static final so2.h2 f410388h;

    /* renamed from: i, reason: collision with root package name */
    public static final so2.h2 f410389i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ so2.h2[] f410390m;

    /* renamed from: d, reason: collision with root package name */
    public final int f410391d;

    static {
        so2.h2 h2Var = new so2.h2("Default", 0, 0);
        f410385e = h2Var;
        so2.h2 h2Var2 = new so2.h2("BigCard", 1, 1);
        f410386f = h2Var2;
        so2.h2 h2Var3 = new so2.h2("SmallLabel", 2, 2);
        f410387g = h2Var3;
        so2.h2 h2Var4 = new so2.h2("AvatarAround", 3, 3);
        f410388h = h2Var4;
        so2.h2 h2Var5 = new so2.h2("AdCarouse", 4, 4);
        f410389i = h2Var5;
        so2.h2[] h2VarArr = {h2Var, h2Var2, h2Var3, h2Var4, h2Var5};
        f410390m = h2VarArr;
        rz5.b.a(h2VarArr);
    }

    public h2(java.lang.String str, int i17, int i18) {
        this.f410391d = i18;
    }

    public static so2.h2 valueOf(java.lang.String str) {
        return (so2.h2) java.lang.Enum.valueOf(so2.h2.class, str);
    }

    public static so2.h2[] values() {
        return (so2.h2[]) f410390m.clone();
    }
}
