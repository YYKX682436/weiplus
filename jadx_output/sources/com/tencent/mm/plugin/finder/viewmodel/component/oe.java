package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class oe extends com.tencent.mm.plugin.finder.viewmodel.component.ee implements zy2.i7 {

    /* renamed from: n, reason: collision with root package name */
    public final so2.c f135469n;

    /* renamed from: o, reason: collision with root package name */
    public r45.u25 f135470o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135469n = so2.c.f410278e;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public android.view.View R6(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.g1p);
        if (p17 != null) {
            return p17;
        }
        android.view.ViewStub viewStub = (android.view.ViewStub) holder.p(com.tencent.mm.R.id.g1q);
        android.view.View inflate = viewStub != null ? viewStub.inflate() : null;
        if (inflate != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneUIC", "getContentView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(inflate, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneUIC", "getContentView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return inflate;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public so2.c S6() {
        return this.f135469n;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public void W6(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        if (holder.p(com.tencent.mm.R.id.g1p) != null) {
            super.W6(holder);
        }
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.ee
    public void g7(in5.s0 holder) {
        android.view.View R6;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.g7(holder);
        if (d7(holder, true) && (R6 = R6(holder)) != null) {
            android.content.Context context = holder.f293121e;
            com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
            if (mMActivity == null) {
                return;
            }
            java.lang.Object obj = holder.f293125i;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
            if (baseFinderFeed == null) {
                return;
            }
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.kmi);
            kotlin.jvm.internal.o.d(textView);
            com.tencent.mm.ui.fk.a(textView);
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f2b);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            h0Var.f310123d = "";
            pm0.v.y(((xc2.k0) ((jz5.n) this.f134269i).getValue()).c7(baseFinderFeed.getItemId()), mMActivity, new com.tencent.mm.plugin.finder.viewmodel.component.ke(this, textView, h0Var, string));
            r45.u25 u25Var = this.f135470o;
            com.tencent.mars.xlog.Log.i("FinderFeedRingtoneUIC", java.lang.String.valueOf(u25Var != null ? u25Var.getString(1) : null));
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.mnl);
            kotlin.jvm.internal.o.d(textView2);
            com.tencent.mm.ui.fk.a(textView2);
            android.view.View p17 = holder.p(com.tencent.mm.R.id.mnk);
            textView2.setTextSize(0, getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479628b3));
            textView2.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.me(this, baseFinderFeed, holder, p17, textView2));
            if (com.tencent.mm.plugin.finder.assist.y5.f102716a.b(baseFinderFeed)) {
                p17.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.a9e));
                textView2.setText(getContext().getResources().getString(com.tencent.mm.R.string.f2c));
                textView2.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
            } else {
                p17.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
                textView2.setText(getContext().getResources().getString(com.tencent.mm.R.string.f4x));
                textView2.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            }
            android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.m59);
            java.lang.String o17 = com.tencent.mm.plugin.finder.assist.w2.o(baseFinderFeed.getFeedObject().field_finderObject.getRingtone_count(), false);
            textView3.setTextSize(0, getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479788f9));
            textView3.setText(getContext().getResources().getString(com.tencent.mm.R.string.f2a, o17));
            float dimension = getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
            kotlin.jvm.internal.o.e(p17, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
            ((com.tencent.mm.ui.widget.RoundedCornerFrameLayout) p17).b(dimension, dimension, dimension, dimension);
            p17.invalidate();
            ym5.a1.h(R6, new com.tencent.mm.plugin.finder.viewmodel.component.ne(this, baseFinderFeed));
        }
    }
}
