package pk2;

/* loaded from: classes3.dex */
public final class f extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f355720i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f355720i = "";
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f355720i;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        boolean z17;
        zl2.r4 r4Var = zl2.r4.f473950a;
        gk2.e buContext = this.f364427a.f356074b;
        kotlin.jvm.internal.o.g(buContext, "buContext");
        if (((mm2.c1) buContext.a(mm2.c1.class)).a8()) {
            long j17 = ((mm2.c1) buContext.a(mm2.c1.class)).Q1;
            qs5.h[] hVarArr = qs5.h.f366433d;
            z17 = pm0.v.A(j17, 256);
        } else {
            z17 = pm0.v.z((int) gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, 0L), 131072);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "[isAiAssistantMasterEnabled] result = " + z17);
        return z17;
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.tencent.mm.plugin.finder.view.e3 bottomSheet, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        android.view.View view = bottomSheet.f131959f;
        if (view == null) {
            return;
        }
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f485493u91);
        if (o()) {
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorAiAssistantOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorAiAssistantOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            kotlin.jvm.internal.o.d(findViewById);
            w(o9Var, view, findViewById, com.tencent.mm.R.id.vbg, com.tencent.mm.R.id.vhc, 8589934592L, new pk2.a(view, this));
        } else if (findViewById != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorAiAssistantOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorAiAssistantOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        boolean z17 = (((mm2.c1) o9Var.c(mm2.c1.class)).f328866q & 8589934592L) == 0;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f485494u92);
        if (!o() || !z17) {
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorAiAssistantOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/moreaction/AnchorAiAssistantOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (findViewById2 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorAiAssistantOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/moreaction/AnchorAiAssistantOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        kotlin.jvm.internal.o.d(findViewById2);
        w(o9Var, view, findViewById2, com.tencent.mm.R.id.vbh, com.tencent.mm.R.id.vhd, 536870912L, null);
    }

    public final void w(pk2.o9 o9Var, android.view.View view, android.view.View view2, int i17, int i18, long j17, yz5.l lVar) {
        java.lang.String str;
        java.lang.CharSequence text;
        com.tencent.mm.plugin.finder.view.LoadingSwitchBtn g17 = o9Var.g(view, i17, (((mm2.c1) o9Var.c(mm2.c1.class)).f328866q & j17) == 0);
        kotlinx.coroutines.y0 j18 = j();
        if (j18 != null) {
            g17.g(j18, new pk2.b(o9Var, j17), new pk2.e(this, view, i18, view2, g17, o9Var, j17, lVar, null));
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(i18);
        if (textView == null || (text = textView.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) view.findViewById(i17);
        if (mMSwitchBtn == null) {
            return;
        }
        v(str, view2, mMSwitchBtn);
    }
}
