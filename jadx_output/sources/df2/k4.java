package df2;

/* loaded from: classes3.dex */
public final class k4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.l4 f230554d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(df2.l4 l4Var) {
        super(1);
        this.f230554d = l4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        com.tencent.mm.view.MMPAGView mMPAGView;
        android.view.View view;
        jz5.f0 it = (jz5.f0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveSlideToCloseGuideController", "tryToStartGuideTimer showAnimGuide");
        df2.l4 l4Var = this.f230554d;
        android.view.View T6 = l4Var.T6(com.tencent.mm.R.id.tow, com.tencent.mm.R.id.tou);
        com.tencent.mm.view.MMPAGView mMPAGView2 = T6 != null ? (com.tencent.mm.view.MMPAGView) T6.findViewById(com.tencent.mm.R.id.v6q) : null;
        if (mMPAGView2 != null) {
            mMPAGView2.o(true);
        }
        if (mMPAGView2 != null) {
            mMPAGView2.setProgress(0.0d);
        }
        if (mMPAGView2 != null) {
            mMPAGView2.setRepeatCount(-1);
        }
        com.tencent.mm.plugin.finder.live.util.y.o(l4Var, null, null, new df2.f4(mMPAGView2, l4Var, null), 3, null);
        if (T6 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            i17 = 1;
            mMPAGView = mMPAGView2;
            view = T6;
            yj0.a.d(T6, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/FinderLiveSlideToCloseGuideController", "showAnimGuide", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/FinderLiveSlideToCloseGuideController", "showAnimGuide", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            i17 = 1;
            mMPAGView = mMPAGView2;
            view = T6;
        }
        if (view != null) {
            view.setOnTouchListener(new df2.g4(mMPAGView, l4Var, view));
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveSlideToCloseGuideController", "showGuide guideTipView=" + view);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_SLIDE_TO_CLOSE_TIP_LAST_SHOWN_MS_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_SLIDE_TO_CLOSE_TIP_SHOWN_TIMES_INT_SYNC;
        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(c17.r(u3Var, 0) + i17));
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        r0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "reportSwipeToCloseGuideExposed json:" + jSONObject);
        ml2.r0.hj(r0Var, ml2.b4.K2, jSONObject2, 0L, null, null, null, null, null, 252, null);
        com.tencent.mm.sdk.platformtools.b4 b4Var = l4Var.f230633q;
        if (b4Var != null) {
            b4Var.d();
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveSlideToCloseGuideController", "startHideTimer");
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = new com.tencent.mm.sdk.platformtools.b4("HideSlideToCloseTip::Timer", (com.tencent.mm.sdk.platformtools.a4) new df2.h4(l4Var), false);
        l4Var.f230633q = b4Var2;
        b4Var2.c(5000L, 5000L);
        return jz5.f0.f302826a;
    }
}
