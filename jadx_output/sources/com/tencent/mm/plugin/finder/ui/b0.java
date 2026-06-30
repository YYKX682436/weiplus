package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class b0 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f128923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f128924e;

    public b0(com.tencent.mm.ui.MMActivity mMActivity, yz5.l lVar) {
        this.f128923d = mMActivity;
        this.f128924e = lVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.li2 req = (r45.li2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        int integer = req.getInteger(0);
        yz5.l lVar = this.f128924e;
        if (integer != 5) {
            lVar.invoke(java.lang.Boolean.FALSE);
            return;
        }
        com.tencent.mm.ui.MMActivity mMActivity = this.f128923d;
        db5.t7.h(mMActivity, mMActivity.getResources().getString(com.tencent.mm.R.string.mao));
        lVar.invoke(java.lang.Boolean.TRUE);
    }
}
