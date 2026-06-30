package com.tencent.mm.plugin.finder.report;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class g3 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.g3 f125045e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.g3 f125046f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.g3 f125047g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.g3 f125048h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.report.g3[] f125049i;

    /* renamed from: d, reason: collision with root package name */
    public final int f125050d;

    static {
        com.tencent.mm.plugin.finder.report.g3 g3Var = new com.tencent.mm.plugin.finder.report.g3(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0, 0);
        f125045e = g3Var;
        com.tencent.mm.plugin.finder.report.g3 g3Var2 = new com.tencent.mm.plugin.finder.report.g3("VIDEO_COMPLETE", 1, 1);
        f125046f = g3Var2;
        com.tencent.mm.plugin.finder.report.g3 g3Var3 = new com.tencent.mm.plugin.finder.report.g3("CLOSE_DIRECTLY", 2, 2);
        f125047g = g3Var3;
        com.tencent.mm.plugin.finder.report.g3 g3Var4 = new com.tencent.mm.plugin.finder.report.g3("DISLIKE", 3, 3);
        f125048h = g3Var4;
        com.tencent.mm.plugin.finder.report.g3[] g3VarArr = {g3Var, g3Var2, g3Var3, g3Var4};
        f125049i = g3VarArr;
        rz5.b.a(g3VarArr);
    }

    public g3(java.lang.String str, int i17, int i18) {
        this.f125050d = i18;
    }

    public static com.tencent.mm.plugin.finder.report.g3 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.report.g3) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.report.g3.class, str);
    }

    public static com.tencent.mm.plugin.finder.report.g3[] values() {
        return (com.tencent.mm.plugin.finder.report.g3[]) f125049i.clone();
    }
}
