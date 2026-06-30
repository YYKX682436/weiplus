package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class k0 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderAggregationSettingUI f129408d;

    public k0(com.tencent.mm.plugin.finder.ui.FinderAggregationSettingUI finderAggregationSettingUI) {
        this.f129408d = finderAggregationSettingUI;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.li2 req = (r45.li2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        if (req.getInteger(0) == 4) {
            com.tencent.mm.plugin.finder.ui.FinderAggregationSettingUI finderAggregationSettingUI = this.f129408d;
            finderAggregationSettingUI.setResult(-1);
            db5.t7.h(finderAggregationSettingUI.getContext(), finderAggregationSettingUI.getContext().getResources().getString(com.tencent.mm.R.string.o1d));
        }
    }
}
