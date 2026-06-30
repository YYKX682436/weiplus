package com.tencent.mm.plugin.wallet_core.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class y {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet_core.utils.x f180999e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet_core.utils.y f181000f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet_core.utils.y f181001g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.y[] f181002h;

    /* renamed from: d, reason: collision with root package name */
    public final int f181003d;

    static {
        com.tencent.mm.plugin.wallet_core.utils.y yVar = new com.tencent.mm.plugin.wallet_core.utils.y("Continue", 0, 0);
        f181000f = yVar;
        com.tencent.mm.plugin.wallet_core.utils.y yVar2 = new com.tencent.mm.plugin.wallet_core.utils.y("Abort", 1, 1);
        com.tencent.mm.plugin.wallet_core.utils.y yVar3 = new com.tencent.mm.plugin.wallet_core.utils.y("Cancel", 2, 2);
        com.tencent.mm.plugin.wallet_core.utils.y yVar4 = new com.tencent.mm.plugin.wallet_core.utils.y("Exit", 3, 3);
        f181001g = yVar4;
        com.tencent.mm.plugin.wallet_core.utils.y[] yVarArr = {yVar, yVar2, yVar3, yVar4};
        f181002h = yVarArr;
        rz5.b.a(yVarArr);
        f180999e = new com.tencent.mm.plugin.wallet_core.utils.x(null);
    }

    public y(java.lang.String str, int i17, int i18) {
        this.f181003d = i18;
    }

    public static com.tencent.mm.plugin.wallet_core.utils.y valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.wallet_core.utils.y) java.lang.Enum.valueOf(com.tencent.mm.plugin.wallet_core.utils.y.class, str);
    }

    public static com.tencent.mm.plugin.wallet_core.utils.y[] values() {
        return (com.tencent.mm.plugin.wallet_core.utils.y[]) f181002h.clone();
    }
}
