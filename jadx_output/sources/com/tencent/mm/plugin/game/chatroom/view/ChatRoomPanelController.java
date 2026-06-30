package com.tencent.mm.plugin.game.chatroom.view;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB%\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/game/chatroom/view/ChatRoomPanelController;", "Landroid/widget/LinearLayout;", "", "pageCount", "Ljz5/f0;", "setDotView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "game-chatroom_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class ChatRoomPanelController extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final long f138918d;

    /* renamed from: e, reason: collision with root package name */
    public final long f138919e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.z2 f138920f;

    /* renamed from: g, reason: collision with root package name */
    public final x33.a f138921g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPanel f138922h;

    /* renamed from: i, reason: collision with root package name */
    public int f138923i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f138924m;

    public ChatRoomPanelController(android.content.Context context, long j17, long j18) {
        super(context, null);
        x33.a a17 = x33.a.a(android.view.LayoutInflater.from(getContext()), this, true);
        this.f138921g = a17;
        this.f138924m = new java.util.HashMap();
        a17.f451611c.setOnScreenChangedListener(new com.tencent.mm.plugin.game.chatroom.view.l0(this));
        a17.f451612d.setOnClickListener(new com.tencent.mm.plugin.game.chatroom.view.m0(this));
        a17.f451610b.setDarkStyle(true);
        this.f138918d = j17;
        this.f138919e = j18;
    }

    private final void setDotView(int i17) {
        x33.a aVar = this.f138921g;
        if (i17 < 2) {
            aVar.f451610b.setVisibility(8);
        } else {
            aVar.f451610b.setVisibility(0);
            aVar.f451610b.setDotCount(i17);
        }
    }

    public final void a(int i17, com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPanel chatroomPanel) {
        this.f138924m.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.TRUE);
        int i18 = i17 * 8;
        int i19 = (i17 + 1) * 8;
        if (chatroomPanel.panel_list.size() <= i19) {
            i19 = chatroomPanel.panel_list.size();
        }
        java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.Panel> subList = chatroomPanel.panel_list.subList(i18, i19);
        kotlin.jvm.internal.o.f(subList, "subList(...)");
        int i27 = 0;
        for (java.lang.Object obj : subList) {
            int i28 = i27 + 1;
            if (i27 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
            long j17 = (i17 * 4 * 2) + i28;
            long j18 = this.f138918d;
            long j19 = this.f138919e;
            java.lang.String str = ((com.tencent.mm.plugin.game.autogen.chatroom.Panel) obj).desc;
            if (str == null) {
                str = "";
            }
            fVar.c(j17, 1L, j18, j19, str);
            i27 = i28;
        }
    }

    public final void b(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPanel chatroomPanel) {
        if (chatroomPanel == null || com.tencent.mm.sdk.platformtools.t8.L0(chatroomPanel.panel_list)) {
            return;
        }
        this.f138922h = chatroomPanel;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(getContext(), 0, 0, true, true);
        this.f138920f = z2Var;
        if (z2Var.h()) {
            return;
        }
        int size = ((chatroomPanel.panel_list.size() - 1) / 8) + 1;
        this.f138923i = size;
        setDotView(size);
        int i17 = this.f138923i;
        int i18 = 0;
        while (i18 < i17) {
            android.view.LayoutInflater from = android.view.LayoutInflater.from(getContext());
            x33.a aVar = this.f138921g;
            android.view.View inflate = from.inflate(com.tencent.mm.R.layout.f488388ry, (android.view.ViewGroup) aVar.f451611c, false);
            com.tencent.mm.plugin.game.chatroom.view.PanelGridView panelGridView = (com.tencent.mm.plugin.game.chatroom.view.PanelGridView) inflate.findViewById(com.tencent.mm.R.id.f483619bg4);
            panelGridView.f139016f2 = this.f138918d;
            panelGridView.f139017g2 = this.f138919e;
            aVar.f451611c.addView(inflate, new android.widget.LinearLayout.LayoutParams(-1, -2));
            int i19 = i18 * 8;
            int i27 = i18 + 1;
            int i28 = i27 * 8;
            if (chatroomPanel.panel_list.size() <= i28) {
                i28 = chatroomPanel.panel_list.size();
            }
            panelGridView.setData(chatroomPanel.panel_list.subList(i19, i28));
            if (i18 == 0) {
                a(0, chatroomPanel);
            }
            panelGridView.f139018h2 = new com.tencent.mm.plugin.game.chatroom.view.n0(this);
            i18 = i27;
        }
        z2Var.k(this, 0, 0);
        z2Var.C();
    }

    public ChatRoomPanelController(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        x33.a a17 = x33.a.a(android.view.LayoutInflater.from(getContext()), this, true);
        this.f138921g = a17;
        this.f138924m = new java.util.HashMap();
        a17.f451611c.setOnScreenChangedListener(new com.tencent.mm.plugin.game.chatroom.view.l0(this));
        a17.f451612d.setOnClickListener(new com.tencent.mm.plugin.game.chatroom.view.m0(this));
        a17.f451610b.setDarkStyle(true);
    }

    public ChatRoomPanelController(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        x33.a a17 = x33.a.a(android.view.LayoutInflater.from(getContext()), this, true);
        this.f138921g = a17;
        this.f138924m = new java.util.HashMap();
        a17.f451611c.setOnScreenChangedListener(new com.tencent.mm.plugin.game.chatroom.view.l0(this));
        a17.f451612d.setOnClickListener(new com.tencent.mm.plugin.game.chatroom.view.m0(this));
        a17.f451610b.setDarkStyle(true);
    }
}
