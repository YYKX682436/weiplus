package wj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class o0 {

    /* renamed from: e, reason: collision with root package name */
    public static final wj.o0 f446456e;

    /* renamed from: f, reason: collision with root package name */
    public static final wj.o0 f446457f;

    /* renamed from: g, reason: collision with root package name */
    public static final wj.o0 f446458g;

    /* renamed from: h, reason: collision with root package name */
    public static final wj.o0 f446459h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ wj.o0[] f446460i;

    /* renamed from: d, reason: collision with root package name */
    public final int f446461d;

    static {
        wj.o0 o0Var = new wj.o0("GetSuccess", 0, 0);
        f446456e = o0Var;
        wj.o0 o0Var2 = new wj.o0("NoAdAvailable", 1, 1);
        f446457f = o0Var2;
        wj.o0 o0Var3 = new wj.o0("FeedBack", 2, 3);
        f446458g = o0Var3;
        wj.o0 o0Var4 = new wj.o0("Reject", 3, 4);
        f446459h = o0Var4;
        wj.o0[] o0VarArr = {o0Var, o0Var2, o0Var3, o0Var4, new wj.o0("Fallback", 4, 7)};
        f446460i = o0VarArr;
        rz5.b.a(o0VarArr);
    }

    public o0(java.lang.String str, int i17, int i18) {
        this.f446461d = i18;
    }

    public static wj.o0 valueOf(java.lang.String str) {
        return (wj.o0) java.lang.Enum.valueOf(wj.o0.class, str);
    }

    public static wj.o0[] values() {
        return (wj.o0[]) f446460i.clone();
    }
}
