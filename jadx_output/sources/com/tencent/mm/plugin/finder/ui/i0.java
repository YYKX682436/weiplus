package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class i0 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderAggregationSettingUI f129342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f129343b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMSwitchBtn f129344c;

    public i0(com.tencent.mm.plugin.finder.ui.FinderAggregationSettingUI finderAggregationSettingUI, android.view.View view, com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn) {
        this.f129342a = finderAggregationSettingUI;
        this.f129343b = view;
        this.f129344c = mMSwitchBtn;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        android.view.View view = this.f129343b;
        com.tencent.mm.plugin.finder.ui.FinderAggregationSettingUI finderAggregationSettingUI = this.f129342a;
        if (!z17) {
            com.tencent.mm.plugin.finder.ui.FinderAggregationSettingUI.f128503t.a(finderAggregationSettingUI, new com.tencent.mm.plugin.finder.ui.g0(view, finderAggregationSettingUI, this.f129344c));
        } else {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.r.f460525a.d(1, new java.util.LinkedList(), new java.util.LinkedList(), new com.tencent.mm.plugin.finder.ui.h0(finderAggregationSettingUI, view));
        }
    }
}
