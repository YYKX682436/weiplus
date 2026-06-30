package pk2;

/* loaded from: classes3.dex */
public final class sa extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f356247h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356248i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f356249j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356247h = helper.E;
        this.f356248i = "audience.more.morefunction";
        this.f356249j = kz5.c0.k(new pk2.za(helper, i17), new pk2.pa(helper, i17), new pk2.da(helper, i17), new pk2.y9(helper, i17), new pk2.xa(helper, i17));
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        D(false, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    public final void D(boolean z17, java.lang.Integer num) {
        pk2.da daVar;
        com.tencent.mm.plugin.finder.view.e3 e3Var;
        com.tencent.mm.plugin.finder.view.e3 e3Var2;
        android.view.View view;
        com.tencent.mm.plugin.finder.view.e3 e3Var3;
        com.tencent.mm.plugin.finder.view.e3 e3Var4;
        com.tencent.mm.plugin.finder.view.e3 e3Var5;
        pk2.f8 f8Var = pk2.f8.f355747a;
        f8Var.c(4, 2, null);
        pk2.o9 o9Var = this.f364427a;
        pk2.d9 d9Var = o9Var.f356082f;
        if (d9Var != null) {
            d9Var.f355663f = new com.tencent.mm.plugin.finder.view.e3(o9Var.f356078d);
        }
        pk2.d9 d9Var2 = o9Var.f356082f;
        if (d9Var2 != null && (e3Var5 = d9Var2.f355663f) != null) {
            e3Var5.f(com.tencent.mm.R.layout.b17);
            android.view.View view2 = e3Var5.f131959f;
            android.view.View findViewById = view2.findViewById(com.tencent.mm.R.id.jrn);
            findViewById.setContentDescription(findViewById.getContext().getString(com.tencent.mm.R.string.dkw));
            findViewById.setOnClickListener(new pk2.qa(e3Var5, o9Var));
            android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.odf);
            if (textView != null) {
                com.tencent.mm.ui.fk.a(textView);
            }
            e3Var5.c(true);
            e3Var5.b();
        }
        java.util.List<qk2.f> list = this.f356249j;
        if (d9Var2 != null && (e3Var4 = d9Var2.f355663f) != null) {
            for (qk2.f fVar : list) {
                qk2.d dVar = fVar instanceof qk2.d ? (qk2.d) fVar : null;
                if (dVar != null) {
                    dVar.r(e3Var4, num);
                }
            }
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                daVar = it.next();
                if (((qk2.f) daVar) instanceof pk2.da) {
                    break;
                }
            } else {
                daVar = 0;
                break;
            }
        }
        pk2.da daVar2 = daVar instanceof pk2.da ? daVar : null;
        if (daVar2 != null) {
            daVar2.f355682j = z17;
        }
        if (d9Var2 != null && (e3Var3 = d9Var2.f355663f) != null) {
            e3Var3.f131968r = new pk2.ra(this);
        }
        if (d9Var2 != null && (e3Var2 = d9Var2.f355663f) != null && (view = e3Var2.f131959f) != null) {
            android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f484024cq5);
            android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.cq6);
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) view.findViewById(com.tencent.mm.R.id.ntg);
            if (((mm2.j2) o9Var.c(mm2.j2.class)).R6()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/DanmakuCustomerSwitchKt", "addDanmakuCustomerSwitchOption", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/moreaction/DanmakuCustomerSwitchKt", "addDanmakuCustomerSwitchOption", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/DanmakuCustomerSwitchKt", "addDanmakuCustomerSwitchOption", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/moreaction/DanmakuCustomerSwitchKt", "addDanmakuCustomerSwitchOption", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mMSwitchBtn.setCheck(((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((mm2.j2) o9Var.c(mm2.j2.class)).f329169q).getValue()).booleanValue());
                pk2.f8.d(f8Var, 4, 0, 4, 1, null, 16, null);
                mMSwitchBtn.setSwitchListener(new pk2.r6(o9Var));
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/DanmakuCustomerSwitchKt", "addDanmakuCustomerSwitchOption", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/moreaction/DanmakuCustomerSwitchKt", "addDanmakuCustomerSwitchOption", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/DanmakuCustomerSwitchKt", "addDanmakuCustomerSwitchOption", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/moreaction/DanmakuCustomerSwitchKt", "addDanmakuCustomerSwitchOption", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (d9Var2 == null || (e3Var = d9Var2.f355663f) == null) {
            return;
        }
        e3Var.i();
    }

    @Override // qk2.f
    public java.util.List g() {
        return this.f356249j;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356248i;
    }

    @Override // qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        zl2.r4 r4Var = zl2.r4.f473950a;
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_VISITOR_HAS_SHOW_MORE_SETTING_BOOLEAN_SYNC;
        boolean o17 = c17.o(u3Var, false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canShowVisitorMoreSettingRedDot:");
        sb6.append(!o17);
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", sb6.toString());
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "hasClickVisitorMoreSettingRedDot");
        gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
        int i17 = this.f356247h;
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dxw);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        t(menu, i17, string, com.tencent.mm.R.raw.icons_outlined_more2, o9Var.f356078d.getResources().getColor(com.tencent.mm.R.color.FG_0));
        pk2.f8.f355747a.c(4, 1, null);
    }

    @Override // qk2.h
    public int y() {
        return this.f356247h;
    }
}
