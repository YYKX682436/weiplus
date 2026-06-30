package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class w00 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f136286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f136287e;

    public w00(com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f136286d = mMActivity;
        this.f136287e = baseFinderFeed;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.wh2 req = (r45.wh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "finder_feed_hide_notice " + ret.getInteger(1));
        if (ret.getInteger(1) == 0) {
            com.tencent.mm.ui.MMActivity mMActivity = this.f136286d;
            db5.t7.h(mMActivity, mMActivity.getResources().getString(com.tencent.mm.R.string.m2t));
            this.f136287e.getFeedObject().setLiveNoticeHide();
        }
    }
}
