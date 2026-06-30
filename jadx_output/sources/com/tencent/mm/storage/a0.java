package com.tencent.mm.storage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class a0 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.storage.z f193706e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f193707f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.storage.a0 f193708g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.storage.a0 f193709h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.storage.a0 f193710i;

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.mm.storage.a0 f193711m;

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.mm.storage.a0 f193712n;

    /* renamed from: o, reason: collision with root package name */
    public static final com.tencent.mm.storage.a0 f193713o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.storage.a0[] f193714p;

    /* renamed from: d, reason: collision with root package name */
    public final int f193715d;

    static {
        com.tencent.mm.storage.a0 a0Var = new com.tencent.mm.storage.a0("NEW_CHAT_MESSAGE", 0, 0);
        f193708g = a0Var;
        com.tencent.mm.storage.a0 a0Var2 = new com.tencent.mm.storage.a0("NEW_NON_CHAT_MESSAGE", 1, 1);
        f193709h = a0Var2;
        com.tencent.mm.storage.a0 a0Var3 = new com.tencent.mm.storage.a0("NEW_OFFICIAL_ACCOUNT_MESSAGE", 2, 2);
        f193710i = a0Var3;
        com.tencent.mm.storage.a0 a0Var4 = new com.tencent.mm.storage.a0("OFFICIAL_ACCOUNT_TOP_BOX", 3, 3);
        f193711m = a0Var4;
        com.tencent.mm.storage.a0 a0Var5 = new com.tencent.mm.storage.a0("DELETE_BOX", 4, 4);
        f193712n = a0Var5;
        com.tencent.mm.storage.a0 a0Var6 = new com.tencent.mm.storage.a0("OTHER", 5, 5);
        f193713o = a0Var6;
        com.tencent.mm.storage.a0[] a0VarArr = {a0Var, a0Var2, a0Var3, a0Var4, a0Var5, a0Var6};
        f193714p = a0VarArr;
        java.util.List a17 = rz5.b.a(a0VarArr);
        f193706e = new com.tencent.mm.storage.z(null);
        int d17 = kz5.b1.d(kz5.d0.q(a17, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        kz5.e eVar = new kz5.e((kz5.h) a17);
        while (eVar.hasNext()) {
            java.lang.Object next = eVar.next();
            linkedHashMap.put(java.lang.Integer.valueOf(((com.tencent.mm.storage.a0) next).f193715d), next);
        }
        f193707f = linkedHashMap;
    }

    public a0(java.lang.String str, int i17, int i18) {
        this.f193715d = i18;
    }

    public static com.tencent.mm.storage.a0 valueOf(java.lang.String str) {
        return (com.tencent.mm.storage.a0) java.lang.Enum.valueOf(com.tencent.mm.storage.a0.class, str);
    }

    public static com.tencent.mm.storage.a0[] values() {
        return (com.tencent.mm.storage.a0[]) f193714p.clone();
    }
}
