package com.tencent.mm.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class nd {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.ui.nd f209412d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.ui.nd f209413e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.ui.nd f209414f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.ui.nd[] f209415g;

    static {
        com.tencent.mm.ui.nd ndVar = new com.tencent.mm.ui.nd("QUEUE", 0);
        f209412d = ndVar;
        com.tencent.mm.ui.nd ndVar2 = new com.tencent.mm.ui.nd("PROCESSING", 1);
        f209413e = ndVar2;
        com.tencent.mm.ui.nd ndVar3 = new com.tencent.mm.ui.nd("FINISHED", 2);
        f209414f = ndVar3;
        com.tencent.mm.ui.nd[] ndVarArr = {ndVar, ndVar2, ndVar3};
        f209415g = ndVarArr;
        rz5.b.a(ndVarArr);
    }

    public nd(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.ui.nd valueOf(java.lang.String str) {
        return (com.tencent.mm.ui.nd) java.lang.Enum.valueOf(com.tencent.mm.ui.nd.class, str);
    }

    public static com.tencent.mm.ui.nd[] values() {
        return (com.tencent.mm.ui.nd[]) f209415g.clone();
    }
}
