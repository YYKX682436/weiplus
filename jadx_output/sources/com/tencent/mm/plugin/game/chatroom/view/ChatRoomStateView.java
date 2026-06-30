package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public class ChatRoomStateView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f138925d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f138926e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.game.chatroom.view.ChatMemberListView f138927f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f138928g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f138929h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f138930i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f138931m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f138932n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f138933o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f138934p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.Notification f138935q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f138936r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f138937s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f138938t;

    public ChatRoomStateView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f138934p = new java.util.concurrent.CopyOnWriteArrayList();
        this.f138937s = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.game.chatroom.view.o0(this), false);
        this.f138938t = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.game.chatroom.view.p0(this), false);
        this.f138925d = context;
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488392s2, this);
        this.f138927f = (com.tencent.mm.plugin.game.chatroom.view.ChatMemberListView) findViewById(com.tencent.mm.R.id.bgb);
    }

    public final void a() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f138936r)) {
            return;
        }
        this.f138932n.setTextColor(this.f138925d.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
        this.f138932n.setText(this.f138936r);
        this.f138932n.setVisibility(0);
        this.f138932n.setTag(1);
    }

    public final void b(com.tencent.mm.plugin.game.autogen.chatroom.Notification notification) {
        if (this.f138926e == null || notification == null) {
            return;
        }
        this.f138935q = notification;
        android.view.View view = this.f138928g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomStateView", "showNotification", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/Notification;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomStateView", "showNotification", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/Notification;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f138928g.setClickable(false);
        if (notification.jump_info != null) {
            this.f138928g.setClickable(true);
            this.f138928g.setOnClickListener(new com.tencent.mm.plugin.game.chatroom.view.q0(this, notification));
        }
        com.tencent.mm.plugin.game.autogen.chatroom.Color color = notification.background_color;
        if (color != null) {
            java.lang.String str = color.dark_color;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            java.lang.Integer l17 = s33.y.l(str);
            if (l17 != null) {
                ((android.graphics.drawable.GradientDrawable) this.f138928g.getBackground()).setColor(l17.intValue());
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(notification.left_icon_url)) {
            this.f138929h.setVisibility(8);
        } else {
            this.f138929h.setVisibility(0);
            if (!(this.f138929h.getTag() instanceof java.lang.String) || !this.f138929h.getTag().equals(notification.left_icon_url)) {
                this.f138929h.setTag(notification.left_icon_url);
                r53.y.a().e(this.f138929h, notification.left_icon_url, null, null);
            }
        }
        this.f138930i.setText(notification.wording);
        com.tencent.mm.plugin.game.autogen.chatroom.Color color2 = notification.word_color;
        if (color2 != null) {
            java.lang.String str2 = color2.dark_color;
            java.lang.Integer l18 = s33.y.l(str2 != null ? str2 : "");
            if (l18 != null) {
                this.f138930i.setTextColor(l18.intValue());
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(notification.right_icon_url)) {
            this.f138931m.setVisibility(8);
            return;
        }
        this.f138931m.setVisibility(0);
        if (!(this.f138931m.getTag() instanceof java.lang.String) || !this.f138931m.getTag().equals(notification.right_icon_url)) {
            this.f138931m.setTag(notification.right_icon_url);
            r53.y.a().e(this.f138931m, notification.right_icon_url, null, null);
        }
        this.f138931m.setClickable(false);
        if (notification.right_icon_can_close) {
            this.f138931m.setClickable(true);
            this.f138931m.setOnClickListener(new com.tencent.mm.plugin.game.chatroom.view.r0(this, notification));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f138937s;
        if (b4Var != null) {
            b4Var.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = this.f138938t;
        if (b4Var2 != null) {
            b4Var2.d();
        }
    }

    public void setPremadeCardInfo(java.lang.String str) {
        this.f138927f.setPremadeCardInfo(str);
    }

    public void setStateChangeListener(u33.l lVar) {
        this.f138927f.setStateChangeListener(lVar);
    }

    public ChatRoomStateView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f138934p = new java.util.concurrent.CopyOnWriteArrayList();
        this.f138937s = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.game.chatroom.view.o0(this), false);
        this.f138938t = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.game.chatroom.view.p0(this), false);
        this.f138925d = context;
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488392s2, this);
        this.f138927f = (com.tencent.mm.plugin.game.chatroom.view.ChatMemberListView) findViewById(com.tencent.mm.R.id.bgb);
    }
}
