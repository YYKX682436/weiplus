package com.tencent.mm.ui.report;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.ui.report.f[] f209636d;

    static {
        com.tencent.mm.ui.report.f[] fVarArr = {new com.tencent.mm.ui.report.f("SOURCE_SEND_SELF", 0, 1), new com.tencent.mm.ui.report.f("SOURCE_SEND_OTHER", 1, 2)};
        f209636d = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17, int i18) {
    }

    public static com.tencent.mm.ui.report.f valueOf(java.lang.String str) {
        return (com.tencent.mm.ui.report.f) java.lang.Enum.valueOf(com.tencent.mm.ui.report.f.class, str);
    }

    public static com.tencent.mm.ui.report.f[] values() {
        return (com.tencent.mm.ui.report.f[]) f209636d.clone();
    }
}
