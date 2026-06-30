package com.tencent.mm.plugin.finder.live.plugin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uq {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.uq f114611e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.uq f114612f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.uq f114613g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.uq[] f114614h;

    /* renamed from: d, reason: collision with root package name */
    public final int f114615d;

    static {
        com.tencent.mm.plugin.finder.live.plugin.uq uqVar = new com.tencent.mm.plugin.finder.live.plugin.uq(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0, 0);
        f114611e = uqVar;
        com.tencent.mm.plugin.finder.live.plugin.uq uqVar2 = new com.tencent.mm.plugin.finder.live.plugin.uq("SUGGEST_BUBBLE", 1, 1);
        f114612f = uqVar2;
        com.tencent.mm.plugin.finder.live.plugin.uq uqVar3 = new com.tencent.mm.plugin.finder.live.plugin.uq("SUGGEST_BUBBLE_SEARCH_PANEL", 2, 2);
        f114613g = uqVar3;
        com.tencent.mm.plugin.finder.live.plugin.uq[] uqVarArr = {uqVar, uqVar2, uqVar3};
        f114614h = uqVarArr;
        rz5.b.a(uqVarArr);
    }

    public uq(java.lang.String str, int i17, int i18) {
        this.f114615d = i18;
    }

    public static com.tencent.mm.plugin.finder.live.plugin.uq valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.live.plugin.uq) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.live.plugin.uq.class, str);
    }

    public static com.tencent.mm.plugin.finder.live.plugin.uq[] values() {
        return (com.tencent.mm.plugin.finder.live.plugin.uq[]) f114614h.clone();
    }
}
