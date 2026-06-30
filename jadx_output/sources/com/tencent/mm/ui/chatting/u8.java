package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public class u8 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f202738d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingUIFragment f202739e;

    public u8(com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment) {
        this.f202739e = chattingUIFragment;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        sb5.s0 s0Var;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter;
        java.lang.String str = com.tencent.mm.ui.chatting.ChattingUIFragment.M;
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = this.f202739e;
        chattingUIFragment.getClass();
        if (motionEvent.getAction() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIFragment", "onTouch: touch down");
            this.f202738d = true;
        } else if (motionEvent.getAction() == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIFragment", "onTouch: touch up");
            this.f202738d = false;
        }
        if (this.f202738d && chattingUIFragment.D && (s0Var = (sb5.s0) chattingUIFragment.f198152f.f460708c.a(sb5.s0.class)) != null && (chatFooter = ((com.tencent.mm.ui.chatting.component.jb) s0Var).f199263e) != null) {
            chatFooter.w0(true);
        }
        return false;
    }
}
