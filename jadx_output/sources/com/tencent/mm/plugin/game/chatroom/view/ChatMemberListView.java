package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes7.dex */
public class ChatMemberListView extends com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView {

    /* renamed from: f2, reason: collision with root package name */
    public android.content.Context f138872f2;

    /* renamed from: g2, reason: collision with root package name */
    public long f138873g2;

    /* renamed from: h2, reason: collision with root package name */
    public long f138874h2;

    /* renamed from: i2, reason: collision with root package name */
    public com.tencent.mm.plugin.game.chatroom.view.u f138875i2;

    /* renamed from: j2, reason: collision with root package name */
    public com.tencent.mm.plugin.game.chatroom.view.m1 f138876j2;

    /* renamed from: k2, reason: collision with root package name */
    public final java.util.Set f138877k2;

    /* renamed from: l2, reason: collision with root package name */
    public final java.util.Map f138878l2;

    /* renamed from: m2, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo f138879m2;

    /* renamed from: n2, reason: collision with root package name */
    public java.lang.String f138880n2;

    /* renamed from: o2, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo f138881o2;

    /* renamed from: p2, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.Slot f138882p2;

    /* renamed from: q2, reason: collision with root package name */
    public u33.l f138883q2;

    public ChatMemberListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f138877k2 = new java.util.HashSet();
        this.f138878l2 = new java.util.HashMap();
        this.f138882p2 = new com.tencent.mm.plugin.game.autogen.chatroom.Slot();
        l1(context);
    }

    public final void l1(android.content.Context context) {
        this.f138872f2 = context;
        android.app.Activity activity = (android.app.Activity) context;
        this.f138873g2 = activity.getIntent().getLongExtra("game_report_sourceid", 0L);
        this.f138874h2 = activity.getIntent().getLongExtra("game_report_ssid", 0L);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(context);
        linearLayoutManager.Q(0);
        setLayoutManager(linearLayoutManager);
        com.tencent.mm.plugin.game.chatroom.view.m1 m1Var = new com.tencent.mm.plugin.game.chatroom.view.m1(1);
        this.f138876j2 = m1Var;
        m1Var.f139220d = this;
        m1Var.f139226m = 5;
        V0(m1Var);
        m1Var.f139220d.i(m1Var);
        m1Var.f139230q = (androidx.recyclerview.widget.LinearLayoutManager) m1Var.f139220d.getLayoutManager();
        m1Var.f139223g = new com.tencent.mm.plugin.game.chatroom.view.k1(m1Var, m1Var.f139220d.getContext());
        m1Var.f139224h = new com.tencent.mm.plugin.game.chatroom.view.l1(m1Var, m1Var.f139220d.getContext());
        setItemViewCacheSize(15);
        com.tencent.mm.plugin.game.chatroom.view.u uVar = new com.tencent.mm.plugin.game.chatroom.view.u(this, null);
        this.f138875i2 = uVar;
        setAdapter(uVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean r0(int i17, int i18) {
        com.tencent.mm.plugin.game.chatroom.view.m1 m1Var = this.f138876j2;
        int a17 = m1Var.a(m1Var.f139221e + i17);
        androidx.recyclerview.widget.RecyclerView recyclerView = m1Var.f139220d;
        if (recyclerView != null && m1Var.f139235v) {
            m1Var.f139224h.f12049a = a17;
            m1Var.f139236w = true;
            recyclerView.getLayoutManager().startSmoothScroll(m1Var.f139224h);
        }
        return super.r0(i17, i18);
    }

    public void setChatRoomName(java.lang.String str) {
        if (this.f138882p2 == null) {
            this.f138882p2 = new com.tencent.mm.plugin.game.autogen.chatroom.Slot();
        }
        this.f138882p2.slot_type = 1;
        com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser onlineUser = new com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser();
        onlineUser.status = 1L;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData();
        chatroomUserData.username = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL;
        chatroomUserData.chatroom_name = str;
        linkedList.add(chatroomUserData);
        onlineUser.chat_user_data.addAll(linkedList);
        this.f138882p2.online_user_status = onlineUser;
    }

    public void setPremadeCardInfo(java.lang.String str) {
        this.f138880n2 = str;
    }

    public void setStateChangeListener(u33.l lVar) {
        this.f138883q2 = lVar;
    }

    public ChatMemberListView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f138877k2 = new java.util.HashSet();
        this.f138878l2 = new java.util.HashMap();
        this.f138882p2 = new com.tencent.mm.plugin.game.autogen.chatroom.Slot();
        l1(context);
    }
}
