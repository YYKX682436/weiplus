package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class d10 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f134070d;

    public d10(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f134070d = mMActivity;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.wh2 req = (r45.wh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        int integer = ret.getInteger(1);
        com.tencent.mm.ui.MMActivity mMActivity = this.f134070d;
        if (integer == 0) {
            db5.t7.makeText(mMActivity, com.tencent.mm.R.string.cwh, 0).show();
            return;
        }
        db5.t7.makeText(mMActivity, com.tencent.mm.R.string.cwg, 0).show();
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "finder_feed_open_comment_no_ok " + ret.getInteger(1));
    }
}
