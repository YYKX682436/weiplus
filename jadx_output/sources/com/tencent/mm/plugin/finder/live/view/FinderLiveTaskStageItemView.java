package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B#\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014R*\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveTaskStageItemView;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/plugin/finder/live/view/wb;", "Lcom/tencent/mm/plugin/finder/live/view/vb;", "value", "m", "Lcom/tencent/mm/plugin/finder/live/view/vb;", "getStatus", "()Lcom/tencent/mm/plugin/finder/live/view/vb;", "setStatus", "(Lcom/tencent/mm/plugin/finder/live/view/vb;)V", "status", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveTaskStageItemView extends android.widget.FrameLayout implements com.tencent.mm.plugin.finder.live.view.wb {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f116104d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f116105e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f116106f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f116107g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f116108h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f116109i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.finder.live.view.vb status;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveTaskStageItemView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.status = com.tencent.mm.plugin.finder.live.view.vb.f116754e;
        a(context);
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dth, this);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f116104d = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f485634rv2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f116105e = textView;
        com.tencent.mm.ui.bk.q0(textView.getPaint());
        android.view.View view = this.f116104d;
        if (view == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.ruy);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f116106f = findViewById2;
        android.view.View view2 = this.f116104d;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById3 = view2.findViewById(com.tencent.mm.R.id.ruz);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f116107g = findViewById3;
        android.view.View view3 = this.f116104d;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById4 = view3.findViewById(com.tencent.mm.R.id.f485632rv0);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f116108h = (android.widget.TextView) findViewById4;
        android.view.View view4 = this.f116104d;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById5 = view4.findViewById(com.tencent.mm.R.id.f485633rv1);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f116109i = (android.widget.LinearLayout) findViewById5;
    }

    public com.tencent.mm.plugin.finder.live.view.vb getStatus() {
        return this.status;
    }

    @Override // com.tencent.mm.plugin.finder.live.view.wb
    public void setStatus(com.tencent.mm.plugin.finder.live.view.vb value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.status = value;
        android.widget.LinearLayout linearLayout = this.f116109i;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("taskGroup");
            throw null;
        }
        int childCount = linearLayout.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.widget.LinearLayout linearLayout2 = this.f116109i;
            if (linearLayout2 == null) {
                kotlin.jvm.internal.o.o("taskGroup");
                throw null;
            }
            android.view.KeyEvent.Callback a17 = n3.u1.a(linearLayout2, i17);
            com.tencent.mm.plugin.finder.live.view.wb wbVar = a17 instanceof com.tencent.mm.plugin.finder.live.view.wb ? (com.tencent.mm.plugin.finder.live.view.wb) a17 : null;
            if (wbVar != null) {
                wbVar.setStatus(getStatus());
            }
        }
        int ordinal = getStatus().ordinal();
        if (ordinal == 0) {
            android.widget.TextView textView = this.f116105e;
            if (textView == null) {
                kotlin.jvm.internal.o.o("stageTitle");
                throw null;
            }
            textView.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1));
            android.widget.TextView textView2 = this.f116108h;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("stageStatus");
                throw null;
            }
            textView2.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1));
            android.view.View view = this.f116106f;
            if (view == null) {
                kotlin.jvm.internal.o.o("dot");
                throw null;
            }
            view.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1));
            android.view.View view2 = this.f116107g;
            if (view2 != null) {
                view2.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1));
                return;
            } else {
                kotlin.jvm.internal.o.o("line");
                throw null;
            }
        }
        if (ordinal == 1) {
            android.widget.TextView textView3 = this.f116108h;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("stageStatus");
                throw null;
            }
            textView3.setText(getContext().getString(com.tencent.mm.R.string.mpc));
            android.widget.TextView textView4 = this.f116105e;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("stageTitle");
                throw null;
            }
            textView4.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            android.widget.TextView textView5 = this.f116108h;
            if (textView5 == null) {
                kotlin.jvm.internal.o.o("stageStatus");
                throw null;
            }
            textView5.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478554ao));
            android.view.View view3 = this.f116106f;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("dot");
                throw null;
            }
            view3.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478554ao));
            android.view.View view4 = this.f116107g;
            if (view4 != null) {
                view4.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478554ao));
                return;
            } else {
                kotlin.jvm.internal.o.o("line");
                throw null;
            }
        }
        if (ordinal != 2) {
            if (ordinal != 3) {
                return;
            }
            android.widget.TextView textView6 = this.f116108h;
            if (textView6 == null) {
                kotlin.jvm.internal.o.o("stageStatus");
                throw null;
            }
            textView6.setText(getContext().getString(com.tencent.mm.R.string.mpd));
            android.widget.TextView textView7 = this.f116105e;
            if (textView7 == null) {
                kotlin.jvm.internal.o.o("stageTitle");
                throw null;
            }
            textView7.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            android.widget.TextView textView8 = this.f116108h;
            if (textView8 == null) {
                kotlin.jvm.internal.o.o("stageStatus");
                throw null;
            }
            textView8.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_3));
            android.view.View view5 = this.f116106f;
            if (view5 == null) {
                kotlin.jvm.internal.o.o("dot");
                throw null;
            }
            view5.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478554ao));
            android.view.View view6 = this.f116107g;
            if (view6 != null) {
                view6.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478554ao));
                return;
            } else {
                kotlin.jvm.internal.o.o("line");
                throw null;
            }
        }
        android.widget.TextView textView9 = this.f116105e;
        if (textView9 == null) {
            kotlin.jvm.internal.o.o("stageTitle");
            throw null;
        }
        textView9.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1));
        android.widget.TextView textView10 = this.f116108h;
        if (textView10 == null) {
            kotlin.jvm.internal.o.o("stageStatus");
            throw null;
        }
        textView10.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1));
        android.view.View view7 = this.f116106f;
        if (view7 == null) {
            kotlin.jvm.internal.o.o("dot");
            throw null;
        }
        view7.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1));
        android.view.View view8 = this.f116107g;
        if (view8 == null) {
            kotlin.jvm.internal.o.o("line");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view8, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveTaskStageItemView", "refreshOnStatusChange", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view8.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view8, "com/tencent/mm/plugin/finder/live/view/FinderLiveTaskStageItemView", "refreshOnStatusChange", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.LinearLayout linearLayout3 = this.f116109i;
        if (linearLayout3 == null) {
            kotlin.jvm.internal.o.o("taskGroup");
            throw null;
        }
        int childCount2 = linearLayout3.getChildCount();
        for (int i18 = 0; i18 < childCount2; i18++) {
            android.widget.LinearLayout linearLayout4 = this.f116109i;
            if (linearLayout4 == null) {
                kotlin.jvm.internal.o.o("taskGroup");
                throw null;
            }
            android.view.KeyEvent.Callback a18 = n3.u1.a(linearLayout4, i18);
            com.tencent.mm.plugin.finder.live.view.wb wbVar2 = a18 instanceof com.tencent.mm.plugin.finder.live.view.wb ? (com.tencent.mm.plugin.finder.live.view.wb) a18 : null;
            if (wbVar2 != null) {
                wbVar2.setStatus(com.tencent.mm.plugin.finder.live.view.vb.f116753d);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveTaskStageItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.status = com.tencent.mm.plugin.finder.live.view.vb.f116754e;
        a(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveTaskStageItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.status = com.tencent.mm.plugin.finder.live.view.vb.f116754e;
        a(context);
    }
}
