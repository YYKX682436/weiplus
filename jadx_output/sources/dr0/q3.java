package dr0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class q3 {

    /* renamed from: g, reason: collision with root package name */
    public static final dr0.q3 f242503g;

    /* renamed from: h, reason: collision with root package name */
    public static final dr0.q3 f242504h;

    /* renamed from: i, reason: collision with root package name */
    public static final dr0.q3 f242505i;

    /* renamed from: m, reason: collision with root package name */
    public static final dr0.q3 f242506m;

    /* renamed from: n, reason: collision with root package name */
    public static final dr0.q3 f242507n;

    /* renamed from: o, reason: collision with root package name */
    public static final dr0.q3 f242508o;

    /* renamed from: p, reason: collision with root package name */
    public static final dr0.q3 f242509p;

    /* renamed from: q, reason: collision with root package name */
    public static final dr0.q3 f242510q;

    /* renamed from: r, reason: collision with root package name */
    public static final dr0.q3 f242511r;

    /* renamed from: s, reason: collision with root package name */
    public static final dr0.q3 f242512s;

    /* renamed from: t, reason: collision with root package name */
    public static final dr0.q3 f242513t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ dr0.q3[] f242514u;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f242515d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f242516e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f242517f;

    static {
        dr0.q3 q3Var = new dr0.q3("SAVE_STATS", 0, "SaveStats", dr0.f3.f242423d, false, 4, null);
        f242503g = q3Var;
        boolean z17 = false;
        int i17 = 4;
        kotlin.jvm.internal.i iVar = null;
        dr0.q3 q3Var2 = new dr0.q3("RECYCLE_CONTINUOUS", 1, "RecycleContinuous", dr0.g3.f242428d, z17, i17, iVar);
        f242504h = q3Var2;
        boolean z18 = false;
        int i18 = 4;
        kotlin.jvm.internal.i iVar2 = null;
        dr0.q3 q3Var3 = new dr0.q3("RECYCLE_BG", 2, "RecycleBg", dr0.h3.f242431d, z18, i18, iVar2);
        f242505i = q3Var3;
        dr0.q3 q3Var4 = new dr0.q3("RECYCLE_DEEP_BG", 3, "RecycleDeepBg", dr0.i3.f242434d, z17, i17, iVar);
        f242506m = q3Var4;
        dr0.q3 q3Var5 = new dr0.q3("RECYCLE_PERIODICAL", 4, "RecyclePeriodical", dr0.j3.f242450d, z18, i18, iVar2);
        f242507n = q3Var5;
        dr0.q3 q3Var6 = new dr0.q3("RECYCLE_APP_STANDBY", 5, "RecycleAppStandby", dr0.k3.f242456d, z17, i17, iVar);
        f242508o = q3Var6;
        dr0.q3 q3Var7 = new dr0.q3("RECYCLE_SYSTEM_DOZE", 6, "RecycleSystemDoze", dr0.l3.f242464d, z18, i18, iVar2);
        f242509p = q3Var7;
        dr0.q3 q3Var8 = new dr0.q3("RECYCLE_BATTERY_RESTRICT", 7, "RecycleBatteryRestrict", dr0.m3.f242471d, false, 4, null);
        f242510q = q3Var8;
        dr0.q3 q3Var9 = new dr0.q3("RECYCLE_MANUAL", 8, "RecycleManual", dr0.n3.f242476d, false, 4, null);
        f242511r = q3Var9;
        boolean z19 = false;
        int i19 = 4;
        kotlin.jvm.internal.i iVar3 = null;
        dr0.q3 q3Var10 = new dr0.q3("PERIODICAL_WAKE_UP", 9, "WakeUpPeriod", dr0.b3.f242413d, z19, i19, iVar3);
        dr0.q3 q3Var11 = new dr0.q3("PERIODICAL_COLLECT_CPU", 10, "CollectCpuTime", dr0.c3.f242415d, false, 4, null);
        dr0.q3 q3Var12 = new dr0.q3("PERIODICAL_HIBERNATE_CHECK", 11, "HibernateCheck", dr0.d3.f242418d, false);
        f242512s = q3Var12;
        dr0.q3 q3Var13 = new dr0.q3("CHECK_ALIVE", 12, "CheckAlive", dr0.e3.f242420d, z19, i19, iVar3);
        f242513t = q3Var13;
        dr0.q3[] q3VarArr = {q3Var, q3Var2, q3Var3, q3Var4, q3Var5, q3Var6, q3Var7, q3Var8, q3Var9, q3Var10, q3Var11, q3Var12, q3Var13};
        f242514u = q3VarArr;
        rz5.b.a(q3VarArr);
    }

    public q3(java.lang.String str, int i17, java.lang.String str2, java.lang.Runnable runnable, boolean z17) {
        this.f242515d = str2;
        this.f242516e = runnable;
        new android.os.Bundle();
    }

    public static void i(dr0.q3 q3Var, android.os.Bundle bundle, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: run");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.ProcLifeTasks", "TASK run: " + q3Var.f242515d);
        q3Var.f242516e.run();
        q3Var.f242517f = false;
        if (dr0.r3.f242523a.contains(q3Var)) {
            dr0.x0.f242571a.c(q3Var.name(), "run");
        }
    }

    public static void j(dr0.q3 q3Var, long j17, android.os.Bundle bundle, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: schedule");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.ProcLifeTasks", "TASK post: " + q3Var.f242515d + ", delay=" + j17);
        q3Var.f242517f = true;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (j17 <= 0) {
            ((ku5.t0) ku5.t0.f312615d).h(new dr0.o3(q3Var, currentTimeMillis), q3Var.f242515d);
        } else {
            ((ku5.t0) ku5.t0.f312615d).l(new dr0.p3(q3Var, currentTimeMillis), j17, q3Var.f242515d);
        }
        if (dr0.r3.f242523a.contains(q3Var)) {
            dr0.x0.f242571a.c(q3Var.name(), "post");
        }
    }

    public static dr0.q3 valueOf(java.lang.String str) {
        return (dr0.q3) java.lang.Enum.valueOf(dr0.q3.class, str);
    }

    public static dr0.q3[] values() {
        return (dr0.q3[]) f242514u.clone();
    }

    public final void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.ProcLifeTasks", "TASK cancel: " + this.f242515d);
        ((ku5.t0) ku5.t0.f312615d).A(this.f242515d);
        this.f242517f = false;
        java.util.List list = dr0.r3.f242523a;
        if (dr0.r3.f242523a.contains(this)) {
            dr0.x0.f242571a.c(name(), "post-cancel");
        }
    }

    public /* synthetic */ q3(java.lang.String str, int i17, java.lang.String str2, java.lang.Runnable runnable, boolean z17, int i18, kotlin.jvm.internal.i iVar) {
        this(str, i17, str2, runnable, (i18 & 4) != 0 ? true : z17);
    }
}
