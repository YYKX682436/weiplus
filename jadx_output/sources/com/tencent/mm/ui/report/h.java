package com.tencent.mm.ui.report;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.ui.report.h f209643e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.ui.report.h f209644f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.ui.report.h f209645g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.ui.report.h[] f209646h;

    /* renamed from: d, reason: collision with root package name */
    public final int f209647d;

    static {
        com.tencent.mm.ui.report.h hVar = new com.tencent.mm.ui.report.h("FILE_CLICK_OPEN_MODE_UNKNOWN", 0, 0);
        f209643e = hVar;
        com.tencent.mm.ui.report.h hVar2 = new com.tencent.mm.ui.report.h("FILE_CLICK_OPEN_MODE_MANUAL", 1, 1);
        f209644f = hVar2;
        com.tencent.mm.ui.report.h hVar3 = new com.tencent.mm.ui.report.h("FILE_CLICK_OPEN_MODE_AUTO", 2, 2);
        f209645g = hVar3;
        com.tencent.mm.ui.report.h[] hVarArr = {hVar, hVar2, hVar3};
        f209646h = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17, int i18) {
        this.f209647d = i18;
    }

    public static com.tencent.mm.ui.report.h valueOf(java.lang.String str) {
        return (com.tencent.mm.ui.report.h) java.lang.Enum.valueOf(com.tencent.mm.ui.report.h.class, str);
    }

    public static com.tencent.mm.ui.report.h[] values() {
        return (com.tencent.mm.ui.report.h[]) f209646h.clone();
    }
}
