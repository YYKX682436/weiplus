package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public class t extends androidx.recyclerview.widget.k3 implements android.view.View.OnClickListener, android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f139284d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f139285e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f139286f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f139287g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewGroup f139288h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f139289i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f139290m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f139291n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.ImageView f139292o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData f139293p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo f139294q;

    /* renamed from: r, reason: collision with root package name */
    public int f139295r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.u f139296s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.game.chatroom.view.u uVar, android.view.View view) {
        super(view);
        this.f139296s = uVar;
        this.f139284d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f485859jc3);
        this.f139285e = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f485860jc4);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f482940se);
        this.f139286f = textView;
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h6y);
        this.f139287g = imageView;
        textView.setOnClickListener(this);
        imageView.setOnClickListener(this);
        imageView.setOnLongClickListener(this);
        this.f139288h = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.f487523ov5);
        this.f139289i = view.findViewById(com.tencent.mm.R.id.ov7);
        this.f139290m = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ov6);
        this.f139291n = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f487522ov4);
        this.f139292o = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.i0u);
    }

    public final void i(int i17) {
        long j17;
        if (i17 == 1) {
            j17 = 6;
        } else if (i17 == 2) {
            j17 = 7;
        } else if (i17 != 3) {
            return;
        } else {
            j17 = 28;
        }
        long j18 = j17;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData = this.f139293p;
        if (chatroomUserData != null) {
            com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
            long j19 = this.f139295r + 1;
            com.tencent.mm.plugin.game.chatroom.view.ChatMemberListView chatMemberListView = this.f139296s.f139302e;
            fVar.l(j19, j18, chatMemberListView.f138874h2, chatMemberListView.f138873g2, chatroomUserData.username);
        }
    }

    public final void j(com.tencent.mm.plugin.game.autogen.chatroom.Color color) {
        android.graphics.drawable.GradientDrawable gradientDrawable;
        if (color != null) {
            java.lang.String str = color.dark_color;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            java.lang.Integer l17 = s33.y.l(str);
            if (l17 == null || (gradientDrawable = (android.graphics.drawable.GradientDrawable) this.f139289i.getBackground()) == null) {
                return;
            }
            gradientDrawable.setColor(l17.intValue());
        }
    }

    @Override // android.view.View.OnClickListener
    public synchronized void onClick(android.view.View view) {
        com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData = this.f139293p;
        if (chatroomUserData != null && com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL.equals(chatroomUserData.username) && !s33.y.e(this.f139293p.chatroom_name).f402490a) {
            com.tencent.mm.plugin.game.chatroom.view.ChatMemberListView chatMemberListView = this.f139296s.f139302e;
            i(s33.y.h(chatMemberListView.f138872f2, chatMemberListView.f138881o2));
            yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData2 = this.f139293p;
        if (chatroomUserData2 != null && !s33.y.e(chatroomUserData2.chatroom_name).f402490a) {
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo2 = this.f139294q;
            if (jumpInfo2 != null && jumpInfo2.jump_type == 1 && (jumpInfo = this.f139296s.f139302e.f138879m2) != null && !com.tencent.mm.sdk.platformtools.t8.K0(jumpInfo.jump_url)) {
                java.lang.String str = this.f139296s.f139302e.f138879m2.preload_id;
                if (str == null) {
                    str = "";
                }
                if (str.equals(this.f139294q.preload_id)) {
                    com.tencent.mm.plugin.game.luggage.p1.a(this.f139296s.f139302e.f138879m2.jump_url, new com.tencent.mm.plugin.game.chatroom.view.s(this));
                }
            }
            i(s33.y.h(this.f139296s.f139302e.f138872f2, this.f139294q));
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo3 = this.f139294q;
            if (jumpInfo3 != null) {
                com.tencent.mars.xlog.Log.i("GameChatRoom.ChatMemberListView", "slot jump url: %s", jumpInfo3.jump_url);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$ViewHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData = this.f139293p;
        if (chatroomUserData != null && !com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL.equals(chatroomUserData.username) && !s33.y.e(this.f139293p.chatroom_name).f402490a && !s33.y.e(this.f139293p.chatroom_name).f402491b) {
            com.tencent.mm.autogen.events.ChatRoomAtFunctionEvent chatRoomAtFunctionEvent = new com.tencent.mm.autogen.events.ChatRoomAtFunctionEvent();
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData2 = this.f139293p;
            java.lang.String str = chatroomUserData2.username;
            am.b2 b2Var = chatRoomAtFunctionEvent.f54037g;
            b2Var.f6208a = str;
            b2Var.f6209b = chatroomUserData2.nickname;
            chatRoomAtFunctionEvent.e();
            com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
            long j17 = this.f139295r + 1;
            com.tencent.mm.plugin.game.chatroom.view.ChatMemberListView chatMemberListView = this.f139296s.f139302e;
            fVar.l(j17, 27L, chatMemberListView.f138874h2, chatMemberListView.f138873g2, this.f139293p.username);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$ViewHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
