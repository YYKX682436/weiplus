package com.tencent.mm.plugin.finder.report;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class f3 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.f3 f125016e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.f3 f125017f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.report.f3[] f125018g;

    /* renamed from: d, reason: collision with root package name */
    public final int f125019d;

    static {
        com.tencent.mm.plugin.finder.report.f3 f3Var = new com.tencent.mm.plugin.finder.report.f3("ACTION_BUTTON", 0, com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX);
        f125016e = f3Var;
        com.tencent.mm.plugin.finder.report.f3 f3Var2 = new com.tencent.mm.plugin.finder.report.f3("BOTTOM_BAR", 1, 160);
        f125017f = f3Var2;
        com.tencent.mm.plugin.finder.report.f3[] f3VarArr = {f3Var, f3Var2};
        f125018g = f3VarArr;
        rz5.b.a(f3VarArr);
    }

    public f3(java.lang.String str, int i17, int i18) {
        this.f125019d = i18;
    }

    public static com.tencent.mm.plugin.finder.report.f3 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.report.f3) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.report.f3.class, str);
    }

    public static com.tencent.mm.plugin.finder.report.f3[] values() {
        return (com.tencent.mm.plugin.finder.report.f3[]) f125018g.clone();
    }
}
