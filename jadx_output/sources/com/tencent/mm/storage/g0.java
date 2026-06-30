package com.tencent.mm.storage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class g0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.storage.g0[] f193942e;

    /* renamed from: d, reason: collision with root package name */
    public final int f193943d;

    static {
        com.tencent.mm.storage.g0[] g0VarArr = {new com.tencent.mm.storage.g0("NOTIFICATION_TIMESTAMP", 0, 1), new com.tencent.mm.storage.g0("LATEST_MESSAGE", 1, 2), new com.tencent.mm.storage.g0("SERVER_ASSIGN", 2, 3), new com.tencent.mm.storage.g0("UNKNOWN", 3, 4)};
        f193942e = g0VarArr;
        java.util.List a17 = rz5.b.a(g0VarArr);
        int d17 = kz5.b1.d(kz5.d0.q(a17, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        kz5.e eVar = new kz5.e((kz5.h) a17);
        while (eVar.hasNext()) {
            java.lang.Object next = eVar.next();
            linkedHashMap.put(java.lang.Integer.valueOf(((com.tencent.mm.storage.g0) next).f193943d), next);
        }
    }

    public g0(java.lang.String str, int i17, int i18) {
        this.f193943d = i18;
    }

    public static com.tencent.mm.storage.g0 valueOf(java.lang.String str) {
        return (com.tencent.mm.storage.g0) java.lang.Enum.valueOf(com.tencent.mm.storage.g0.class, str);
    }

    public static com.tencent.mm.storage.g0[] values() {
        return (com.tencent.mm.storage.g0[]) f193942e.clone();
    }
}
