package df2;

/* loaded from: classes10.dex */
public final class g3 extends if2.b implements if2.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    public final void Z6(int i17, int i18, r45.kf5 kf5Var, yz5.q settingInvoke) {
        kotlin.jvm.internal.o.g(settingInvoke, "settingInvoke");
        com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f291099e;
        kotlin.jvm.internal.o.e(ubVar, "null cannot be cast to non-null type com.tencent.mm.live.plugin.ILiveStatus");
        qo0.c cVar = (qo0.c) ubVar;
        boolean z17 = i17 == 0;
        com.tencent.mm.ui.MMActivity N6 = N6();
        if (N6 != null) {
            com.tencent.mm.plugin.finder.live.plugin.l R6 = R6(com.tencent.mm.plugin.finder.live.plugin.x7.class);
            kotlin.jvm.internal.o.d(R6);
            df2.d3 d3Var = new df2.d3(this, z17);
            com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = (com.tencent.mm.plugin.finder.live.plugin.x7) R6(com.tencent.mm.plugin.finder.live.plugin.x7.class);
            ni2.x0 x0Var = new ni2.x0(N6, cVar, R6, d3Var, x7Var != null ? x7Var.F : null, settingInvoke);
            com.tencent.mm.plugin.finder.live.widget.e0.W(x0Var, null, false, 0, 7, null);
            x0Var.N = i18;
            x0Var.M = i18;
            x0Var.P = kf5Var;
            if (pm0.v.z(i18, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62)) {
                x0Var.h0();
            } else if (pm0.v.z(i18, 64)) {
                x0Var.g0();
            } else {
                x0Var.f0();
            }
            x0Var.i0();
            if (((mm2.c1) ((df2.d3) x0Var.f337502J).a().a(mm2.c1.class)).f328892u3) {
                return;
            }
            android.view.View view = x0Var.V;
            if (view == null) {
                kotlin.jvm.internal.o.o("payModeLayout");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "openPanel", "(ILcom/tencent/mm/protocal/protobuf/PurchaseMicSetting;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "openPanel", "(ILcom/tencent/mm/protocal/protobuf/PurchaseMicSetting;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (pm0.v.z(x0Var.N, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62)) {
                return;
            }
            android.view.View view2 = x0Var.X;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("payModSettingLayout");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "openPanel", "(ILcom/tencent/mm/protocal/protobuf/PurchaseMicSetting;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "openPanel", "(ILcom/tencent/mm/protocal/protobuf/PurchaseMicSetting;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
