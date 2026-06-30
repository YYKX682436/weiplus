package com.tencent.mm.storage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class v2 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.storage.v2[] f196272d;

    static {
        com.tencent.mm.storage.v2[] v2VarArr = {new com.tencent.mm.storage.v2("SESSION_BOX_TYPE_OTHER", 0, 0), new com.tencent.mm.storage.v2("SESSION_BOX_TYPE_FILE_HELPER", 1, 1), new com.tencent.mm.storage.v2("SESSION_BOX_TYPE_BRAND_SESSION_HOLDER", 2, 2), new com.tencent.mm.storage.v2("SESSION_BOX_TYPE_NOTIFICATION_MESSAGES", 3, 3), new com.tencent.mm.storage.v2("SESSION_BOX_TYPE_IWATCH_HOLDER", 4, 4), new com.tencent.mm.storage.v2("SESSION_BOX_TYPE_WXMAC_HELPER", 5, 5), new com.tencent.mm.storage.v2("SESSION_BOX_TYPE_BRAND_SESSION_HOLDER_WEAPP", 6, 6), new com.tencent.mm.storage.v2("SESSION_BOX_TYPE_FAV_WEAPP_MESSAGES", 7, 7), new com.tencent.mm.storage.v2("SESSION_BOX_TYPE_OPEN_CUSTOMER_SERVICE_MSG", 8, 8), new com.tencent.mm.storage.v2("SESSION_BOX_TYPE_CHATROOM", 9, 9), new com.tencent.mm.storage.v2("SESSION_BOX_TYPE_WXGAME", 10, 10), new com.tencent.mm.storage.v2("SESSION_BOX_TYPE_SERVICE_ACCOUNT_BOX", 11, 11), new com.tencent.mm.storage.v2("SESSION_BOX_TYPE_SINGLE_CHAT", 12, 101), new com.tencent.mm.storage.v2("SESSION_BOX_TYPE_GROUP_CHAT", 13, 102), new com.tencent.mm.storage.v2("SESSION_BOX_TYPE_SERVICE_ACCOUNT", 14, 103)};
        f196272d = v2VarArr;
        rz5.b.a(v2VarArr);
    }

    public v2(java.lang.String str, int i17, int i18) {
    }

    public static com.tencent.mm.storage.v2 valueOf(java.lang.String str) {
        return (com.tencent.mm.storage.v2) java.lang.Enum.valueOf(com.tencent.mm.storage.v2.class, str);
    }

    public static com.tencent.mm.storage.v2[] values() {
        return (com.tencent.mm.storage.v2[]) f196272d.clone();
    }
}
