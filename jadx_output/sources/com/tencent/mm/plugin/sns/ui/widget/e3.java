package com.tencent.mm.plugin.sns.ui.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e3 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ui.widget.e3 f171123d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.e3[] f171124e;

    static {
        com.tencent.mm.plugin.sns.ui.widget.e3 e3Var = new com.tencent.mm.plugin.sns.ui.widget.e3("SMALL", 0);
        com.tencent.mm.plugin.sns.ui.widget.e3 e3Var2 = new com.tencent.mm.plugin.sns.ui.widget.e3("LARGE", 1);
        f171123d = e3Var2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover$Size");
        com.tencent.mm.plugin.sns.ui.widget.e3[] e3VarArr = {e3Var, e3Var2};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover$Size");
        f171124e = e3VarArr;
        rz5.b.a(e3VarArr);
    }

    public e3(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.sns.ui.widget.e3 valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover$Size");
        com.tencent.mm.plugin.sns.ui.widget.e3 e3Var = (com.tencent.mm.plugin.sns.ui.widget.e3) java.lang.Enum.valueOf(com.tencent.mm.plugin.sns.ui.widget.e3.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover$Size");
        return e3Var;
    }

    public static com.tencent.mm.plugin.sns.ui.widget.e3[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover$Size");
        com.tencent.mm.plugin.sns.ui.widget.e3[] e3VarArr = (com.tencent.mm.plugin.sns.ui.widget.e3[]) f171124e.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover$Size");
        return e3VarArr;
    }
}
