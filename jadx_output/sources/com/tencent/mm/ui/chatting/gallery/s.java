package com.tencent.mm.ui.chatting.gallery;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.gallery.s f201346d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.gallery.s f201347e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.gallery.s f201348f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.ui.chatting.gallery.s[] f201349g;

    static {
        com.tencent.mm.ui.chatting.gallery.s sVar = new com.tencent.mm.ui.chatting.gallery.s(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT, 0);
        f201346d = sVar;
        com.tencent.mm.ui.chatting.gallery.s sVar2 = new com.tencent.mm.ui.chatting.gallery.s("LOADING", 1);
        f201347e = sVar2;
        com.tencent.mm.ui.chatting.gallery.s sVar3 = new com.tencent.mm.ui.chatting.gallery.s("PROGRESS", 2);
        f201348f = sVar3;
        com.tencent.mm.ui.chatting.gallery.s[] sVarArr = {sVar, sVar2, sVar3};
        f201349g = sVarArr;
        rz5.b.a(sVarArr);
    }

    public s(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.ui.chatting.gallery.s valueOf(java.lang.String str) {
        return (com.tencent.mm.ui.chatting.gallery.s) java.lang.Enum.valueOf(com.tencent.mm.ui.chatting.gallery.s.class, str);
    }

    public static com.tencent.mm.ui.chatting.gallery.s[] values() {
        return (com.tencent.mm.ui.chatting.gallery.s[]) f201349g.clone();
    }
}
