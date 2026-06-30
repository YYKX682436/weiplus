package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class x00 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f136383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f136384e;

    public x00(com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f136383d = mMActivity;
        this.f136384e = baseFinderFeed;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.wh2 req = (r45.wh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "finder_feed_show_notice " + ret.getInteger(1));
        if (ret.getInteger(1) == 0) {
            com.tencent.mm.ui.MMActivity mMActivity = this.f136383d;
            db5.t7.h(mMActivity, mMActivity.getResources().getString(com.tencent.mm.R.string.m2v));
            this.f136384e.getFeedObject().setLiveNoticeShow();
        }
    }
}
