package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class xt extends com.tencent.mm.plugin.finder.live.widget.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f120381h;

    /* renamed from: i, reason: collision with root package name */
    public fg2.d f120382i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt(android.content.Context context, yz5.l onReplayCancelCallBack) {
        super(context, false, null, false, 14, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(onReplayCancelCallBack, "onReplayCancelCallBack");
        this.f120381h = onReplayCancelCallBack;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.e8e;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayCancelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick: ");
        sb6.append(view != null ? java.lang.Integer.valueOf(view.getId()) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveReplayCancelWidget", sb6.toString());
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.d dVar = this.f120382i;
        if (dVar == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        int id6 = dVar.f261967b.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            com.tencent.mars.xlog.Log.i("FinderLiveReplayCancelWidget", "click left btn");
            y(false);
        } else {
            fg2.d dVar2 = this.f120382i;
            if (dVar2 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            int id7 = dVar2.f261968c.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                com.tencent.mars.xlog.Log.i("FinderLiveReplayCancelWidget", "click right btn");
                y(true);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayCancelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        int i17 = com.tencent.mm.R.id.uyt;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.uyt);
        if (textView != null) {
            i17 = com.tencent.mm.R.id.uyu;
            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.uyu);
            if (textView2 != null) {
                i17 = com.tencent.mm.R.id.uyv;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.uyv);
                if (linearLayout != null) {
                    i17 = com.tencent.mm.R.id.uyw;
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.uyw);
                    if (weImageView != null) {
                        i17 = com.tencent.mm.R.id.f486637uz0;
                        android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.f486637uz0);
                        if (textView3 != null) {
                            this.f120382i = new fg2.d((androidx.constraintlayout.widget.ConstraintLayout) rootView, textView, textView2, linearLayout, weImageView, textView3);
                            textView.setOnClickListener(this);
                            fg2.d dVar = this.f120382i;
                            if (dVar != null) {
                                dVar.f261968c.setOnClickListener(this);
                                return;
                            } else {
                                kotlin.jvm.internal.o.o("uiBinding");
                                throw null;
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    public final void y(boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderLiveReplayCancelWidget", "onReplayCancel: " + z17);
        a();
        this.f120381h.invoke(java.lang.Boolean.valueOf(z17));
    }
}
