package l44;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class e0 {

    /* renamed from: d, reason: collision with root package name */
    public static final l44.e0 f316093d;

    /* renamed from: e, reason: collision with root package name */
    public static final l44.e0 f316094e;

    /* renamed from: f, reason: collision with root package name */
    public static final l44.e0 f316095f;

    /* renamed from: g, reason: collision with root package name */
    public static final l44.e0 f316096g;

    /* renamed from: h, reason: collision with root package name */
    public static final l44.e0 f316097h;

    /* renamed from: i, reason: collision with root package name */
    public static final l44.e0 f316098i;

    /* renamed from: m, reason: collision with root package name */
    public static final l44.e0 f316099m;

    /* renamed from: n, reason: collision with root package name */
    public static final l44.e0 f316100n;

    /* renamed from: o, reason: collision with root package name */
    public static final l44.e0 f316101o;

    /* renamed from: p, reason: collision with root package name */
    public static final l44.e0 f316102p;

    /* renamed from: q, reason: collision with root package name */
    public static final l44.e0 f316103q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ l44.e0[] f316104r;

    static {
        l44.e0 e0Var = new l44.e0("LIKE", 0);
        f316093d = e0Var;
        l44.e0 e0Var2 = new l44.e0("UNLIKE", 1);
        f316094e = e0Var2;
        l44.e0 e0Var3 = new l44.e0("COMMENT", 2);
        f316095f = e0Var3;
        l44.e0 e0Var4 = new l44.e0("LIKE_ANIM_END", 3);
        f316096g = e0Var4;
        l44.e0 e0Var5 = new l44.e0("LIKE_RESPONSE", 4);
        f316097h = e0Var5;
        l44.e0 e0Var6 = new l44.e0("UNLIKE_STATE_SINGLE_TAP", 5);
        f316098i = e0Var6;
        l44.e0 e0Var7 = new l44.e0("LIKED_STATE_SINGLE_TAP", 6);
        f316099m = e0Var7;
        l44.e0 e0Var8 = new l44.e0("UNLIKE_STATE_DOUBLE_TAP", 7);
        f316100n = e0Var8;
        l44.e0 e0Var9 = new l44.e0("LIKED_STATE_DOUBLE_TAP", 8);
        f316101o = e0Var9;
        l44.e0 e0Var10 = new l44.e0("PLAY", 9);
        f316102p = e0Var10;
        l44.e0 e0Var11 = new l44.e0("BREAK_FRAME_PAG_END", 10);
        f316103q = e0Var11;
        l44.e0 e0Var12 = new l44.e0("UNLIKE_RESPONSE", 11);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$InteractType");
        l44.e0[] e0VarArr = {e0Var, e0Var2, e0Var3, e0Var4, e0Var5, e0Var6, e0Var7, e0Var8, e0Var9, e0Var10, e0Var11, e0Var12};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$InteractType");
        f316104r = e0VarArr;
        rz5.b.a(e0VarArr);
    }

    public e0(java.lang.String str, int i17) {
    }

    public static l44.e0 valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$InteractType");
        l44.e0 e0Var = (l44.e0) java.lang.Enum.valueOf(l44.e0.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$InteractType");
        return e0Var;
    }

    public static l44.e0[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$InteractType");
        l44.e0[] e0VarArr = (l44.e0[]) f316104r.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$InteractType");
        return e0VarArr;
    }
}
