package com.tencent.mm.plugin.finder.report;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a3 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.a3 f124942e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.a3 f124943f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.a3 f124944g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.report.a3[] f124945h;

    /* renamed from: d, reason: collision with root package name */
    public final int f124946d;

    static {
        com.tencent.mm.plugin.finder.report.a3 a3Var = new com.tencent.mm.plugin.finder.report.a3("PULL", 0, 1);
        f124942e = a3Var;
        com.tencent.mm.plugin.finder.report.a3 a3Var2 = new com.tencent.mm.plugin.finder.report.a3("STATUSBAR", 1, 2);
        com.tencent.mm.plugin.finder.report.a3 a3Var3 = new com.tencent.mm.plugin.finder.report.a3("DOUBLECLICK", 2, 3);
        f124943f = a3Var3;
        com.tencent.mm.plugin.finder.report.a3 a3Var4 = new com.tencent.mm.plugin.finder.report.a3("REFRESHCLICK", 3, 4);
        f124944g = a3Var4;
        com.tencent.mm.plugin.finder.report.a3[] a3VarArr = {a3Var, a3Var2, a3Var3, a3Var4};
        f124945h = a3VarArr;
        rz5.b.a(a3VarArr);
    }

    public a3(java.lang.String str, int i17, int i18) {
        this.f124946d = i18;
    }

    public static com.tencent.mm.plugin.finder.report.a3 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.report.a3) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.report.a3.class, str);
    }

    public static com.tencent.mm.plugin.finder.report.a3[] values() {
        return (com.tencent.mm.plugin.finder.report.a3[]) f124945h.clone();
    }
}
