package com.tencent.mm.plugin.setting.ui.setting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.setting.ui.setting.l f161258e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.setting.ui.setting.l f161259f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.setting.ui.setting.l f161260g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.l[] f161261h;

    /* renamed from: d, reason: collision with root package name */
    public final int f161262d;

    static {
        com.tencent.mm.plugin.setting.ui.setting.l lVar = new com.tencent.mm.plugin.setting.ui.setting.l("SelfQRCodeUI", 0, 1);
        com.tencent.mm.plugin.setting.ui.setting.l lVar2 = new com.tencent.mm.plugin.setting.ui.setting.l("AddFriendsUI", 1, 2);
        f161258e = lVar2;
        com.tencent.mm.plugin.setting.ui.setting.l lVar3 = new com.tencent.mm.plugin.setting.ui.setting.l("ChatRoom", 2, 3);
        f161259f = lVar3;
        com.tencent.mm.plugin.setting.ui.setting.l lVar4 = new com.tencent.mm.plugin.setting.ui.setting.l("SelfQrCodeUINew", 3, 4);
        f161260g = lVar4;
        com.tencent.mm.plugin.setting.ui.setting.l[] lVarArr = {lVar, lVar2, lVar3, lVar4};
        f161261h = lVarArr;
        rz5.b.a(lVarArr);
    }

    public l(java.lang.String str, int i17, int i18) {
        this.f161262d = i18;
    }

    public static com.tencent.mm.plugin.setting.ui.setting.l valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.setting.ui.setting.l) java.lang.Enum.valueOf(com.tencent.mm.plugin.setting.ui.setting.l.class, str);
    }

    public static com.tencent.mm.plugin.setting.ui.setting.l[] values() {
        return (com.tencent.mm.plugin.setting.ui.setting.l[]) f161261h.clone();
    }
}
