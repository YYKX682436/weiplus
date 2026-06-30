package com.tencent.mm.plugin.wallet_core.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class p {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet_core.utils.p f180957e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet_core.utils.p f180958f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet_core.utils.p f180959g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.p[] f180960h;

    /* renamed from: d, reason: collision with root package name */
    public final int f180961d;

    static {
        com.tencent.mm.plugin.wallet_core.utils.p pVar = new com.tencent.mm.plugin.wallet_core.utils.p(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0, 0);
        com.tencent.mm.plugin.wallet_core.utils.p pVar2 = new com.tencent.mm.plugin.wallet_core.utils.p("ADD", 1, 1);
        f180957e = pVar2;
        com.tencent.mm.plugin.wallet_core.utils.p pVar3 = new com.tencent.mm.plugin.wallet_core.utils.p("DELETE", 2, 2);
        f180958f = pVar3;
        com.tencent.mm.plugin.wallet_core.utils.p pVar4 = new com.tencent.mm.plugin.wallet_core.utils.p("MODIFY", 3, 3);
        f180959g = pVar4;
        com.tencent.mm.plugin.wallet_core.utils.p[] pVarArr = {pVar, pVar2, pVar3, pVar4, new com.tencent.mm.plugin.wallet_core.utils.p("PARSE_XML_ERROR", 4, 4), new com.tencent.mm.plugin.wallet_core.utils.p("PARSE_CONTENT_ERROR", 5, 5)};
        f180960h = pVarArr;
        rz5.b.a(pVarArr);
    }

    public p(java.lang.String str, int i17, int i18) {
        this.f180961d = i18;
    }

    public static com.tencent.mm.plugin.wallet_core.utils.p valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.wallet_core.utils.p) java.lang.Enum.valueOf(com.tencent.mm.plugin.wallet_core.utils.p.class, str);
    }

    public static com.tencent.mm.plugin.wallet_core.utils.p[] values() {
        return (com.tencent.mm.plugin.wallet_core.utils.p[]) f180960h.clone();
    }
}
