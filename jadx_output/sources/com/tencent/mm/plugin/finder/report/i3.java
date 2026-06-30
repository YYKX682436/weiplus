package com.tencent.mm.plugin.finder.report;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class i3 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.i3 f125072e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.i3 f125073f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.report.i3[] f125074g;

    /* renamed from: d, reason: collision with root package name */
    public final int f125075d;

    static {
        com.tencent.mm.plugin.finder.report.i3 i3Var = new com.tencent.mm.plugin.finder.report.i3("EXPOSURE", 0, 1);
        f125072e = i3Var;
        com.tencent.mm.plugin.finder.report.i3 i3Var2 = new com.tencent.mm.plugin.finder.report.i3("CLICK", 1, 2);
        f125073f = i3Var2;
        com.tencent.mm.plugin.finder.report.i3[] i3VarArr = {i3Var, i3Var2};
        f125074g = i3VarArr;
        rz5.b.a(i3VarArr);
    }

    public i3(java.lang.String str, int i17, int i18) {
        this.f125075d = i18;
    }

    public static com.tencent.mm.plugin.finder.report.i3 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.report.i3) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.report.i3.class, str);
    }

    public static com.tencent.mm.plugin.finder.report.i3[] values() {
        return (com.tencent.mm.plugin.finder.report.i3[]) f125074g.clone();
    }
}
