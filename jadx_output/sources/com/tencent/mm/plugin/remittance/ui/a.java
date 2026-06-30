package com.tencent.mm.plugin.remittance.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.remittance.ui.a f157618d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.remittance.ui.a f157619e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.remittance.ui.a f157620f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.remittance.ui.a f157621g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.remittance.ui.a[] f157622h;

    static {
        com.tencent.mm.plugin.remittance.ui.a aVar = new com.tencent.mm.plugin.remittance.ui.a("BOTH_EMPTY", 0);
        f157618d = aVar;
        com.tencent.mm.plugin.remittance.ui.a aVar2 = new com.tencent.mm.plugin.remittance.ui.a("BOTH_EQUAL_AND_VALID", 1);
        f157619e = aVar2;
        com.tencent.mm.plugin.remittance.ui.a aVar3 = new com.tencent.mm.plugin.remittance.ui.a("INCONSISTENT", 2);
        f157620f = aVar3;
        com.tencent.mm.plugin.remittance.ui.a aVar4 = new com.tencent.mm.plugin.remittance.ui.a("BOTH_EXIST_BUT_NOT_EQUAL", 3);
        f157621g = aVar4;
        com.tencent.mm.plugin.remittance.ui.a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f157622h = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.remittance.ui.a valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.remittance.ui.a) java.lang.Enum.valueOf(com.tencent.mm.plugin.remittance.ui.a.class, str);
    }

    public static com.tencent.mm.plugin.remittance.ui.a[] values() {
        return (com.tencent.mm.plugin.remittance.ui.a[]) f157622h.clone();
    }
}
