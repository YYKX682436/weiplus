package mv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class h0 {

    /* renamed from: e, reason: collision with root package name */
    public static final mv.g0 f331509e;

    /* renamed from: f, reason: collision with root package name */
    public static final mv.h0 f331510f;

    /* renamed from: g, reason: collision with root package name */
    public static final mv.h0 f331511g;

    /* renamed from: h, reason: collision with root package name */
    public static final mv.h0 f331512h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ mv.h0[] f331513i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f331514m;

    /* renamed from: d, reason: collision with root package name */
    public final int f331515d;

    static {
        mv.h0 h0Var = new mv.h0("AUTO_BACKUP", 0, 1);
        f331510f = h0Var;
        mv.h0 h0Var2 = new mv.h0("BACKUP", 1, 2);
        f331511g = h0Var2;
        mv.h0 h0Var3 = new mv.h0("RESTORE", 2, 3);
        f331512h = h0Var3;
        mv.h0[] h0VarArr = {h0Var, h0Var2, h0Var3};
        f331513i = h0VarArr;
        f331514m = rz5.b.a(h0VarArr);
        f331509e = new mv.g0(null);
    }

    public h0(java.lang.String str, int i17, int i18) {
        this.f331515d = i18;
    }

    public static mv.h0 valueOf(java.lang.String str) {
        return (mv.h0) java.lang.Enum.valueOf(mv.h0.class, str);
    }

    public static mv.h0[] values() {
        return (mv.h0[]) f331513i.clone();
    }
}
