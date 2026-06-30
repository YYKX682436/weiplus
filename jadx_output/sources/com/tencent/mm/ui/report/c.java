package com.tencent.mm.ui.report;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.ui.report.c f209621e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.ui.report.c f209622f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.ui.report.c f209623g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.ui.report.c[] f209624h;

    /* renamed from: d, reason: collision with root package name */
    public final int f209625d;

    static {
        com.tencent.mm.ui.report.c cVar = new com.tencent.mm.ui.report.c("BUBBLE_UNKNOWN", 0, 0);
        f209621e = cVar;
        com.tencent.mm.ui.report.c cVar2 = new com.tencent.mm.ui.report.c("BUBBLE_STOP_DOWNLOAD", 1, 1);
        f209622f = cVar2;
        com.tencent.mm.ui.report.c cVar3 = new com.tencent.mm.ui.report.c("BUBBLE_CONTINUE_DOWNLOAD", 2, 2);
        f209623g = cVar3;
        com.tencent.mm.ui.report.c[] cVarArr = {cVar, cVar2, cVar3};
        f209624h = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17, int i18) {
        this.f209625d = i18;
    }

    public static com.tencent.mm.ui.report.c valueOf(java.lang.String str) {
        return (com.tencent.mm.ui.report.c) java.lang.Enum.valueOf(com.tencent.mm.ui.report.c.class, str);
    }

    public static com.tencent.mm.ui.report.c[] values() {
        return (com.tencent.mm.ui.report.c[]) f209624h.clone();
    }
}
