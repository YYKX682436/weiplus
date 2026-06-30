package com.tencent.mm.ui.report;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.ui.report.m f209692e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.ui.report.m f209693f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.ui.report.m f209694g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.ui.report.m f209695h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.ui.report.m[] f209696i;

    /* renamed from: d, reason: collision with root package name */
    public final int f209697d;

    static {
        com.tencent.mm.ui.report.m mVar = new com.tencent.mm.ui.report.m("FILE_EXPIRED", 0, 1);
        f209692e = mVar;
        com.tencent.mm.ui.report.m mVar2 = new com.tencent.mm.ui.report.m("FILE_DOWNLOADING", 1, 2);
        f209693f = mVar2;
        com.tencent.mm.ui.report.m mVar3 = new com.tencent.mm.ui.report.m("FILE_CAN_DOWNLOAD_OR_PREVIEW", 2, 3);
        f209694g = mVar3;
        com.tencent.mm.ui.report.m mVar4 = new com.tencent.mm.ui.report.m("FILE_OTHER", 3, 0);
        f209695h = mVar4;
        com.tencent.mm.ui.report.m[] mVarArr = {mVar, mVar2, mVar3, mVar4};
        f209696i = mVarArr;
        rz5.b.a(mVarArr);
    }

    public m(java.lang.String str, int i17, int i18) {
        this.f209697d = i18;
    }

    public static com.tencent.mm.ui.report.m valueOf(java.lang.String str) {
        return (com.tencent.mm.ui.report.m) java.lang.Enum.valueOf(com.tencent.mm.ui.report.m.class, str);
    }

    public static com.tencent.mm.ui.report.m[] values() {
        return (com.tencent.mm.ui.report.m[]) f209696i.clone();
    }
}
