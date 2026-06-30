package com.tencent.mm.storage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class x {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.storage.x f196314e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.storage.x f196315f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.storage.x f196316g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.storage.x f196317h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.storage.x[] f196318i;

    /* renamed from: d, reason: collision with root package name */
    public final int f196319d;

    static {
        com.tencent.mm.storage.x xVar = new com.tencent.mm.storage.x("REDDOT_REPORT_ACT_TYPE_EXPOSE_BOX", 0, 1);
        f196314e = xVar;
        com.tencent.mm.storage.x xVar2 = new com.tencent.mm.storage.x("REDDOT_REPORT_ACT_TYPE_ENTER_BOX", 1, 2);
        f196315f = xVar2;
        com.tencent.mm.storage.x xVar3 = new com.tencent.mm.storage.x("REDDOT_REPORT_ACT_TYPE_DELETE_BOX", 2, 6);
        f196316g = xVar3;
        com.tencent.mm.storage.x xVar4 = new com.tencent.mm.storage.x("REDDOT_REPORT_ACT_TYPE_EXPOSE_END_BOX", 3, 7);
        f196317h = xVar4;
        com.tencent.mm.storage.x[] xVarArr = {xVar, xVar2, xVar3, xVar4};
        f196318i = xVarArr;
        rz5.b.a(xVarArr);
    }

    public x(java.lang.String str, int i17, int i18) {
        this.f196319d = i18;
    }

    public static com.tencent.mm.storage.x valueOf(java.lang.String str) {
        return (com.tencent.mm.storage.x) java.lang.Enum.valueOf(com.tencent.mm.storage.x.class, str);
    }

    public static com.tencent.mm.storage.x[] values() {
        return (com.tencent.mm.storage.x[]) f196318i.clone();
    }
}
