package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes8.dex */
public class i1 extends com.tencent.mm.plugin.game.chatroom.view.t0 {

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f139150e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f139151f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f139152g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo f139153h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f139154i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMNeat7extView f139155m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f139156n;

    /* renamed from: o, reason: collision with root package name */
    public long f139157o;

    /* renamed from: p, reason: collision with root package name */
    public long f139158p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f139159q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f139160r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f139161s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f139162t;

    public i1(android.view.View view) {
        super(view);
        this.f139162t = false;
        this.f139150e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.m6w);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.cmc);
        this.f139151f = findViewById;
        this.f139152g = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.cmb);
        findViewById.setOnClickListener(new com.tencent.mm.plugin.game.chatroom.view.f1(this));
        android.content.Context context = this.f139297d;
        this.f139160r = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.game_add_icon, i65.a.d(context, com.tencent.mm.R.color.FG_0_CARE));
        this.f139154i = view.findViewById(com.tencent.mm.R.id.kth);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) view.findViewById(com.tencent.mm.R.id.ktq);
        this.f139155m = mMNeat7extView;
        mMNeat7extView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y(mMNeat7extView, new com.tencent.mm.pluginsdk.ui.span.y0(mMNeat7extView.getContext())));
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.ktb);
        this.f139156n = findViewById2;
        float q17 = i65.a.q(this.f139297d);
        findViewById2.getLayoutParams().height = (int) (findViewById2.getLayoutParams().height * q17);
        findViewById2.getLayoutParams().width = (int) (findViewById2.getLayoutParams().width * q17);
        findViewById2.requestLayout();
        findViewById2.setOnClickListener(new com.tencent.mm.plugin.game.chatroom.view.g1(this));
    }

    @Override // com.tencent.mm.plugin.game.chatroom.view.t0
    public void i(w33.a aVar, com.tencent.mm.plugin.game.autogen.chatroom.Lbs lbs, int i17, long j17, long j18, java.util.List list) {
        this.f139157o = j17;
        this.f139158p = j18;
        this.f139159q = list;
        this.f139153h = aVar.f442703e;
        android.widget.TextView textView = this.f139150e;
        int i18 = aVar.f442699a;
        if (i18 == 1) {
            textView.setText(aVar.f442702d);
        } else if (i18 == 3) {
            textView.setText(aVar.f442702d);
        }
        if (this.f139153h != null) {
            this.f139152g.setImageDrawable(this.f139160r);
            android.view.View view = this.f139151f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH", "onBindData", "(Lcom/tencent/mm/plugin/game/chatroom/data/ChatRoomInfo;Lcom/tencent/mm/plugin/game/autogen/chatroom/Lbs;IJJLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH", "onBindData", "(Lcom/tencent/mm/plugin/game/chatroom/data/ChatRoomInfo;Lcom/tencent/mm/plugin/game/autogen/chatroom/Lbs;IJJLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = this.f139151f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH", "onBindData", "(Lcom/tencent/mm/plugin/game/chatroom/data/ChatRoomInfo;Lcom/tencent/mm/plugin/game/autogen/chatroom/Lbs;IJJLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH", "onBindData", "(Lcom/tencent/mm/plugin/game/chatroom/data/ChatRoomInfo;Lcom/tencent/mm/plugin/game/autogen/chatroom/Lbs;IJJLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f139161s = i18 == 3;
    }
}
