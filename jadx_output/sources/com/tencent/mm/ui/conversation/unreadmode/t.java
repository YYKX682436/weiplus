package com.tencent.mm.ui.conversation.unreadmode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.ui.conversation.unreadmode.t f208161d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.ui.conversation.unreadmode.t f208162e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.ui.conversation.unreadmode.t[] f208163f;

    static {
        com.tencent.mm.ui.conversation.unreadmode.t tVar = new com.tencent.mm.ui.conversation.unreadmode.t("MARK_AS_READ", 0);
        f208161d = tVar;
        com.tencent.mm.ui.conversation.unreadmode.t tVar2 = new com.tencent.mm.ui.conversation.unreadmode.t("MARK_AS_UNREAD", 1);
        f208162e = tVar2;
        com.tencent.mm.ui.conversation.unreadmode.t[] tVarArr = {tVar, tVar2};
        f208163f = tVarArr;
        rz5.b.a(tVarArr);
    }

    public t(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.ui.conversation.unreadmode.t valueOf(java.lang.String str) {
        return (com.tencent.mm.ui.conversation.unreadmode.t) java.lang.Enum.valueOf(com.tencent.mm.ui.conversation.unreadmode.t.class, str);
    }

    public static com.tencent.mm.ui.conversation.unreadmode.t[] values() {
        return (com.tencent.mm.ui.conversation.unreadmode.t[]) f208163f.clone();
    }
}
