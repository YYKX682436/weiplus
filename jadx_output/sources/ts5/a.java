package ts5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final ts5.a f421723e;

    /* renamed from: f, reason: collision with root package name */
    public static final ts5.a f421724f;

    /* renamed from: g, reason: collision with root package name */
    public static final ts5.a f421725g;

    /* renamed from: h, reason: collision with root package name */
    public static final ts5.a f421726h;

    /* renamed from: i, reason: collision with root package name */
    public static final ts5.a f421727i;

    /* renamed from: m, reason: collision with root package name */
    public static final ts5.a f421728m;

    /* renamed from: n, reason: collision with root package name */
    public static final ts5.a f421729n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ ts5.a[] f421730o;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f421731d;

    static {
        ts5.a aVar = new ts5.a("NON_DEFINE", 0, null, false, 3, null);
        int i17 = 2;
        boolean z17 = false;
        kotlin.jvm.internal.i iVar = null;
        ts5.a aVar2 = new ts5.a("MEMORY_VISITOR_PROCESS_STATE", 1, "在直播间内各阶段情况。onLiveDeactivate 时上报。old type is 2002", z17, i17, iVar);
        f421723e = aVar2;
        boolean z18 = false;
        int i18 = 2;
        kotlin.jvm.internal.i iVar2 = null;
        ts5.a aVar3 = new ts5.a("MEMORY_VISITOR_EXIT_STATE", 2, "退出后累计一段时间的情况。任务可能会被终止。old type is 2003", z18, i18, iVar2);
        f421724f = aVar3;
        boolean z19 = false;
        kotlin.jvm.internal.i iVar3 = null;
        ts5.a aVar4 = new ts5.a("SUPER_DOWNLOAD_REPORT", 3, null, z19, 3, iVar3);
        ts5.a aVar5 = new ts5.a("POWER_VISITOR_PROCESS_RANGE_1_STATE", 4, "在直播间内的能耗", z18, i18, iVar2);
        f421725g = aVar5;
        ts5.a aVar6 = new ts5.a("POWER_VISITOR_EXIT_RANGE_1_STATE", 5, "退出直播后的能耗", z19, 2, iVar3);
        f421726h = aVar6;
        ts5.a aVar7 = new ts5.a("TRTC_MEMORY_PERFORMANCE_STATE", 6, "连麦期间内存", z17, i17, iVar);
        java.lang.String str = "TRTC_POWER_PERFORMANCE_STATE";
        int i19 = 7;
        java.lang.String str2 = "连麦期间功耗";
        ts5.a aVar8 = new ts5.a(str, i19, str2, false, 2, null);
        f421727i = aVar8;
        ts5.a aVar9 = new ts5.a("ANCHOR_POWER", 8, "主播开播能耗", true);
        f421728m = aVar9;
        ts5.a aVar10 = new ts5.a("ANCHOR_TEMPERATURE", 9, "主播开播温度", true);
        f421729n = aVar10;
        ts5.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10};
        f421730o = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, java.lang.String str2, boolean z17) {
        this.f421731d = z17;
    }

    public static ts5.a valueOf(java.lang.String str) {
        return (ts5.a) java.lang.Enum.valueOf(ts5.a.class, str);
    }

    public static ts5.a[] values() {
        return (ts5.a[]) f421730o.clone();
    }

    public /* synthetic */ a(java.lang.String str, int i17, java.lang.String str2, boolean z17, int i18, kotlin.jvm.internal.i iVar) {
        this(str, i17, (i18 & 1) != 0 ? "" : str2, (i18 & 2) != 0 ? false : z17);
    }
}
