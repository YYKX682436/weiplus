package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class h0 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderAggregationSettingUI f129309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f129310e;

    public h0(com.tencent.mm.plugin.finder.ui.FinderAggregationSettingUI finderAggregationSettingUI, android.view.View view) {
        this.f129309d = finderAggregationSettingUI;
        this.f129310e = view;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.li2 req = (r45.li2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        this.f129309d.setResult(-1);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_SELF_HISTORY_SETTING_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        android.view.View view = this.f129310e;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderAggregationSettingUI$onCreate$2$2", "onModifyResult", "(Lcom/tencent/mm/protocal/protobuf/FinderModPlayHistoryRequest;Lcom/tencent/mm/protocal/protobuf/FinderCmdRet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderAggregationSettingUI$onCreate$2$2", "onModifyResult", "(Lcom/tencent/mm/protocal/protobuf/FinderModPlayHistoryRequest;Lcom/tencent/mm/protocal/protobuf/FinderCmdRet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
