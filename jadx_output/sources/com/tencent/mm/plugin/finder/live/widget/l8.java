package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class l8 extends com.tencent.mm.plugin.finder.live.widget.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f118916h;

    /* renamed from: i, reason: collision with root package name */
    public fg2.f f118917i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(android.content.Context context, yz5.l onSetAutoReplayGenCallBack) {
        super(context, false, null, false, 14, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(onSetAutoReplayGenCallBack, "onSetAutoReplayGenCallBack");
        this.f118916h = onSetAutoReplayGenCallBack;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.e8g;
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
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAutoReplayGenWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick: ");
        sb6.append(view != null ? java.lang.Integer.valueOf(view.getId()) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveAutoReplayGenWidget", sb6.toString());
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.f fVar = this.f118917i;
        if (fVar == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        int id6 = fVar.f262023b.getId();
        com.tencent.mm.plugin.finder.assist.s3 s3Var = com.tencent.mm.plugin.finder.assist.s3.f102523a;
        if (valueOf != null && valueOf.intValue() == id6) {
            com.tencent.mars.xlog.Log.i("FinderLiveAutoReplayGenWidget", "click left btn");
            s3Var.a(ml2.t1.f327983r3, null);
            y(false);
        } else {
            fg2.f fVar2 = this.f118917i;
            if (fVar2 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            int id7 = fVar2.f262024c.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                com.tencent.mars.xlog.Log.i("FinderLiveAutoReplayGenWidget", "click right btn");
                s3Var.a(ml2.t1.f327986s3, null);
                y(true);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAutoReplayGenWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        int i17 = com.tencent.mm.R.id.sfy;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.sfy);
        if (textView != null) {
            i17 = com.tencent.mm.R.id.sfz;
            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.sfz);
            if (textView2 != null) {
                i17 = com.tencent.mm.R.id.f483306sg0;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.f483306sg0);
                if (linearLayout != null) {
                    i17 = com.tencent.mm.R.id.f483307sg1;
                    android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.f483307sg1);
                    if (textView3 != null) {
                        i17 = com.tencent.mm.R.id.f483309sg3;
                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.f483309sg3);
                        if (weImageView != null) {
                            i17 = com.tencent.mm.R.id.f483310sg4;
                            android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.f483310sg4);
                            if (textView4 != null) {
                                this.f118917i = new fg2.f((androidx.constraintlayout.widget.ConstraintLayout) rootView, textView, textView2, linearLayout, textView3, weImageView, textView4);
                                textView.setOnClickListener(this);
                                fg2.f fVar = this.f118917i;
                                if (fVar != null) {
                                    fVar.f262024c.setOnClickListener(this);
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
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("FINDER_LIVE_MMKV");
        if (M != null) {
            M.putBoolean("HAS_SHOW_AUTO_GEN_REPLAY_ID", true);
        }
        com.tencent.mm.plugin.finder.assist.s3.f102523a.b(ml2.u1.f328067n3);
        super.w();
    }

    public final void y(boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderLiveAutoReplayGenWidget", "onSetAutoReplayGen: " + z17);
        a();
        this.f118916h.invoke(java.lang.Boolean.valueOf(z17));
    }
}
