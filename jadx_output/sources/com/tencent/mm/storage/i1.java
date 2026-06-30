package com.tencent.mm.storage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.storage.i1[] f195020d;

    static {
        com.tencent.mm.storage.i1[] i1VarArr = {new com.tencent.mm.storage.i1("RECYCLE_CARD_FLAG_NORMAL", 0, 1), new com.tencent.mm.storage.i1("RECYCLE_CARD_FLAG_DEL", 1, 2)};
        f195020d = i1VarArr;
        rz5.b.a(i1VarArr);
    }

    public i1(java.lang.String str, int i17, int i18) {
    }

    public static com.tencent.mm.storage.i1 valueOf(java.lang.String str) {
        return (com.tencent.mm.storage.i1) java.lang.Enum.valueOf(com.tencent.mm.storage.i1.class, str);
    }

    public static com.tencent.mm.storage.i1[] values() {
        return (com.tencent.mm.storage.i1[]) f195020d.clone();
    }
}
