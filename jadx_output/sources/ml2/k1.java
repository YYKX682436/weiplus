package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class k1 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.k1 f327638e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.k1 f327639f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.k1 f327640g;

    /* renamed from: h, reason: collision with root package name */
    public static final ml2.k1 f327641h;

    /* renamed from: i, reason: collision with root package name */
    public static final ml2.k1 f327642i;

    /* renamed from: m, reason: collision with root package name */
    public static final ml2.k1 f327643m;

    /* renamed from: n, reason: collision with root package name */
    public static final ml2.k1 f327644n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ ml2.k1[] f327645o;

    /* renamed from: d, reason: collision with root package name */
    public final int f327646d;

    static {
        ml2.k1 k1Var = new ml2.k1("BATTLE_ACTION_PK_EXPOSE", 0, 1);
        ml2.k1 k1Var2 = new ml2.k1("BATTLE_ACTION_PK_CLICK", 1, 2);
        ml2.k1 k1Var3 = new ml2.k1("BATTLE_ACTION_PK_ACCEPT_FROM_TIP", 2, 3);
        ml2.k1 k1Var4 = new ml2.k1("BATTLE_ACTION_PK_ACCEPT_FROM_PANEL", 3, 4);
        ml2.k1 k1Var5 = new ml2.k1("BATTLE_ACTION_PK_CANCEL", 4, 5);
        f327638e = k1Var5;
        ml2.k1 k1Var6 = new ml2.k1("BATTLE_ACTION_PK_CANCEL_BY_TIMEOUT", 5, 6);
        ml2.k1 k1Var7 = new ml2.k1("BATTLE_ACTION_PK_END_RESULT", 6, 7);
        ml2.k1 k1Var8 = new ml2.k1("BATTLE_ACTION_PK_END_MIC_BREAK", 7, 8);
        ml2.k1 k1Var9 = new ml2.k1("BATTLE_ACTION_PK_END_LIVE_CLOSE", 8, 9);
        ml2.k1 k1Var10 = new ml2.k1("BATTLE_ACTION_PK_APPLY_FAIL_BY_VERSION", 9, 10);
        ml2.k1 k1Var11 = new ml2.k1("BATTLE_ACTION_RANDOM_MATCH_EXPOSE", 10, 11);
        ml2.k1 k1Var12 = new ml2.k1("BATTLE_ACTION_RANDOM_MATCH_CLICK", 11, 12);
        ml2.k1 k1Var13 = new ml2.k1("BATTLE_ACTION_RANDOM_MATCH_SUCCESS", 12, 13);
        ml2.k1 k1Var14 = new ml2.k1("BATTLE_ACTION_RANDOM_MATCH_CANCEL", 13, 14);
        ml2.k1 k1Var15 = new ml2.k1("BATTLE_ACTION_RANDOM_MATCH_TIMEOUT", 14, 15);
        ml2.k1 k1Var16 = new ml2.k1("BATTLE_ACTION_START_BATTLE", 15, 16);
        f327639f = k1Var16;
        ml2.k1 k1Var17 = new ml2.k1("BATTLE_ACTION_START_SOLO_BATTLE", 16, 17);
        f327640g = k1Var17;
        ml2.k1 k1Var18 = new ml2.k1("BATTLE_ACTION_START_TEAM_BATTLE", 17, 18);
        f327641h = k1Var18;
        ml2.k1 k1Var19 = new ml2.k1("BATTLE_ACTION_VISITOR_CHANGE_MODE", 18, 19);
        f327642i = k1Var19;
        ml2.k1 k1Var20 = new ml2.k1("BATTLE_ACTION_VISITOR_EXIT", 19, 20);
        f327643m = k1Var20;
        ml2.k1 k1Var21 = new ml2.k1("BATTLE_ACTION_VISITOR_FINISH", 20, 21);
        f327644n = k1Var21;
        ml2.k1[] k1VarArr = {k1Var, k1Var2, k1Var3, k1Var4, k1Var5, k1Var6, k1Var7, k1Var8, k1Var9, k1Var10, k1Var11, k1Var12, k1Var13, k1Var14, k1Var15, k1Var16, k1Var17, k1Var18, k1Var19, k1Var20, k1Var21};
        f327645o = k1VarArr;
        rz5.b.a(k1VarArr);
    }

    public k1(java.lang.String str, int i17, int i18) {
        this.f327646d = i18;
    }

    public static ml2.k1 valueOf(java.lang.String str) {
        return (ml2.k1) java.lang.Enum.valueOf(ml2.k1.class, str);
    }

    public static ml2.k1[] values() {
        return (ml2.k1[]) f327645o.clone();
    }
}
