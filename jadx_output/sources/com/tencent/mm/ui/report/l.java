package com.tencent.mm.ui.report;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.ui.report.k f209684e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f209685f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.ui.report.l f209686g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.ui.report.l f209687h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.ui.report.l f209688i;

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.mm.ui.report.l f209689m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.ui.report.l[] f209690n;

    /* renamed from: d, reason: collision with root package name */
    public final int f209691d;

    static {
        com.tencent.mm.ui.report.l lVar = new com.tencent.mm.ui.report.l("FILE_DOWNLOAD_UNKNOWN", 0, 0);
        f209686g = lVar;
        com.tencent.mm.ui.report.l lVar2 = new com.tencent.mm.ui.report.l("FILE_DOWNLOAD_START", 1, 1);
        f209687h = lVar2;
        com.tencent.mm.ui.report.l lVar3 = new com.tencent.mm.ui.report.l("FILE_DOWNLOAD_PAUSE", 2, 2);
        f209688i = lVar3;
        com.tencent.mm.ui.report.l lVar4 = new com.tencent.mm.ui.report.l("FILE_DOWNLOAD_CONTINUE", 3, 3);
        f209689m = lVar4;
        com.tencent.mm.ui.report.l[] lVarArr = {lVar, lVar2, lVar3, lVar4};
        f209690n = lVarArr;
        java.util.List a17 = rz5.b.a(lVarArr);
        f209684e = new com.tencent.mm.ui.report.k(null);
        int d17 = kz5.b1.d(kz5.d0.q(a17, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        kz5.e eVar = new kz5.e((kz5.h) a17);
        while (eVar.hasNext()) {
            java.lang.Object next = eVar.next();
            linkedHashMap.put(java.lang.Integer.valueOf(((com.tencent.mm.ui.report.l) next).f209691d), next);
        }
        f209685f = linkedHashMap;
    }

    public l(java.lang.String str, int i17, int i18) {
        this.f209691d = i18;
    }

    public static com.tencent.mm.ui.report.l valueOf(java.lang.String str) {
        return (com.tencent.mm.ui.report.l) java.lang.Enum.valueOf(com.tencent.mm.ui.report.l.class, str);
    }

    public static com.tencent.mm.ui.report.l[] values() {
        return (com.tencent.mm.ui.report.l[]) f209690n.clone();
    }
}
