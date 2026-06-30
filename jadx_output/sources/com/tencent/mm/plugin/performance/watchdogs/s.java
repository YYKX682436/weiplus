package com.tencent.mm.plugin.performance.watchdogs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.performance.watchdogs.s f153121e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.performance.watchdogs.s f153122f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.performance.watchdogs.s f153123g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.performance.watchdogs.s[] f153124h;

    /* renamed from: d, reason: collision with root package name */
    public final int f153125d;

    static {
        com.tencent.mm.plugin.performance.watchdogs.s sVar = new com.tencent.mm.plugin.performance.watchdogs.s("DUMP_SUCCESS", 0, 0);
        f153121e = sVar;
        com.tencent.mm.plugin.performance.watchdogs.s sVar2 = new com.tencent.mm.plugin.performance.watchdogs.s("DUMP_FAILED", 1, 2);
        f153122f = sVar2;
        com.tencent.mm.plugin.performance.watchdogs.s sVar3 = new com.tencent.mm.plugin.performance.watchdogs.s("EXCEPTION", 2, 3);
        f153123g = sVar3;
        com.tencent.mm.plugin.performance.watchdogs.s[] sVarArr = {sVar, sVar2, sVar3};
        f153124h = sVarArr;
        rz5.b.a(sVarArr);
    }

    public s(java.lang.String str, int i17, int i18) {
        this.f153125d = i18;
    }

    public static com.tencent.mm.plugin.performance.watchdogs.s valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.performance.watchdogs.s) java.lang.Enum.valueOf(com.tencent.mm.plugin.performance.watchdogs.s.class, str);
    }

    public static com.tencent.mm.plugin.performance.watchdogs.s[] values() {
        return (com.tencent.mm.plugin.performance.watchdogs.s[]) f153124h.clone();
    }
}
