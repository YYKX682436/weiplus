package com.tencent.mm.plugin.wallet_core.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class v {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet_core.utils.v f180989e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet_core.utils.v f180990f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.v[] f180991g;

    /* renamed from: d, reason: collision with root package name */
    public final int f180992d;

    static {
        com.tencent.mm.plugin.wallet_core.utils.v vVar = new com.tencent.mm.plugin.wallet_core.utils.v(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0, 0);
        com.tencent.mm.plugin.wallet_core.utils.v vVar2 = new com.tencent.mm.plugin.wallet_core.utils.v("SENDER", 1, 1);
        f180989e = vVar2;
        com.tencent.mm.plugin.wallet_core.utils.v vVar3 = new com.tencent.mm.plugin.wallet_core.utils.v("RECEIVER", 2, 2);
        f180990f = vVar3;
        com.tencent.mm.plugin.wallet_core.utils.v[] vVarArr = {vVar, vVar2, vVar3};
        f180991g = vVarArr;
        rz5.b.a(vVarArr);
    }

    public v(java.lang.String str, int i17, int i18) {
        this.f180992d = i18;
    }

    public static com.tencent.mm.plugin.wallet_core.utils.v valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.wallet_core.utils.v) java.lang.Enum.valueOf(com.tencent.mm.plugin.wallet_core.utils.v.class, str);
    }

    public static com.tencent.mm.plugin.wallet_core.utils.v[] values() {
        return (com.tencent.mm.plugin.wallet_core.utils.v[]) f180991g.clone();
    }
}
