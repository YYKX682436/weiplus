package com.tencent.mm.plugin.sns.ui.improve.component;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class p0 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ui.improve.component.p0 f168968d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ui.improve.component.p0 f168969e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.p0[] f168970f;

    static {
        com.tencent.mm.plugin.sns.ui.improve.component.p0 p0Var = new com.tencent.mm.plugin.sns.ui.improve.component.p0("MAIN_NORMAL_MODE", 0, 1);
        f168968d = p0Var;
        com.tencent.mm.plugin.sns.ui.improve.component.p0 p0Var2 = new com.tencent.mm.plugin.sns.ui.improve.component.p0("MAIN_UNREAD_MODE", 1, 2);
        f168969e = p0Var2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$Companion$SnsTimelineMode");
        com.tencent.mm.plugin.sns.ui.improve.component.p0[] p0VarArr = {p0Var, p0Var2};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$Companion$SnsTimelineMode");
        f168970f = p0VarArr;
        rz5.b.a(p0VarArr);
    }

    public p0(java.lang.String str, int i17, int i18) {
    }

    public static com.tencent.mm.plugin.sns.ui.improve.component.p0 valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$Companion$SnsTimelineMode");
        com.tencent.mm.plugin.sns.ui.improve.component.p0 p0Var = (com.tencent.mm.plugin.sns.ui.improve.component.p0) java.lang.Enum.valueOf(com.tencent.mm.plugin.sns.ui.improve.component.p0.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$Companion$SnsTimelineMode");
        return p0Var;
    }

    public static com.tencent.mm.plugin.sns.ui.improve.component.p0[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$Companion$SnsTimelineMode");
        com.tencent.mm.plugin.sns.ui.improve.component.p0[] p0VarArr = (com.tencent.mm.plugin.sns.ui.improve.component.p0[]) f168970f.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$Companion$SnsTimelineMode");
        return p0VarArr;
    }
}
