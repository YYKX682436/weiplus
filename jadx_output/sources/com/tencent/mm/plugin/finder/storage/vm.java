package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class vm extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.vm f128204d = new com.tencent.mm.plugin.finder.storage.vm();

    public vm() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(false, "poi详情页是否开启发布到公众号入口", "FINDER_POI_SHOW_SHARE_TO_MP", null);
        lb2.j.d(aVar, e42.d0.clicfg_poi_show_share_to_mp, false, 2, null);
        return aVar;
    }
}
