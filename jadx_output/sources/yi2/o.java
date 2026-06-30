package yi2;

/* loaded from: classes10.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yi2.p f462557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f462558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f462559f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f462560g;

    public o(yi2.p pVar, java.lang.Long l17, java.lang.Long l18, boolean z17) {
        this.f462557d = pVar;
        this.f462558e = l17;
        this.f462559f = l18;
        this.f462560g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        r45.qn0 qn0Var;
        java.util.LinkedList list;
        java.lang.Object obj;
        java.lang.Long l17;
        yi2.p pVar = this.f462557d;
        int right = pVar.f462585y.getRight() + pVar.f462565e;
        int left = (pVar.f462584x.getLeft() - com.tencent.mm.ui.zk.a(pVar.f462561a.getContext(), 8)) - com.tencent.mm.ui.zk.a(pVar.f462561a.getContext(), 6);
        if (pVar.f462575o.getMeasuredWidth() <= 0) {
            int i17 = pVar.f462565e;
        } else {
            pVar.f462575o.getMeasuredWidth();
        }
        java.lang.Long l18 = this.f462558e;
        if (l18 == null || (l17 = this.f462559f) == null) {
            f0Var = null;
        } else {
            long longValue = l17.longValue();
            long longValue2 = l18.longValue();
            long j17 = longValue + longValue2;
            com.tencent.mars.xlog.Log.i(pVar.f462563c, "updateBattleBar: rewardTotal:" + j17 + ", self.wecoinHot:" + longValue2);
            android.view.View view = pVar.f462574n;
            com.tencent.mm.view.MMPAGView mMPAGView = pVar.f462575o;
            android.view.View view2 = pVar.f462561a;
            if (j17 == 0) {
                android.view.ViewGroup.LayoutParams layoutParams = mMPAGView.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(((com.tencent.mm.ui.bl.b(view2.getContext()).x / 2) - pVar.f462567g) - com.tencent.mm.ui.zk.a(view2.getContext(), 8));
                android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).setMarginStart((com.tencent.mm.ui.bl.b(view2.getContext()).x / 2) - pVar.f462567g);
            } else {
                float f17 = (((float) longValue2) / ((float) j17)) * com.tencent.mm.ui.bl.b(view2.getContext()).x;
                float f18 = right;
                if (f17 < f18) {
                    f17 = f18;
                }
                float f19 = left;
                if (f17 > f19) {
                    f17 = f19;
                }
                android.view.ViewGroup.LayoutParams layoutParams3 = mMPAGView.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                int i18 = (int) (f17 - pVar.f462567g);
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).setMarginEnd(((com.tencent.mm.ui.bl.b(view2.getContext()).x - (pVar.f462567g * 2)) - i18) - com.tencent.mm.ui.zk.a(view2.getContext(), 8));
                android.view.ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).setMarginStart(i18);
            }
            pVar.f462570j.requestLayout();
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null && this.f462560g) {
            android.view.ViewGroup.LayoutParams layoutParams5 = pVar.f462575o.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.View view3 = pVar.f462561a;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams5).setMarginEnd(((com.tencent.mm.ui.bl.b(view3.getContext()).x / 2) - pVar.f462567g) - com.tencent.mm.ui.zk.a(view3.getContext(), 8));
            android.view.ViewGroup.LayoutParams layoutParams6 = pVar.f462574n.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams6).setMarginStart((com.tencent.mm.ui.bl.b(view3.getContext()).x / 2) - pVar.f462567g);
            pVar.f462570j.requestLayout();
        }
        dk2.u4 u4Var = ((mm2.o4) ((com.tencent.mm.plugin.finder.live.widget.p8) pVar.f462562b).a().a(mm2.o4.class)).Z;
        if (u4Var != null) {
            r45.hm1 hm1Var = u4Var.f234165l;
            if (hm1Var == null || (list = hm1Var.getList(1)) == null) {
                qn0Var = null;
            } else {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((r45.qn0) obj).getInteger(2) == 1) {
                            break;
                        }
                    }
                }
                qn0Var = (r45.qn0) obj;
            }
            long j18 = qn0Var != null ? qn0Var.getLong(0) : 0L;
            android.view.View view4 = pVar.f462586z;
            com.tencent.mm.view.MMPAGView mMPAGView2 = pVar.f462575o;
            if (j18 > 0) {
                android.view.ViewGroup.LayoutParams layoutParams7 = mMPAGView2.getLayoutParams();
                layoutParams7.width = pVar.f462566f;
                mMPAGView2.setLayoutParams(layoutParams7);
                ym5.l2 l2Var = ym5.l2.f463424a;
                ym5.j2[] j2VarArr = ym5.j2.f463392d;
                mMPAGView2.o(ae2.in.f3688a.a(ym5.f6.L));
                mMPAGView2.setRepeatCount(0);
                kotlinx.coroutines.r2 r2Var = pVar.f462568h;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                pVar.f462568h = kotlinx.coroutines.l.d(pVar.f462569i, null, null, new yi2.n(pVar, null), 3, null);
                pVar.g(true);
                if (view4 == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "setSuperFansBarStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "setSuperFansBarStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            android.view.ViewGroup.LayoutParams layoutParams8 = mMPAGView2.getLayoutParams();
            layoutParams8.width = pVar.f462565e;
            mMPAGView2.setLayoutParams(layoutParams8);
            ym5.l2 l2Var2 = ym5.l2.f463424a;
            ym5.j2[] j2VarArr2 = ym5.j2.f463392d;
            mMPAGView2.o(ae2.in.f3688a.a(ym5.f6.K));
            android.content.res.AssetManager assets = pVar.f462561a.getContext().getAssets();
            kotlin.jvm.internal.o.f(assets, "getAssets(...)");
            mMPAGView2.k(assets, pVar.f462564d);
            mMPAGView2.setRepeatCount(0);
            mMPAGView2.g();
            pVar.g(false);
            if (view4 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "setNormalBarStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "setNormalBarStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
