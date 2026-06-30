package com.tencent.mm.ui.report;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.ui.report.i f209673e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f209674f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.ui.report.j f209675g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.ui.report.j[] f209676h;

    /* renamed from: d, reason: collision with root package name */
    public final int f209677d;

    static {
        com.tencent.mm.ui.report.j jVar = new com.tencent.mm.ui.report.j("SOURCE_OTHER", 0, 0);
        f209675g = jVar;
        com.tencent.mm.ui.report.j[] jVarArr = {jVar, new com.tencent.mm.ui.report.j("SOURCE_CHATTING", 1, 1), new com.tencent.mm.ui.report.j("SOURCE_MID_PAGE", 2, 2), new com.tencent.mm.ui.report.j("SOURCE_PREVIEW", 3, 3)};
        f209676h = jVarArr;
        java.util.List a17 = rz5.b.a(jVarArr);
        f209673e = new com.tencent.mm.ui.report.i(null);
        int d17 = kz5.b1.d(kz5.d0.q(a17, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        kz5.e eVar = new kz5.e((kz5.h) a17);
        while (eVar.hasNext()) {
            java.lang.Object next = eVar.next();
            linkedHashMap.put(java.lang.Integer.valueOf(((com.tencent.mm.ui.report.j) next).f209677d), next);
        }
        f209674f = linkedHashMap;
    }

    public j(java.lang.String str, int i17, int i18) {
        this.f209677d = i18;
    }

    public static com.tencent.mm.ui.report.j valueOf(java.lang.String str) {
        return (com.tencent.mm.ui.report.j) java.lang.Enum.valueOf(com.tencent.mm.ui.report.j.class, str);
    }

    public static com.tencent.mm.ui.report.j[] values() {
        return (com.tencent.mm.ui.report.j[]) f209676h.clone();
    }
}
