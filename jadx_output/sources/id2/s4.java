package id2;

/* loaded from: classes8.dex */
public final class s4 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f290796d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f290797e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f290797e = "266";
    }

    public static final void O6(id2.s4 s4Var, int i17, yz5.l lVar) {
        s4Var.getClass();
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        id2.k4 k4Var = new id2.k4(i17, lVar);
        hb2.h hVar = hb2.h.f280047e;
        hVar.getClass();
        bw5.br brVar = new bw5.br();
        brVar.f25797d = i17;
        boolean[] zArr = brVar.f25799f;
        zArr[1] = true;
        brVar.f25798e = linkedList;
        zArr[2] = true;
        com.tencent.mars.xlog.Log.i(hb2.h.f280048f, "modifyPlayHistorySet op_type:" + brVar.f25797d);
        hb2.w0.m(hVar, brVar, k4Var, false, false, null, null, 60, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.onViewCreated(contentView);
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3769i0).getValue()).r()).intValue() == 0) {
            com.tencent.mars.xlog.Log.i("FinderLiveRecentWatchSettingUIC", "Recent watch experiment is close");
            android.view.View findViewById = contentView.findViewById(com.tencent.mm.R.id.f486543ux1);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveRecentWatchSettingUIC", "onViewCreated", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveRecentWatchSettingUIC", "onViewCreated", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        boolean z17 = dk2.ef.C;
        com.tencent.mars.xlog.Log.i("FinderLiveRecentWatchSettingUIC", "recentWatchEnable from backend: " + z17);
        cl0.g gVar = new cl0.g();
        gVar.h("switch_status", java.lang.String.valueOf(z17 ? 1 : 0));
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
        java.lang.String str = this.f290797e;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        a4Var.a(str, "", b52.b.b(), "person_page_more_recent_switch", gVar2);
        android.view.View findViewById2 = contentView.findViewById(com.tencent.mm.R.id.f486546ux4);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById2;
        this.f290796d = mMSwitchBtn;
        mMSwitchBtn.setCheck(gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_LIVE_RECENT_WATCH_SETTING_BOOLEAN_SYNC, z17));
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = this.f290796d;
        if (mMSwitchBtn2 != null) {
            mMSwitchBtn2.setSwitchListener(new id2.n4(this));
        } else {
            kotlin.jvm.internal.o.o("switchBtn");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f290797e = "266";
    }
}
