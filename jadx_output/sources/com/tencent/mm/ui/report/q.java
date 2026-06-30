package com.tencent.mm.ui.report;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.ui.report.q[] f209731d;

    static {
        com.tencent.mm.ui.report.q[] qVarArr = {new com.tencent.mm.ui.report.q("SOURCE_UPLOAD", 0, 1), new com.tencent.mm.ui.report.q("SOURCE_DOWNLOAD", 1, 2)};
        f209731d = qVarArr;
        rz5.b.a(qVarArr);
    }

    public q(java.lang.String str, int i17, int i18) {
    }

    public static com.tencent.mm.ui.report.q valueOf(java.lang.String str) {
        return (com.tencent.mm.ui.report.q) java.lang.Enum.valueOf(com.tencent.mm.ui.report.q.class, str);
    }

    public static com.tencent.mm.ui.report.q[] values() {
        return (com.tencent.mm.ui.report.q[]) f209731d.clone();
    }
}
