package com.tencent.mm.plugin.finder.live.plugin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ix {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.ix f113031e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.ix f113032f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ix[] f113033g;

    /* renamed from: d, reason: collision with root package name */
    public final int f113034d;

    static {
        com.tencent.mm.plugin.finder.live.plugin.ix ixVar = new com.tencent.mm.plugin.finder.live.plugin.ix("PURCHASE_COUNT", 0, 1);
        com.tencent.mm.plugin.finder.live.plugin.ix ixVar2 = new com.tencent.mm.plugin.finder.live.plugin.ix("REWARD_HEAT", 1, 2);
        com.tencent.mm.plugin.finder.live.plugin.ix ixVar3 = new com.tencent.mm.plugin.finder.live.plugin.ix("PREVIEW_LIVE_COUNT", 2, 3);
        f113031e = ixVar3;
        com.tencent.mm.plugin.finder.live.plugin.ix ixVar4 = new com.tencent.mm.plugin.finder.live.plugin.ix("NO_GIFT", 3, 4);
        f113032f = ixVar4;
        com.tencent.mm.plugin.finder.live.plugin.ix[] ixVarArr = {ixVar, ixVar2, ixVar3, ixVar4};
        f113033g = ixVarArr;
        rz5.b.a(ixVarArr);
    }

    public ix(java.lang.String str, int i17, int i18) {
        this.f113034d = i18;
    }

    public static com.tencent.mm.plugin.finder.live.plugin.ix valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.live.plugin.ix) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.live.plugin.ix.class, str);
    }

    public static com.tencent.mm.plugin.finder.live.plugin.ix[] values() {
        return (com.tencent.mm.plugin.finder.live.plugin.ix[]) f113033g.clone();
    }
}
