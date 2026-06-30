package com.tencent.mm.ui.report;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.ui.report.g f209639e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.ui.report.g f209640f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.ui.report.g[] f209641g;

    /* renamed from: d, reason: collision with root package name */
    public final int f209642d;

    static {
        com.tencent.mm.ui.report.g gVar = new com.tencent.mm.ui.report.g("UI_TYPE_NEW", 0, 1);
        f209639e = gVar;
        com.tencent.mm.ui.report.g gVar2 = new com.tencent.mm.ui.report.g("UI_TYPE_OLD", 1, 2);
        f209640f = gVar2;
        com.tencent.mm.ui.report.g[] gVarArr = {gVar, gVar2};
        f209641g = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17, int i18) {
        this.f209642d = i18;
    }

    public static com.tencent.mm.ui.report.g valueOf(java.lang.String str) {
        return (com.tencent.mm.ui.report.g) java.lang.Enum.valueOf(com.tencent.mm.ui.report.g.class, str);
    }

    public static com.tencent.mm.ui.report.g[] values() {
        return (com.tencent.mm.ui.report.g[]) f209641g.clone();
    }
}
