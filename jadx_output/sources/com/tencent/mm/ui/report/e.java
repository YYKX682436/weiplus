package com.tencent.mm.ui.report;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.ui.report.d f209628e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f209629f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.ui.report.e f209630g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.ui.report.e[] f209631h;

    /* renamed from: d, reason: collision with root package name */
    public final int f209632d;

    static {
        com.tencent.mm.ui.report.e eVar = new com.tencent.mm.ui.report.e("STEP_OTHER", 0, 0);
        f209630g = eVar;
        com.tencent.mm.ui.report.e[] eVarArr = {eVar, new com.tencent.mm.ui.report.e("STEP_INIT", 1, 1), new com.tencent.mm.ui.report.e("STEP_FIRST_BUBBLE", 2, 2), new com.tencent.mm.ui.report.e("STEP_SECOND_BUBBLE", 3, 3)};
        f209631h = eVarArr;
        java.util.List a17 = rz5.b.a(eVarArr);
        f209628e = new com.tencent.mm.ui.report.d(null);
        int d17 = kz5.b1.d(kz5.d0.q(a17, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        kz5.e eVar2 = new kz5.e((kz5.h) a17);
        while (eVar2.hasNext()) {
            java.lang.Object next = eVar2.next();
            linkedHashMap.put(java.lang.Integer.valueOf(((com.tencent.mm.ui.report.e) next).f209632d), next);
        }
        f209629f = linkedHashMap;
    }

    public e(java.lang.String str, int i17, int i18) {
        this.f209632d = i18;
    }

    public static com.tencent.mm.ui.report.e valueOf(java.lang.String str) {
        return (com.tencent.mm.ui.report.e) java.lang.Enum.valueOf(com.tencent.mm.ui.report.e.class, str);
    }

    public static com.tencent.mm.ui.report.e[] values() {
        return (com.tencent.mm.ui.report.e[]) f209631h.clone();
    }
}
