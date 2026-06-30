package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class l20 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.l20 f127104d = new com.tencent.mm.plugin.finder.storage.l20();

    public l20() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(10, "MarkRead已读上报feed数量阈值", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_mark_read_feed_count_threshold, false, 2, null);
        return aVar;
    }
}
