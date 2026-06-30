package com.tencent.mm.plugin.finder.report;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class y1 {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.y1 f125449f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.y1 f125450g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.y1 f125451h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.y1 f125452i;

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.y1 f125453m;

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.y1 f125454n;

    /* renamed from: o, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.y1 f125455o;

    /* renamed from: p, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.y1 f125456p;

    /* renamed from: q, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.y1 f125457q;

    /* renamed from: r, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.y1 f125458r;

    /* renamed from: s, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.y1 f125459s;

    /* renamed from: t, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.y1 f125460t;

    /* renamed from: u, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.y1 f125461u;

    /* renamed from: v, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.y1 f125462v;

    /* renamed from: w, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.y1 f125463w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.report.y1[] f125464x;

    /* renamed from: d, reason: collision with root package name */
    public final int f125465d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f125466e;

    static {
        com.tencent.mm.plugin.finder.report.y1 y1Var = new com.tencent.mm.plugin.finder.report.y1("ENTER_FINDER_TOTAL", 0, 1, "进入视频号总量");
        f125449f = y1Var;
        com.tencent.mm.plugin.finder.report.y1 y1Var2 = new com.tencent.mm.plugin.finder.report.y1("ENTER_FINDER_TASK_TOTAL", 1, 2, "进入视频号task总量");
        f125450g = y1Var2;
        com.tencent.mm.plugin.finder.report.y1 y1Var3 = new com.tencent.mm.plugin.finder.report.y1("ENTER_FINDER_TASK_FROM_SYSTEM_UI", 2, 3, "从系统多任务进入视频号task");
        f125451h = y1Var3;
        com.tencent.mm.plugin.finder.report.y1 y1Var4 = new com.tencent.mm.plugin.finder.report.y1("ENTER_FINDER_TASK_FROM_WECHAT", 3, 4, "从微信内进入视频号task");
        f125452i = y1Var4;
        com.tencent.mm.plugin.finder.report.y1 y1Var5 = new com.tencent.mm.plugin.finder.report.y1("EXIT_FROM_FINDER_TASK", 4, 5, "从视频号task退后台");
        f125453m = y1Var5;
        com.tencent.mm.plugin.finder.report.y1 y1Var6 = new com.tencent.mm.plugin.finder.report.y1("ENTER_FINDER_TASK_FROM_SCREEN_OFF", 5, 6, "从息屏到亮屏进入视频号task");
        f125454n = y1Var6;
        com.tencent.mm.plugin.finder.report.y1 y1Var7 = new com.tencent.mm.plugin.finder.report.y1("ENTER_FINDER_TASK_LIVE", 6, 7, "进入视频号task的直播间");
        f125455o = y1Var7;
        com.tencent.mm.plugin.finder.report.y1 y1Var8 = new com.tencent.mm.plugin.finder.report.y1("ENTER_NORMAL_TASK_LIVE", 7, 8, "进入主task的直播间");
        f125456p = y1Var8;
        com.tencent.mm.plugin.finder.report.y1 y1Var9 = new com.tencent.mm.plugin.finder.report.y1("ENTER_FINDER_TASK_FROM_LAUNCHER", 8, 9, "点击桌面微信icon进入视频号task");
        f125457q = y1Var9;
        com.tencent.mm.plugin.finder.report.y1 y1Var10 = new com.tencent.mm.plugin.finder.report.y1("FINDER_TASK_ON_RESUME_TOTAL", 9, 101, "OnResume总量");
        f125458r = y1Var10;
        com.tencent.mm.plugin.finder.report.y1 y1Var11 = new com.tencent.mm.plugin.finder.report.y1("FINDER_TASK_ON_RESUME_UNKNOWN", 10, 102, "未知来源OnResume(大概率多任务)");
        f125459s = y1Var11;
        com.tencent.mm.plugin.finder.report.y1 y1Var12 = new com.tencent.mm.plugin.finder.report.y1("FINDER_TASK_ON_RESUME_FROM_ON_CREATE", 11, 103, "OnResume来源为onCreate");
        f125460t = y1Var12;
        com.tencent.mm.plugin.finder.report.y1 y1Var13 = new com.tencent.mm.plugin.finder.report.y1("FINDER_TASK_ON_RESUME_FROM_NEW_INTENT", 12, 104, "OnResume来源为onNewIntent");
        f125461u = y1Var13;
        com.tencent.mm.plugin.finder.report.y1 y1Var14 = new com.tencent.mm.plugin.finder.report.y1("FINDER_TASK_ON_RESUME_FROM_SCREEN_OFF", 13, 105, "OnResume来源为息屏再开");
        f125462v = y1Var14;
        com.tencent.mm.plugin.finder.report.y1 y1Var15 = new com.tencent.mm.plugin.finder.report.y1("FINDER_TASK_ON_RESUME_FROM_LAUNCHER", 14, 106, "OnResume来源为从桌面点开");
        f125463w = y1Var15;
        com.tencent.mm.plugin.finder.report.y1[] y1VarArr = {y1Var, y1Var2, y1Var3, y1Var4, y1Var5, y1Var6, y1Var7, y1Var8, y1Var9, y1Var10, y1Var11, y1Var12, y1Var13, y1Var14, y1Var15};
        f125464x = y1VarArr;
        rz5.b.a(y1VarArr);
    }

    public y1(java.lang.String str, int i17, int i18, java.lang.String str2) {
        this.f125465d = i18;
        this.f125466e = str2;
    }

    public static com.tencent.mm.plugin.finder.report.y1 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.report.y1) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.report.y1.class, str);
    }

    public static com.tencent.mm.plugin.finder.report.y1[] values() {
        return (com.tencent.mm.plugin.finder.report.y1[]) f125464x.clone();
    }
}
