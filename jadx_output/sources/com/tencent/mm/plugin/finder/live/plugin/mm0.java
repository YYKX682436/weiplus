package com.tencent.mm.plugin.finder.live.plugin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class mm0 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.mm0 f113536d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.mm0 f113537e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.mm0 f113538f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mm0[] f113539g;

    static {
        com.tencent.mm.plugin.finder.live.plugin.mm0 mm0Var = new com.tencent.mm.plugin.finder.live.plugin.mm0("UNKNOWN", 0);
        com.tencent.mm.plugin.finder.live.plugin.mm0 mm0Var2 = new com.tencent.mm.plugin.finder.live.plugin.mm0("GIFT_WISH", 1);
        f113536d = mm0Var2;
        com.tencent.mm.plugin.finder.live.plugin.mm0 mm0Var3 = new com.tencent.mm.plugin.finder.live.plugin.mm0("INTERACTION_WISH", 2);
        f113537e = mm0Var3;
        com.tencent.mm.plugin.finder.live.plugin.mm0 mm0Var4 = new com.tencent.mm.plugin.finder.live.plugin.mm0("BOARD_EVENT", 3);
        f113538f = mm0Var4;
        com.tencent.mm.plugin.finder.live.plugin.mm0[] mm0VarArr = {mm0Var, mm0Var2, mm0Var3, mm0Var4, new com.tencent.mm.plugin.finder.live.plugin.mm0(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BOTH_PATTERN, 4)};
        f113539g = mm0VarArr;
        rz5.b.a(mm0VarArr);
    }

    public mm0(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.live.plugin.mm0 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.live.plugin.mm0) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.live.plugin.mm0.class, str);
    }

    public static com.tencent.mm.plugin.finder.live.plugin.mm0[] values() {
        return (com.tencent.mm.plugin.finder.live.plugin.mm0[]) f113539g.clone();
    }
}
