package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class dv extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.dv f126672d = new com.tencent.mm.plugin.finder.storage.dv();

    public dv() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_STAR_RECOMMEND_TIPS_SHOW_COUNT_INT_SYNC, 0);
        com.tencent.wechat.aff.finder.FinderPrefetchManager.getInstance().resetEduTipsRecordWithKey(bw5.ms0.emFinderNewbieGuideType_MoreSimilarContentAfterThumbLike);
        return jz5.f0.f302826a;
    }
}
