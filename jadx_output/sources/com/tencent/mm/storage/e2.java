package com.tencent.mm.storage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e2 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.storage.e2[] f193854d;

    static {
        com.tencent.mm.storage.e2[] e2VarArr = {new com.tencent.mm.storage.e2("RECOMMEND_REASON_MODE_TIME", 0, 0), new com.tencent.mm.storage.e2("RECOMMEND_REASON_MODE_WORDING", 1, 1)};
        f193854d = e2VarArr;
        rz5.b.a(e2VarArr);
    }

    public e2(java.lang.String str, int i17, int i18) {
    }

    public static com.tencent.mm.storage.e2 valueOf(java.lang.String str) {
        return (com.tencent.mm.storage.e2) java.lang.Enum.valueOf(com.tencent.mm.storage.e2.class, str);
    }

    public static com.tencent.mm.storage.e2[] values() {
        return (com.tencent.mm.storage.e2[]) f193854d.clone();
    }
}
