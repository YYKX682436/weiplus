package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class h3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f118512a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f118513b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f118514c;

    /* renamed from: d, reason: collision with root package name */
    public r45.cw1 f118515d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedHashSet f118516e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.u2 f118517f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.e3 f118518g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f118519h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f118520i;

    /* renamed from: j, reason: collision with root package name */
    public final android.view.View f118521j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.FinderLiveAdGuideWidget$followListener$1 f118522k;

    /* JADX WARN: Type inference failed for: r4v5, types: [com.tencent.mm.plugin.finder.live.widget.FinderLiveAdGuideWidget$followListener$1] */
    public h3(android.content.Context context, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f118512a = context;
        this.f118513b = basePlugin;
        this.f118514c = "FinderLiveAdGuideWidget";
        this.f118516e = new java.util.LinkedHashSet();
        com.tencent.mm.plugin.finder.view.e3 e3Var = new com.tencent.mm.plugin.finder.view.e3(context);
        e3Var.f(com.tencent.mm.R.layout.al7);
        e3Var.a();
        e3Var.f131968r = new com.tencent.mm.plugin.finder.live.widget.w2(this);
        e3Var.f131965o = true;
        this.f118518g = e3Var;
        android.view.View view = e3Var.f131959f;
        this.f118519h = view.findViewById(com.tencent.mm.R.id.f483019ug);
        this.f118520i = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f482660ki);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f482667kp);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView maxHeightWxRecyclerView = (com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView) findViewById;
        com.tencent.mm.plugin.finder.live.widget.u2 u2Var = new com.tencent.mm.plugin.finder.live.widget.u2(this);
        this.f118517f = u2Var;
        maxHeightWxRecyclerView.setAdapter(u2Var);
        maxHeightWxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        maxHeightWxRecyclerView.setMaxHeight(i65.a.b(context, com.tencent.wxmm.v2helper.EMethodSetSendToNetworkOn));
        this.f118521j = view.findViewById(com.tencent.mm.R.id.f482647k5);
        ym5.a1.g(maxHeightWxRecyclerView, new com.tencent.mm.plugin.finder.live.widget.t2(this));
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f118522k = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FollowUserEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.widget.FinderLiveAdGuideWidget$followListener$1
            {
                this.__eventId = 398763182;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FollowUserEvent followUserEvent) {
                com.tencent.mm.autogen.events.FollowUserEvent event = followUserEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.y2(event, com.tencent.mm.plugin.finder.live.widget.h3.this));
                return false;
            }
        };
    }

    public final void a(android.view.View view, r45.cw1 cw1Var) {
        if (view == null || cw1Var == null) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.i_e);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.i_g);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        boolean z17 = cw1Var.getBoolean(4);
        android.content.Context context = this.f118512a;
        if (z17) {
            view.setBackground(null);
            weImageView.setVisibility(8);
            textView.setTextColor(view.getContext().getResources().getColor(com.tencent.mm.R.color.FG_2));
            textView.setText(context.getString(com.tencent.mm.R.string.f492274fw4));
            view.setOnClickListener(com.tencent.mm.plugin.finder.live.widget.d3.f118047d);
            return;
        }
        textView.setText(context.getString(com.tencent.mm.R.string.dfd));
        view.setBackground(view.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a0y));
        weImageView.setVisibility(0);
        textView.setTextColor(view.getContext().getResources().getColor(com.tencent.mm.R.color.f479549ab0));
        view.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.e3(this, cw1Var));
    }

    public final void b(r45.bw1 data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.finder.live.widget.u2 u2Var = this.f118517f;
        u2Var.f119929d.clear();
        java.util.LinkedList list = data.getList(0);
        if (list != null) {
            u2Var.f119929d.addAll(list);
        }
        u2Var.notifyDataSetChanged();
        int size = u2Var.f119929d.size();
        android.view.View view = this.f118521j;
        if (size > 0) {
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAdGuideWidget", "updateDataList", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveGuideFollowAdInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAdGuideWidget", "updateDataList", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveGuideFollowAdInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAdGuideWidget", "updateDataList", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveGuideFollowAdInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAdGuideWidget", "updateDataList", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveGuideFollowAdInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.String string = data.getString(2);
        boolean z17 = string == null || string.length() == 0;
        android.widget.TextView textView = this.f118520i;
        if (z17) {
            if (textView == null) {
                return;
            }
            textView.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.d2e));
        } else {
            if (textView == null) {
                return;
            }
            textView.setText(data.getString(2));
        }
    }
}
