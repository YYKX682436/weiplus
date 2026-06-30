package com.tencent.mm.plugin.sns.ui.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d3 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ui.widget.d3 f171114d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.d3[] f171115e;

    static {
        com.tencent.mm.plugin.sns.ui.widget.d3 d3Var = new com.tencent.mm.plugin.sns.ui.widget.d3("UP", 0);
        com.tencent.mm.plugin.sns.ui.widget.d3 d3Var2 = new com.tencent.mm.plugin.sns.ui.widget.d3("DOWN", 1);
        f171114d = d3Var2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover$Direction");
        com.tencent.mm.plugin.sns.ui.widget.d3[] d3VarArr = {d3Var, d3Var2};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover$Direction");
        f171115e = d3VarArr;
        rz5.b.a(d3VarArr);
    }

    public d3(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.sns.ui.widget.d3 valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover$Direction");
        com.tencent.mm.plugin.sns.ui.widget.d3 d3Var = (com.tencent.mm.plugin.sns.ui.widget.d3) java.lang.Enum.valueOf(com.tencent.mm.plugin.sns.ui.widget.d3.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover$Direction");
        return d3Var;
    }

    public static com.tencent.mm.plugin.sns.ui.widget.d3[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover$Direction");
        com.tencent.mm.plugin.sns.ui.widget.d3[] d3VarArr = (com.tencent.mm.plugin.sns.ui.widget.d3[]) f171115e.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover$Direction");
        return d3VarArr;
    }
}
