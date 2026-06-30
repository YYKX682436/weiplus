package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f129280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderAggregationSettingUI f129281e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMSwitchBtn f129282f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(android.view.View view, com.tencent.mm.plugin.finder.ui.FinderAggregationSettingUI finderAggregationSettingUI, com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn) {
        super(1);
        this.f129280d = view;
        this.f129281e = finderAggregationSettingUI;
        this.f129282f = mMSwitchBtn;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_SELF_HISTORY_SETTING_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            android.view.View view = this.f129280d;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderAggregationSettingUI$onCreate$2$1", "invoke", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderAggregationSettingUI$onCreate$2$1", "invoke", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f129281e.setResult(-1);
        } else {
            this.f129282f.setCheck(true);
        }
        return jz5.f0.f302826a;
    }
}
