package com.tencent.mm.storage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class d0 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.storage.c0 f193826e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f193827f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.storage.d0 f193828g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.storage.d0[] f193829h;

    /* renamed from: d, reason: collision with root package name */
    public final int f193830d;

    static {
        com.tencent.mm.storage.d0 d0Var = new com.tencent.mm.storage.d0("REDDOT_EXIST_TO_NONE", 0, 0);
        com.tencent.mm.storage.d0 d0Var2 = new com.tencent.mm.storage.d0("REDDOT_NONE_TO_EXIST", 1, 1);
        f193828g = d0Var2;
        com.tencent.mm.storage.d0[] d0VarArr = {d0Var, d0Var2};
        f193829h = d0VarArr;
        java.util.List a17 = rz5.b.a(d0VarArr);
        f193826e = new com.tencent.mm.storage.c0(null);
        int d17 = kz5.b1.d(kz5.d0.q(a17, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        kz5.e eVar = new kz5.e((kz5.h) a17);
        while (eVar.hasNext()) {
            java.lang.Object next = eVar.next();
            linkedHashMap.put(java.lang.Integer.valueOf(((com.tencent.mm.storage.d0) next).f193830d), next);
        }
        f193827f = linkedHashMap;
    }

    public d0(java.lang.String str, int i17, int i18) {
        this.f193830d = i18;
    }

    public static com.tencent.mm.storage.d0 valueOf(java.lang.String str) {
        return (com.tencent.mm.storage.d0) java.lang.Enum.valueOf(com.tencent.mm.storage.d0.class, str);
    }

    public static com.tencent.mm.storage.d0[] values() {
        return (com.tencent.mm.storage.d0[]) f193829h.clone();
    }
}
