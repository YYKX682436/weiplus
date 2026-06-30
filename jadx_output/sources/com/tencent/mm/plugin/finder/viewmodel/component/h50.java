package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class h50 extends com.tencent.mm.ui.component.UIComponent implements zy2.fb {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h50(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final boolean O6(android.view.View anchor, long j17, int i17) {
        kotlin.jvm.internal.o.g(anchor, "anchor");
        android.content.Context context = anchor.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.a4 a4Var = (com.tencent.mm.plugin.finder.viewmodel.component.a4) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.a4.class);
        if (a4Var != null && a4Var.f133729y) {
            return false;
        }
        if (getActivity() instanceof com.tencent.mm.plugin.finder.feed.ui.FinderNewStyleTimelineUI) {
            com.tencent.mars.xlog.Log.i("FinderShareTipsBubbleUIC", "checkShowShareTips: do not show tips");
            return false;
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean z17 = ((java.lang.Number) ((ob2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.J9).getValue()).r()).intValue() == 1;
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_SET_SHARE_BUBBLE_TIPS_INT_SYNC;
        int r17 = c17.r(u3Var, 0);
        com.tencent.mars.xlog.Log.i("FinderShareTipsBubbleUIC", "checkShowShareTips open: " + z17 + ", count: " + r17);
        if (!z17) {
            return false;
        }
        if (r17 < 3) {
            com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_FINDER_SHARE_BUBBLE_TIPS_LAST_TIME_LONG_SYNC;
            long t17 = c18.t(u3Var2, 0L);
            long A = zl2.q4.f473933a.A();
            com.tencent.mars.xlog.Log.i("FinderShareTipsBubbleUIC", "checkShowShareTips lastTime: " + t17 + ", startTime: " + A);
            if (A >= t17) {
                com.tencent.mm.plugin.finder.view.rm rmVar = new com.tencent.mm.plugin.finder.view.rm(getContext(), null, 2, null);
                rmVar.f132974m = -1L;
                android.content.Context context2 = rmVar.f132965d;
                rmVar.f132973l = i65.a.b(context2, 68);
                rmVar.f132968g.setText(context2.getString(com.tencent.mm.R.string.f4j));
                rmVar.a(0, context2.getResources().getDimension(com.tencent.mm.R.dimen.f479850gz));
                rmVar.c(anchor);
                rmVar.b();
                rmVar.setOnDismissListener(new com.tencent.mm.plugin.finder.viewmodel.component.g50(this));
                gm0.j1.u().c().x(u3Var2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 + 1));
                com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                android.app.Activity context3 = getContext();
                java.lang.String u17 = pm0.v.u(j17);
                o3Var.getClass();
                kotlin.jvm.internal.o.g(context3, "context");
                cl0.g gVar = new cl0.g();
                gVar.h("feedid", u17);
                gVar.o("trigger_reason", i17);
                java.lang.String gVar2 = gVar.toString();
                kotlin.jvm.internal.o.f(gVar2, "toString(...)");
                java.lang.String t18 = r26.i0.t(gVar2, ",", ";", false);
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context3 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                com.tencent.mm.plugin.finder.report.o3.ij(o3Var, 0, "forward_edu", t18, nyVar != null ? nyVar.V6() : null, null, 16, null);
                return true;
            }
        }
        return false;
    }

    public final boolean P6() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return (((java.lang.Number) ((ob2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.J9).getValue()).r()).intValue() == 1) && gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_SET_SHARE_BUBBLE_TIPS_INT_SYNC, 0) < 3 && zl2.q4.f473933a.A() >= gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_SHARE_BUBBLE_TIPS_LAST_TIME_LONG_SYNC, 0L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h50(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
