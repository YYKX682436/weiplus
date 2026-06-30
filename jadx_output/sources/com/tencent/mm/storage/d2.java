package com.tencent.mm.storage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d2 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.storage.d2[] f193832d;

    static {
        com.tencent.mm.storage.d2[] d2VarArr = {new com.tencent.mm.storage.d2("CARD_MODE", 0, 0), new com.tencent.mm.storage.d2("ARTICLE_MODE", 1, 1)};
        f193832d = d2VarArr;
        rz5.b.a(d2VarArr);
    }

    public d2(java.lang.String str, int i17, int i18) {
    }

    public static com.tencent.mm.storage.d2 valueOf(java.lang.String str) {
        return (com.tencent.mm.storage.d2) java.lang.Enum.valueOf(com.tencent.mm.storage.d2.class, str);
    }

    public static com.tencent.mm.storage.d2[] values() {
        return (com.tencent.mm.storage.d2[]) f193832d.clone();
    }
}
