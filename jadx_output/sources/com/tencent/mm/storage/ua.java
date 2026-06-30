package com.tencent.mm.storage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ua {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.storage.ua f196266d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.storage.ua[] f196267e;

    static {
        com.tencent.mm.storage.ua uaVar = new com.tencent.mm.storage.ua("FIRST_SCREEN_OFF", 0);
        f196266d = uaVar;
        com.tencent.mm.storage.ua[] uaVarArr = {uaVar, new com.tencent.mm.storage.ua("ALARM", 1)};
        f196267e = uaVarArr;
        rz5.b.a(uaVarArr);
    }

    public ua(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.storage.ua valueOf(java.lang.String str) {
        return (com.tencent.mm.storage.ua) java.lang.Enum.valueOf(com.tencent.mm.storage.ua.class, str);
    }

    public static com.tencent.mm.storage.ua[] values() {
        return (com.tencent.mm.storage.ua[]) f196267e.clone();
    }
}
