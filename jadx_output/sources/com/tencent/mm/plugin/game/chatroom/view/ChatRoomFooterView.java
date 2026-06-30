package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes8.dex */
public class ChatRoomFooterView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f138884d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f138885e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f138886f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f138887g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f138888h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f138889i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f138890m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f138891n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f138892o;

    /* renamed from: p, reason: collision with root package name */
    public long f138893p;

    /* renamed from: q, reason: collision with root package name */
    public long f138894q;

    public ChatRoomFooterView(android.content.Context context) {
        super(context);
        b();
    }

    public void a() {
        android.view.View view = this.f138891n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "hideEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "hideEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void b() {
        android.content.Context context = getContext();
        this.f138884d = context;
        this.f138893p = ((android.app.Activity) context).getIntent().getLongExtra("game_report_sourceid", 0L);
        this.f138894q = ((android.app.Activity) this.f138884d).getIntent().getLongExtra("game_report_ssid", 0L);
        android.view.LayoutInflater.from(this.f138884d).inflate(com.tencent.mm.R.layout.f488387rx, (android.view.ViewGroup) this, true);
        this.f138885e = findViewById(com.tencent.mm.R.id.e59);
        this.f138886f = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.e58);
        this.f138887g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.e5_);
        this.f138888h = findViewById(com.tencent.mm.R.id.bha);
        this.f138889i = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.bh_);
        this.f138890m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.bhb);
        this.f138891n = findViewById(com.tencent.mm.R.id.gbr);
        this.f138892o = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.dfj);
        if (com.tencent.mm.ui.bk.C()) {
            this.f138892o.setImageResource(com.tencent.mm.R.drawable.bhz);
        } else {
            this.f138892o.setImageResource(com.tencent.mm.R.drawable.f481405bi0);
        }
    }

    public void c(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpDetail chatroomJumpDetail, com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpDetail chatroomJumpDetail2) {
        java.lang.Integer num;
        com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
        if (chatroomJumpDetail != null) {
            android.view.View view = this.f138885e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "setFooterInfo", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomJumpDetail;Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomJumpDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "setFooterInfo", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomJumpDetail;Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomJumpDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (chatroomJumpDetail.show_icon != null) {
                this.f138886f.setVisibility(0);
                r53.y.a().e(this.f138886f, com.tencent.mm.ui.bk.C() ? chatroomJumpDetail.show_icon.dark_icon : chatroomJumpDetail.show_icon.light_icon, null, null);
            } else {
                this.f138886f.setVisibility(8);
            }
            this.f138887g.setText(chatroomJumpDetail.desc);
            this.f138885e.setOnClickListener(new com.tencent.mm.plugin.game.chatroom.view.x(this, chatroomJumpDetail));
            num = 0;
            fVar.k(1003L, 1L, 1L, 0L, this.f138894q, this.f138893p, "", "", "");
        } else {
            num = 0;
        }
        if (chatroomJumpDetail2 != null) {
            android.view.View view2 = this.f138888h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(num);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "setFooterInfo", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomJumpDetail;Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomJumpDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "setFooterInfo", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomJumpDetail;Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomJumpDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (chatroomJumpDetail2.show_icon != null) {
                this.f138889i.setVisibility(0);
                r53.y.a().e(this.f138889i, com.tencent.mm.ui.bk.C() ? chatroomJumpDetail2.show_icon.dark_icon : chatroomJumpDetail2.show_icon.light_icon, null, null);
            } else {
                this.f138889i.setVisibility(8);
            }
            this.f138890m.setText(chatroomJumpDetail2.desc);
            this.f138888h.setOnClickListener(new com.tencent.mm.plugin.game.chatroom.view.y(this, chatroomJumpDetail2));
            fVar.k(1003L, 3L, 1L, 0L, this.f138894q, this.f138893p, "", "", "");
        }
    }

    public void setLbsInfo(com.tencent.mm.plugin.game.autogen.chatroom.Lbs lbs) {
    }

    public ChatRoomFooterView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public ChatRoomFooterView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        b();
    }
}
