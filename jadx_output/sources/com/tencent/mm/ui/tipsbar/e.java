package com.tencent.mm.ui.tipsbar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.ui.tipsbar.e f209929d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.ui.tipsbar.e f209930e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.ui.tipsbar.e[] f209931f;

    static {
        com.tencent.mm.ui.tipsbar.e eVar = new com.tencent.mm.ui.tipsbar.e(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0);
        f209929d = eVar;
        com.tencent.mm.ui.tipsbar.e eVar2 = new com.tencent.mm.ui.tipsbar.e("ON_RESUME", 1);
        f209930e = eVar2;
        com.tencent.mm.ui.tipsbar.e[] eVarArr = {eVar, eVar2};
        f209931f = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.ui.tipsbar.e valueOf(java.lang.String str) {
        return (com.tencent.mm.ui.tipsbar.e) java.lang.Enum.valueOf(com.tencent.mm.ui.tipsbar.e.class, str);
    }

    public static com.tencent.mm.ui.tipsbar.e[] values() {
        return (com.tencent.mm.ui.tipsbar.e[]) f209931f.clone();
    }
}
