package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class cz extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.dz f118032d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz(com.tencent.mm.plugin.finder.live.widget.dz dzVar) {
        super(2);
        this.f118032d = dzVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        com.tencent.mm.plugin.finder.live.widget.dz dzVar = this.f118032d;
        if (longValue2 != dzVar.f118175n) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveVisitorGameTeamPaymentBottomPage", "updateWecoinBalance: requestId not match, requestId:" + longValue2 + ", wecoinBalanceRequestId:" + dzVar.f118175n);
        } else {
            if (longValue < 0) {
                dk2.xf xfVar = dzVar.f118179r;
                longValue = xfVar != null ? ((dk2.r4) xfVar).U() : -1L;
            }
            if (longValue >= 0) {
                com.tencent.mm.plugin.finder.live.plugin.l lVar = dzVar.f118180s;
                mm2.c1 c1Var = lVar != null ? (mm2.c1) lVar.P0(mm2.c1.class) : null;
                if (c1Var != null) {
                    c1Var.w8(longValue);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveVisitorGameTeamPaymentBottomPage", "showWeCoinBalance " + longValue);
                android.view.ViewGroup viewGroup = dzVar.f118173i;
                if (viewGroup != null) {
                    viewGroup.setBackgroundResource(com.tencent.mm.R.drawable.a3f);
                }
                android.view.View view = dzVar.f118170f;
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamPaymentBottomPage", "showWeCoinBalance", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamPaymentBottomPage", "showWeCoinBalance", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.TextView textView = dzVar.f118171g;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                android.widget.TextView textView2 = dzVar.f118171g;
                if (textView2 != null) {
                    textView2.setText(java.lang.String.valueOf(longValue));
                }
                android.view.View view2 = dzVar.f118172h;
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamPaymentBottomPage", "showWeCoinBalance", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamPaymentBottomPage", "showWeCoinBalance", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.ProgressBar progressBar = dzVar.f118174m;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
