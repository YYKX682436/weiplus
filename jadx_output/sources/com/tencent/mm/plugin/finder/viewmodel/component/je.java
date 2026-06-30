package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class je extends com.tencent.mm.plugin.finder.viewmodel.component.ee implements zy2.h7 {

    /* renamed from: n, reason: collision with root package name */
    public final so2.c f134858n;

    /* renamed from: o, reason: collision with root package name */
    public r45.u25 f134859o;

    /* renamed from: p, reason: collision with root package name */
    public int f134860p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashSet f134861q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f134858n = so2.c.f410278e;
        this.f134860p = com.tencent.mm.ui.bh.a(getContext()).f197135a;
        this.f134861q = new java.util.HashSet();
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public android.view.View R6(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.g1n);
        if (p17 != null) {
            return p17;
        }
        android.view.ViewStub viewStub = (android.view.ViewStub) holder.p(com.tencent.mm.R.id.g1o);
        return viewStub != null ? viewStub.inflate() : null;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public so2.c S6() {
        return this.f134858n;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.ee
    public void g7(in5.s0 holder) {
        android.view.View R6;
        int i17;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.g7(holder);
        java.lang.Object obj = holder.f293125i;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        if (baseFinderFeed != null && hc2.b0.a(baseFinderFeed)) {
            android.content.Context context = holder.f293121e;
            com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
            if (mMActivity == null || (R6 = R6(holder)) == null) {
                return;
            }
            gs2.c cVar = gs2.c.f275072a;
            int hashCode = holder.hashCode();
            gs2.a aVar = gs2.a.f275065x;
            if (!cVar.c(hashCode, aVar) || ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.K0().r()).booleanValue()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(R6, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC", "onBindView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                R6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(R6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC", "onBindView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LAST_REMIND_TIME_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.kmh);
            kotlin.jvm.internal.o.d(textView);
            com.tencent.mm.ui.fk.a(textView);
            android.view.View p17 = holder.p(com.tencent.mm.R.id.f486688m53);
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f2b);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(R6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC", "onBindView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            R6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(R6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC", "onBindView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            h0Var.f310123d = "";
            pm0.v.y(((xc2.k0) ((jz5.n) this.f134269i).getValue()).c7(baseFinderFeed.getItemId()), mMActivity, new com.tencent.mm.plugin.finder.viewmodel.component.fe(this, textView, h0Var, R6, p17, baseFinderFeed, string));
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.mnj);
            kotlin.jvm.internal.o.d(textView2);
            com.tencent.mm.ui.fk.a(textView2);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.f486686m51);
            android.view.View p18 = holder.p(com.tencent.mm.R.id.f486685m50);
            p18.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.he(this, baseFinderFeed, holder));
            if (com.tencent.mm.plugin.finder.assist.y5.f102716a.b(baseFinderFeed)) {
                weImageView.setVisibility(0);
                textView2.setText(getContext().getResources().getString(com.tencent.mm.R.string.f2c));
                p18.setBackgroundResource(com.tencent.mm.R.drawable.f481651z7);
                textView2.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
                i17 = 8;
            } else {
                i17 = 8;
                weImageView.setVisibility(8);
                textView2.setText(getContext().getResources().getString(com.tencent.mm.R.string.f48));
                textView2.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
                p18.setBackgroundResource(com.tencent.mm.R.drawable.f481651z7);
            }
            android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.m58);
            java.lang.String o17 = com.tencent.mm.plugin.finder.assist.w2.o(baseFinderFeed.getFeedObject().field_finderObject.getRingtone_count(), false);
            if (baseFinderFeed.getFeedObject().field_finderObject.getRingtone_count() >= 1) {
                textView3.setVisibility(0);
            } else {
                textView3.setVisibility(i17);
            }
            textView3.setTextSize(0, getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479788f9));
            textView3.setText(getContext().getResources().getString(com.tencent.mm.R.string.f2a, o17));
            ym5.a1.h(R6, new com.tencent.mm.plugin.finder.viewmodel.component.ie(this, baseFinderFeed));
            cVar.e(holder, R6, aVar, false);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(getContext());
        int i17 = this.f134860p;
        int i18 = a17.f197135a;
        if (i18 != i17) {
            this.f134860p = i18;
            double d17 = i18 * 0.6d;
            for (android.view.View view : this.f134861q) {
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (e7(view) > d17) {
                    layoutParams.width = (int) d17;
                } else {
                    layoutParams.width = -2;
                }
                view.setLayoutParams(layoutParams);
                view.requestLayout();
            }
        }
    }
}
