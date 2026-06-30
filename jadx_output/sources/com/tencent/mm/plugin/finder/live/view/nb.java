package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class nb extends android.widget.FrameLayout implements com.tencent.mm.plugin.finder.live.view.wb {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f116532d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f116533e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f116534f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f116535g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f116536h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f116537i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f116538m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f116539n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f116540o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ProgressBar f116541p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f116542q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f116543r;

    /* renamed from: s, reason: collision with root package name */
    public final r45.d62[] f116544s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.view.vb f116545t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(com.tencent.mm.plugin.finder.live.view.ib style, android.content.Context context) {
        super(context);
        android.view.View inflate;
        kotlin.jvm.internal.o.g(style, "style");
        kotlin.jvm.internal.o.g(context, "context");
        this.f116532d = "FinderLiveTaskItemView";
        this.f116544s = new r45.d62[]{r45.d62.FINDER_LIVE_QUEST_COMM_TARGET_TYPE_SET_LIVE_COVER, r45.d62.FINDER_LIVE_QUEST_COMM_TARGET_TYPE_SET_MUSIC_COUNT, r45.d62.FINDER_LIVE_QUEST_COMM_TARGET_TYPE_ANCHOR_SHARE_LIVEROOM, r45.d62.FINDER_LIVE_QUEST_COMM_TARGET_TYPE_OPEN_FANS_CLUB, r45.d62.FINDER_LIVE_QUEST_COMM_TARGET_TYPE_SET_LOTTERY_COUNT, r45.d62.FINDER_LIVE_QUEST_COMM_TARGET_TYPE_SET_LIVE_WISH_LIST, r45.d62.FINDER_LIVE_QUEST_COMM_TARGET_TYPE_SET_LIVE_EXPLAIN_PRODUCT, r45.d62.FINDER_LIVE_QUEST_COMM_TARGET_TYPE_MIC_COUNT, r45.d62.FINDER_LIVE_QUEST_COMM_TARGET_TYPE_CREATE_NOTICE_COUNT};
        this.f116545t = com.tencent.mm.plugin.finder.live.view.vb.f116754e;
        int ordinal = style.ordinal();
        if (ordinal == 0) {
            inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dt_, this);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        } else if (ordinal == 1) {
            inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dtc, this);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dtd, this);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        }
        this.f116533e = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f485637rv5);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f116534f = findViewById;
        android.view.View view = this.f116533e;
        if (view == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.rvh);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f116536h = findViewById2;
        android.view.View view2 = this.f116533e;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById3 = view2.findViewById(com.tencent.mm.R.id.rvg);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f116538m = (android.widget.TextView) findViewById3;
        android.view.View view3 = this.f116533e;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById4 = view3.findViewById(com.tencent.mm.R.id.rvi);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f116539n = (android.widget.TextView) findViewById4;
        android.view.View view4 = this.f116533e;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById5 = view4.findViewById(com.tencent.mm.R.id.rvl);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f116540o = (android.widget.TextView) findViewById5;
        android.view.View view5 = this.f116533e;
        if (view5 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById6 = view5.findViewById(com.tencent.mm.R.id.rvf);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f116541p = (android.widget.ProgressBar) findViewById6;
        android.view.View view6 = this.f116533e;
        if (view6 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById7 = view6.findViewById(com.tencent.mm.R.id.f485636rv4);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f116542q = (android.widget.TextView) findViewById7;
        android.view.View view7 = this.f116533e;
        if (view7 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        this.f116543r = view7.findViewById(com.tencent.mm.R.id.rve);
        android.view.View view8 = this.f116533e;
        if (view8 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById8 = view8.findViewById(com.tencent.mm.R.id.rv6);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f116535g = (android.widget.TextView) findViewById8;
        android.view.View view9 = this.f116533e;
        if (view9 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById9 = view9.findViewById(com.tencent.mm.R.id.rvj);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f116537i = (android.widget.TextView) findViewById9;
    }

    public void a(r45.vd5 progressItem, r45.rk6 targetItem, boolean z17, boolean z18) {
        jz5.l lVar;
        android.content.Context context;
        android.content.Context context2;
        android.content.Context context3;
        kotlin.jvm.internal.o.g(progressItem, "progressItem");
        kotlin.jvm.internal.o.g(targetItem, "targetItem");
        r45.d62 a17 = r45.d62.a(targetItem.getInteger(1));
        boolean G = kz5.z.G(this.f116544s, a17);
        java.util.LinkedList linkedList = com.tencent.mm.plugin.finder.live.widget.rx.Z;
        boolean contains = linkedList != null ? linkedList.contains(java.lang.Integer.valueOf(targetItem.getInteger(1))) : false;
        com.tencent.mars.xlog.Log.i(this.f116532d, "[setTask] type:" + targetItem.getInteger(1) + ", isSupportActionType:" + G + ", isActionType:" + contains);
        if (!contains) {
            android.view.View view = this.f116534f;
            if (view == null) {
                kotlin.jvm.internal.o.o("actionGroup");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveTaskItemView", "setTask", "(Lcom/tencent/mm/protocal/protobuf/ProgressItem;Lcom/tencent/mm/protocal/protobuf/TargetItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveTaskItemView", "setTask", "(Lcom/tencent/mm/protocal/protobuf/ProgressItem;Lcom/tencent/mm/protocal/protobuf/TargetItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f116536h;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("progressGroup");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveTaskItemView", "setTask", "(Lcom/tencent/mm/protocal/protobuf/ProgressItem;Lcom/tencent/mm/protocal/protobuf/TargetItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/view/FinderLiveTaskItemView", "setTask", "(Lcom/tencent/mm/protocal/protobuf/ProgressItem;Lcom/tencent/mm/protocal/protobuf/TargetItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            setStatus(com.tencent.mm.plugin.finder.live.view.vb.f116754e);
            android.widget.TextView textView = this.f116537i;
            if (textView == null) {
                kotlin.jvm.internal.o.o("progressTitle");
                throw null;
            }
            textView.setText(targetItem.getString(3));
            android.widget.TextView textView2 = this.f116538m;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("progressCurrentTxt");
                throw null;
            }
            textView2.setText(java.lang.String.valueOf(progressItem.getLong(0)));
            android.widget.TextView textView3 = this.f116539n;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("progressTarget");
                throw null;
            }
            textView3.setText("/" + targetItem.getLong(0));
            android.widget.TextView textView4 = this.f116540o;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("progressUnit");
                throw null;
            }
            textView4.setText(java.lang.String.valueOf(targetItem.getString(4)));
            android.widget.ProgressBar progressBar = this.f116541p;
            if (progressBar == null) {
                kotlin.jvm.internal.o.o("progressBar");
                throw null;
            }
            progressBar.setProgress((int) progressItem.getLong(0));
            android.widget.ProgressBar progressBar2 = this.f116541p;
            if (progressBar2 != null) {
                progressBar2.setMax((int) targetItem.getLong(0));
                return;
            } else {
                kotlin.jvm.internal.o.o("progressBar");
                throw null;
            }
        }
        android.view.View view3 = this.f116534f;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("actionGroup");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveTaskItemView", "setTask", "(Lcom/tencent/mm/protocal/protobuf/ProgressItem;Lcom/tencent/mm/protocal/protobuf/TargetItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/view/FinderLiveTaskItemView", "setTask", "(Lcom/tencent/mm/protocal/protobuf/ProgressItem;Lcom/tencent/mm/protocal/protobuf/TargetItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView5 = this.f116535g;
        if (textView5 == null) {
            kotlin.jvm.internal.o.o("actionTitle");
            throw null;
        }
        textView5.setText(targetItem.getString(3));
        kotlin.jvm.internal.o.d(a17);
        int ordinal = a17.ordinal();
        if (ordinal != 4) {
            int i17 = com.tencent.mm.R.string.mq6;
            if (ordinal == 15) {
                lVar = new jz5.l(java.lang.Boolean.valueOf(!z18), !z18 ? getContext().getString(com.tencent.mm.R.string.mpl) : getContext().getString(com.tencent.mm.R.string.mq6));
            } else if (ordinal == 22) {
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(!z18);
                android.content.Context context4 = getContext();
                if (!z18) {
                    i17 = com.tencent.mm.R.string.mpk;
                }
                lVar = new jz5.l(valueOf, context4.getString(i17));
            } else if (ordinal == 26) {
                java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z17 && !z18);
                if (!z17 || z18) {
                    context = getContext();
                } else {
                    context = getContext();
                    i17 = com.tencent.mm.R.string.mpm;
                }
                lVar = new jz5.l(valueOf2, context.getString(i17));
            } else if (ordinal == 40) {
                lVar = new jz5.l(java.lang.Boolean.valueOf(!z18), !z18 ? getContext().getString(com.tencent.mm.R.string.mpl) : getContext().getString(com.tencent.mm.R.string.mq6));
            } else if (ordinal == 43) {
                java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(z17 && !z18);
                if (!z17 || z18) {
                    context2 = getContext();
                } else {
                    context2 = getContext();
                    i17 = com.tencent.mm.R.string.mpn;
                }
                lVar = new jz5.l(valueOf3, context2.getString(i17));
            } else if (ordinal == 44) {
                java.lang.Boolean valueOf4 = java.lang.Boolean.valueOf(z17 && !z18);
                if (!z17 || z18) {
                    context3 = getContext();
                } else {
                    context3 = getContext();
                    i17 = com.tencent.mm.R.string.mpu;
                }
                lVar = new jz5.l(valueOf4, context3.getString(i17));
            } else if (ordinal == 59) {
                lVar = new jz5.l(java.lang.Boolean.valueOf(!z18), !z18 ? getContext().getString(com.tencent.mm.R.string.mpl) : getContext().getString(com.tencent.mm.R.string.mq6));
            } else if (ordinal != 60) {
                lVar = new jz5.l(java.lang.Boolean.valueOf(z17), "");
            } else {
                lVar = new jz5.l(java.lang.Boolean.valueOf(!z18), !z18 ? getContext().getString(com.tencent.mm.R.string.mpl) : getContext().getString(com.tencent.mm.R.string.mq6));
            }
        } else {
            lVar = new jz5.l(java.lang.Boolean.TRUE, getContext().getString(com.tencent.mm.R.string.mpj));
        }
        boolean booleanValue = ((java.lang.Boolean) lVar.f302833d).booleanValue();
        java.lang.String str = (java.lang.String) lVar.f302834e;
        if (G) {
            android.widget.TextView textView6 = this.f116542q;
            if (textView6 == null) {
                kotlin.jvm.internal.o.o("actionBtn");
                throw null;
            }
            textView6.setText(str);
            setStatus(progressItem.getLong(0) >= targetItem.getLong(0) ? com.tencent.mm.plugin.finder.live.view.vb.f116756g : booleanValue ? com.tencent.mm.plugin.finder.live.view.vb.f116754e : com.tencent.mm.plugin.finder.live.view.vb.f116755f);
        } else {
            android.widget.TextView textView7 = this.f116542q;
            if (textView7 == null) {
                kotlin.jvm.internal.o.o("actionBtn");
                throw null;
            }
            textView7.setText(getContext().getString(com.tencent.mm.R.string.mpr));
            setStatus(com.tencent.mm.plugin.finder.live.view.vb.f116755f);
        }
        android.view.View view4 = this.f116536h;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("progressGroup");
            throw null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveTaskItemView", "setTask", "(Lcom/tencent/mm/protocal/protobuf/ProgressItem;Lcom/tencent/mm/protocal/protobuf/TargetItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/view/FinderLiveTaskItemView", "setTask", "(Lcom/tencent/mm/protocal/protobuf/ProgressItem;Lcom/tencent/mm/protocal/protobuf/TargetItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public com.tencent.mm.plugin.finder.live.view.vb getStatus() {
        return this.f116545t;
    }

    public final void setActionListener(android.view.View.OnClickListener listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        if (getStatus() == com.tencent.mm.plugin.finder.live.view.vb.f116754e) {
            android.widget.TextView textView = this.f116542q;
            if (textView != null) {
                textView.setOnClickListener(listener);
                return;
            } else {
                kotlin.jvm.internal.o.o("actionBtn");
                throw null;
            }
        }
        android.widget.TextView textView2 = this.f116542q;
        if (textView2 != null) {
            textView2.setOnClickListener(null);
        } else {
            kotlin.jvm.internal.o.o("actionBtn");
            throw null;
        }
    }

    public final void setDotViewVisible(boolean z17) {
        android.view.View view = this.f116543r;
        if (view == null) {
            return;
        }
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveTaskItemView", "setDotViewVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveTaskItemView", "setDotViewVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.view.wb
    public void setStatus(com.tencent.mm.plugin.finder.live.view.vb value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.f116545t = value;
        android.widget.TextView textView = this.f116542q;
        if (textView == null) {
            kotlin.jvm.internal.o.o("actionBtn");
            throw null;
        }
        textView.setBackground(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481793cv2));
        android.view.View view = this.f116543r;
        if (view != null) {
            view.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
        }
        int ordinal = getStatus().ordinal();
        if (ordinal == 0) {
            com.tencent.mm.accessibility.base.MapExpandKt.visitChild(this, new com.tencent.mm.plugin.finder.live.view.jb(this));
            android.view.View view2 = this.f116543r;
            if (view2 != null) {
                view2.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_3));
                return;
            }
            return;
        }
        if (ordinal == 1) {
            com.tencent.mm.accessibility.base.MapExpandKt.visitChild(this, new com.tencent.mm.plugin.finder.live.view.kb(this));
            android.widget.TextView textView2 = this.f116538m;
            if (textView2 != null) {
                textView2.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478554ao));
                return;
            } else {
                kotlin.jvm.internal.o.o("progressCurrentTxt");
                throw null;
            }
        }
        if (ordinal == 2) {
            com.tencent.mm.accessibility.base.MapExpandKt.visitChild(this, new com.tencent.mm.plugin.finder.live.view.lb(this));
            android.widget.TextView textView3 = this.f116538m;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("progressCurrentTxt");
                throw null;
            }
            textView3.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478554ao));
            android.widget.TextView textView4 = this.f116542q;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("actionBtn");
                throw null;
            }
            textView4.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1));
            android.widget.TextView textView5 = this.f116542q;
            if (textView5 != null) {
                textView5.setBackground(null);
                return;
            } else {
                kotlin.jvm.internal.o.o("actionBtn");
                throw null;
            }
        }
        if (ordinal != 3) {
            return;
        }
        com.tencent.mm.accessibility.base.MapExpandKt.visitChild(this, new com.tencent.mm.plugin.finder.live.view.mb(this));
        android.widget.TextView textView6 = this.f116538m;
        if (textView6 == null) {
            kotlin.jvm.internal.o.o("progressCurrentTxt");
            throw null;
        }
        textView6.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478554ao));
        android.widget.TextView textView7 = this.f116542q;
        if (textView7 == null) {
            kotlin.jvm.internal.o.o("actionBtn");
            throw null;
        }
        textView7.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1));
        android.widget.TextView textView8 = this.f116542q;
        if (textView8 == null) {
            kotlin.jvm.internal.o.o("actionBtn");
            throw null;
        }
        textView8.setText(getContext().getString(com.tencent.mm.R.string.mpf));
        android.widget.TextView textView9 = this.f116542q;
        if (textView9 != null) {
            textView9.setBackground(null);
        } else {
            kotlin.jvm.internal.o.o("actionBtn");
            throw null;
        }
    }
}
