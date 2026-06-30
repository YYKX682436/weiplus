package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class z00 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f136624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f136625e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f136626f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.t10 f136627g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f136628h;

    public z00(boolean z17, com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.viewmodel.component.t10 t10Var, in5.s0 s0Var) {
        this.f136624d = z17;
        this.f136625e = mMActivity;
        this.f136626f = baseFinderFeed;
        this.f136627g = t10Var;
        this.f136628h = s0Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.wh2 req = (r45.wh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        int integer = ret.getInteger(1);
        boolean z17 = this.f136624d;
        if (integer == 0) {
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "modifyFeedLiveBullet: isClose = " + z17 + ", success");
            pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.y00(this.f136625e, this.f136624d, this.f136626f, this.f136627g, this.f136628h));
            return;
        }
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "modifyFeedLiveBullet: isClose = " + z17 + ", resultCode = " + ret.getInteger(1));
        db5.t7.makeText(this.f136625e, z17 ? com.tencent.mm.R.string.f491361cv2 : com.tencent.mm.R.string.cwd, 0).show();
    }
}
