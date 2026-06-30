package com.tencent.mm.storage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class f0 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.storage.e0 f193896e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f193897f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.storage.f0 f193898g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.storage.f0 f193899h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.storage.f0 f193900i;

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.mm.storage.f0 f193901m;

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.mm.storage.f0 f193902n;

    /* renamed from: o, reason: collision with root package name */
    public static final com.tencent.mm.storage.f0 f193903o;

    /* renamed from: p, reason: collision with root package name */
    public static final com.tencent.mm.storage.f0 f193904p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.storage.f0[] f193905q;

    /* renamed from: d, reason: collision with root package name */
    public final int f193906d;

    static {
        com.tencent.mm.storage.f0 f0Var = new com.tencent.mm.storage.f0("UNORDERED_DELIVERY", 0, 0);
        f193898g = f0Var;
        com.tencent.mm.storage.f0 f0Var2 = new com.tencent.mm.storage.f0("NEW_MESSAGE_RELEASE", 1, 1);
        f193899h = f0Var2;
        com.tencent.mm.storage.f0 f0Var3 = new com.tencent.mm.storage.f0("USER_ENTER_BOX_CLEAR", 2, 2);
        f193900i = f0Var3;
        com.tencent.mm.storage.f0 f0Var4 = new com.tencent.mm.storage.f0("NOTIFICATION", 3, 3);
        f193901m = f0Var4;
        com.tencent.mm.storage.f0 f0Var5 = new com.tencent.mm.storage.f0("NOTIFICATION_NEW_MESSAGE", 4, 4);
        f193902n = f0Var5;
        com.tencent.mm.storage.f0 f0Var6 = new com.tencent.mm.storage.f0("NOTIFICATION_MESSAGE_RELEASE", 5, 5);
        f193903o = f0Var6;
        com.tencent.mm.storage.f0 f0Var7 = new com.tencent.mm.storage.f0("OTHER", 6, 6);
        f193904p = f0Var7;
        com.tencent.mm.storage.f0[] f0VarArr = {f0Var, f0Var2, f0Var3, f0Var4, f0Var5, f0Var6, f0Var7};
        f193905q = f0VarArr;
        java.util.List a17 = rz5.b.a(f0VarArr);
        f193896e = new com.tencent.mm.storage.e0(null);
        int d17 = kz5.b1.d(kz5.d0.q(a17, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        kz5.e eVar = new kz5.e((kz5.h) a17);
        while (eVar.hasNext()) {
            java.lang.Object next = eVar.next();
            linkedHashMap.put(java.lang.Integer.valueOf(((com.tencent.mm.storage.f0) next).f193906d), next);
        }
        f193897f = linkedHashMap;
    }

    public f0(java.lang.String str, int i17, int i18) {
        this.f193906d = i18;
    }

    public static com.tencent.mm.storage.f0 valueOf(java.lang.String str) {
        return (com.tencent.mm.storage.f0) java.lang.Enum.valueOf(com.tencent.mm.storage.f0.class, str);
    }

    public static com.tencent.mm.storage.f0[] values() {
        return (com.tencent.mm.storage.f0[]) f193905q.clone();
    }
}
