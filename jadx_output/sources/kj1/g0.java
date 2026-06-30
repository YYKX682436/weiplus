package kj1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class g0 {

    /* renamed from: d, reason: collision with root package name */
    public static final kj1.g0 f308326d;

    /* renamed from: e, reason: collision with root package name */
    public static final kj1.g0 f308327e;

    /* renamed from: f, reason: collision with root package name */
    public static final kj1.g0 f308328f;

    /* renamed from: g, reason: collision with root package name */
    public static final kj1.g0 f308329g;

    /* renamed from: h, reason: collision with root package name */
    public static final kj1.g0 f308330h;

    /* renamed from: i, reason: collision with root package name */
    public static final kj1.g0 f308331i;

    /* renamed from: m, reason: collision with root package name */
    public static final kj1.g0 f308332m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ kj1.g0[] f308333n;

    static {
        kj1.g0 g0Var = new kj1.g0("SUCCESS", 0, 0, "OK");
        f308326d = g0Var;
        kj1.g0 g0Var2 = new kj1.g0("ILLEGAL_LINK", 1, com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMNOTFOUND, "illegal link");
        f308327e = g0Var2;
        kj1.g0 g0Var3 = new kj1.g0("DECODE_LINK_FAIL", 2, com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMTYPEERROR, "decode link fail");
        f308328f = g0Var3;
        kj1.g0 g0Var4 = new kj1.g0("USER_CANCEL", 3, com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PLATFORMVIEWNOTFOUND, "user cancel");
        f308329g = g0Var4;
        kj1.g0 g0Var5 = new kj1.g0("CONTEXT_RELEASE", 4, com.tencent.live.TXLivePluginDef.ErrorCode.CODE_VALUEISNULL, "context release");
        f308330h = g0Var5;
        kj1.g0 g0Var6 = new kj1.g0("INTERRUPT", 5, -1005, "interrupt");
        f308331i = g0Var6;
        kj1.g0 g0Var7 = new kj1.g0("LAUNCH_PHASE_FAIL", 6, -1006, "launch phase fail");
        f308332m = g0Var7;
        kj1.g0[] g0VarArr = {g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6, g0Var7};
        f308333n = g0VarArr;
        rz5.b.a(g0VarArr);
    }

    public g0(java.lang.String str, int i17, int i18, java.lang.String str2) {
    }

    public static kj1.g0 valueOf(java.lang.String str) {
        return (kj1.g0) java.lang.Enum.valueOf(kj1.g0.class, str);
    }

    public static kj1.g0[] values() {
        return (kj1.g0[]) f308333n.clone();
    }
}
