package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class l30 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.l30 f127106d = new com.tencent.mm.plugin.finder.storage.l30();

    public l30() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(-1, "只看某个feed", null, null, 12, null);
        aVar.a("USERINFO_FINDER_CARE_FEED_TYPE_INT", kz5.c0.i(-1, 2, 4, 8), kz5.c0.i(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, "FINDER_FEED_PHOTO", "FINDER_FEED_VIDEO", "FINDER_FEED_MIX_MEDIA"));
        return aVar;
    }
}
