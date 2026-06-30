package com.tencent.mm.storage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class y {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.storage.y f196340e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.storage.y f196341f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.storage.y f196342g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.storage.y f196343h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.storage.y[] f196344i;

    /* renamed from: d, reason: collision with root package name */
    public final int f196345d;

    static {
        com.tencent.mm.storage.y yVar = new com.tencent.mm.storage.y("BOX_RED_DOT_NONE_TO_EXIST", 0, 0);
        f196340e = yVar;
        com.tencent.mm.storage.y yVar2 = new com.tencent.mm.storage.y("BOX_RED_DOT_EXIST_TO_NONE", 1, 1);
        f196341f = yVar2;
        com.tencent.mm.storage.y yVar3 = new com.tencent.mm.storage.y("BOX_POSITION_UP", 2, 2);
        f196342g = yVar3;
        com.tencent.mm.storage.y yVar4 = new com.tencent.mm.storage.y("BOX_POSITION_DOWN", 3, 3);
        f196343h = yVar4;
        com.tencent.mm.storage.y[] yVarArr = {yVar, yVar2, yVar3, yVar4};
        f196344i = yVarArr;
        java.util.List a17 = rz5.b.a(yVarArr);
        int d17 = kz5.b1.d(kz5.d0.q(a17, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        kz5.e eVar = new kz5.e((kz5.h) a17);
        while (eVar.hasNext()) {
            java.lang.Object next = eVar.next();
            linkedHashMap.put(java.lang.Integer.valueOf(((com.tencent.mm.storage.y) next).f196345d), next);
        }
    }

    public y(java.lang.String str, int i17, int i18) {
        this.f196345d = i18;
    }

    public static com.tencent.mm.storage.y valueOf(java.lang.String str) {
        return (com.tencent.mm.storage.y) java.lang.Enum.valueOf(com.tencent.mm.storage.y.class, str);
    }

    public static com.tencent.mm.storage.y[] values() {
        return (com.tencent.mm.storage.y[]) f196344i.clone();
    }
}
