package s74;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class q0 {

    /* renamed from: d, reason: collision with root package name */
    public static final s74.q0 f404499d;

    /* renamed from: e, reason: collision with root package name */
    public static final s74.q0 f404500e;

    /* renamed from: f, reason: collision with root package name */
    public static final s74.q0 f404501f;

    /* renamed from: g, reason: collision with root package name */
    public static final s74.q0 f404502g;

    /* renamed from: h, reason: collision with root package name */
    public static final s74.q0 f404503h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ s74.q0[] f404504i;

    static {
        s74.q0 q0Var = new s74.q0("Playing", 0);
        f404499d = q0Var;
        s74.q0 q0Var2 = new s74.q0("Loading", 1);
        f404500e = q0Var2;
        s74.q0 q0Var3 = new s74.q0("Error", 2);
        f404501f = q0Var3;
        s74.q0 q0Var4 = new s74.q0("Pause", 3);
        f404502g = q0Var4;
        s74.q0 q0Var5 = new s74.q0("PauseAndErrorTv", 4);
        f404503h = q0Var5;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$PlayModel");
        s74.q0[] q0VarArr = {q0Var, q0Var2, q0Var3, q0Var4, q0Var5};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$PlayModel");
        f404504i = q0VarArr;
        rz5.b.a(q0VarArr);
    }

    public q0(java.lang.String str, int i17) {
    }

    public static s74.q0 valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$PlayModel");
        s74.q0 q0Var = (s74.q0) java.lang.Enum.valueOf(s74.q0.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$PlayModel");
        return q0Var;
    }

    public static s74.q0[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$PlayModel");
        s74.q0[] q0VarArr = (s74.q0[]) f404504i.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$PlayModel");
        return q0VarArr;
    }
}
