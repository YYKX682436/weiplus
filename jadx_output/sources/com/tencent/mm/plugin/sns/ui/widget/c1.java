package com.tencent.mm.plugin.sns.ui.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ui.widget.c1 f171092d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ui.widget.c1 f171093e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ui.widget.c1 f171094f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.c1[] f171095g;

    static {
        com.tencent.mm.plugin.sns.ui.widget.c1 c1Var = new com.tencent.mm.plugin.sns.ui.widget.c1("Group", 0);
        f171092d = c1Var;
        com.tencent.mm.plugin.sns.ui.widget.c1 c1Var2 = new com.tencent.mm.plugin.sns.ui.widget.c1("Private", 1);
        f171093e = c1Var2;
        com.tencent.mm.plugin.sns.ui.widget.c1 c1Var3 = new com.tencent.mm.plugin.sns.ui.widget.c1("Error", 2);
        f171094f = c1Var3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView$State");
        com.tencent.mm.plugin.sns.ui.widget.c1[] c1VarArr = {c1Var, c1Var2, c1Var3};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView$State");
        f171095g = c1VarArr;
        rz5.b.a(c1VarArr);
    }

    public c1(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.sns.ui.widget.c1 valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView$State");
        com.tencent.mm.plugin.sns.ui.widget.c1 c1Var = (com.tencent.mm.plugin.sns.ui.widget.c1) java.lang.Enum.valueOf(com.tencent.mm.plugin.sns.ui.widget.c1.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView$State");
        return c1Var;
    }

    public static com.tencent.mm.plugin.sns.ui.widget.c1[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView$State");
        com.tencent.mm.plugin.sns.ui.widget.c1[] c1VarArr = (com.tencent.mm.plugin.sns.ui.widget.c1[]) f171095g.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView$State");
        return c1VarArr;
    }
}
