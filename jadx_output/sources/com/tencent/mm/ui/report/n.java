package com.tencent.mm.ui.report;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.ui.report.n f209701e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.ui.report.n f209702f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.ui.report.n f209703g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.ui.report.n[] f209704h;

    /* renamed from: d, reason: collision with root package name */
    public final int f209705d;

    static {
        com.tencent.mm.ui.report.n nVar = new com.tencent.mm.ui.report.n("FILE_OPEN_UNKNOWN", 0, 0);
        f209701e = nVar;
        com.tencent.mm.ui.report.n nVar2 = new com.tencent.mm.ui.report.n("FILE_OPEN_BY_OTHER_APP", 1, 1);
        f209702f = nVar2;
        com.tencent.mm.ui.report.n nVar3 = new com.tencent.mm.ui.report.n("FILE_OPEN_BY_SELF", 2, 2);
        f209703g = nVar3;
        com.tencent.mm.ui.report.n[] nVarArr = {nVar, nVar2, nVar3};
        f209704h = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17, int i18) {
        this.f209705d = i18;
    }

    public static com.tencent.mm.ui.report.n valueOf(java.lang.String str) {
        return (com.tencent.mm.ui.report.n) java.lang.Enum.valueOf(com.tencent.mm.ui.report.n.class, str);
    }

    public static com.tencent.mm.ui.report.n[] values() {
        return (com.tencent.mm.ui.report.n[]) f209704h.clone();
    }
}
