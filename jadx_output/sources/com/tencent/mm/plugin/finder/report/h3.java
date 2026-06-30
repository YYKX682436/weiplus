package com.tencent.mm.plugin.finder.report;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class h3 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.h3 f125062e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.h3 f125063f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.report.h3[] f125064g;

    /* renamed from: d, reason: collision with root package name */
    public final int f125065d;

    static {
        com.tencent.mm.plugin.finder.report.h3 h3Var = new com.tencent.mm.plugin.finder.report.h3("VISIBLE", 0, 0);
        f125062e = h3Var;
        com.tencent.mm.plugin.finder.report.h3 h3Var2 = new com.tencent.mm.plugin.finder.report.h3("INVISIBLE", 1, 1);
        f125063f = h3Var2;
        com.tencent.mm.plugin.finder.report.h3[] h3VarArr = {h3Var, h3Var2};
        f125064g = h3VarArr;
        rz5.b.a(h3VarArr);
    }

    public h3(java.lang.String str, int i17, int i18) {
        this.f125065d = i18;
    }

    public static com.tencent.mm.plugin.finder.report.h3 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.report.h3) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.report.h3.class, str);
    }

    public static com.tencent.mm.plugin.finder.report.h3[] values() {
        return (com.tencent.mm.plugin.finder.report.h3[]) f125064g.clone();
    }
}
