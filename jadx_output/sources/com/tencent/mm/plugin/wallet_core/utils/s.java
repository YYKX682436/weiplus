package com.tencent.mm.plugin.wallet_core.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet_core.utils.s f180975e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet_core.utils.s f180976f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet_core.utils.s f180977g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.s[] f180978h;

    /* renamed from: d, reason: collision with root package name */
    public final int f180979d;

    static {
        com.tencent.mm.plugin.wallet_core.utils.s sVar = new com.tencent.mm.plugin.wallet_core.utils.s(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0, 0);
        com.tencent.mm.plugin.wallet_core.utils.s sVar2 = new com.tencent.mm.plugin.wallet_core.utils.s("TRANSFER", 1, 1);
        f180975e = sVar2;
        com.tencent.mm.plugin.wallet_core.utils.s sVar3 = new com.tencent.mm.plugin.wallet_core.utils.s("C2C", 2, 2);
        f180976f = sVar3;
        com.tencent.mm.plugin.wallet_core.utils.s sVar4 = new com.tencent.mm.plugin.wallet_core.utils.s("C2C_THIRD", 3, 3);
        f180977g = sVar4;
        com.tencent.mm.plugin.wallet_core.utils.s[] sVarArr = {sVar, sVar2, sVar3, sVar4};
        f180978h = sVarArr;
        rz5.b.a(sVarArr);
    }

    public s(java.lang.String str, int i17, int i18) {
        this.f180979d = i18;
    }

    public static com.tencent.mm.plugin.wallet_core.utils.s valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.wallet_core.utils.s) java.lang.Enum.valueOf(com.tencent.mm.plugin.wallet_core.utils.s.class, str);
    }

    public static com.tencent.mm.plugin.wallet_core.utils.s[] values() {
        return (com.tencent.mm.plugin.wallet_core.utils.s[]) f180978h.clone();
    }
}
