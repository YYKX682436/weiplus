package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes12.dex */
public class rk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final yb5.d f205458d;

    public rk(yb5.d dVar) {
        this.f205458d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemEmojiBase$EmojiCaptureTipsClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureTipsClickListener", "onClick: ");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_CAPTURE_PANEL_FROM_TIPS_TIME_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15982, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", 0, 0);
        com.tencent.mm.autogen.events.EmojiUpdatePanelEvent emojiUpdatePanelEvent = new com.tencent.mm.autogen.events.EmojiUpdatePanelEvent();
        emojiUpdatePanelEvent.f54105g.f7799a = 2;
        emojiUpdatePanelEvent.e();
        new com.tencent.mm.autogen.events.RefreshSmileyPanelEvent().e();
        boolean z17 = emojiUpdatePanelEvent.f54106h.f7869a;
        yb5.d dVar = this.f205458d;
        if (!z17) {
            h65.c.f279320b.a(-29414086, "capture");
            ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) dVar.f460708c.a(sb5.s0.class))).f199263e.setDefaultSmileyByDetail("capture");
        }
        ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) dVar.f460708c.a(sb5.s0.class))).f199263e.x1();
        dVar.K();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemEmojiBase$EmojiCaptureTipsClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
