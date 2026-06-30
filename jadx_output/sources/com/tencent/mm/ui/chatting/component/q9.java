package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class q9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.r9 f199760d;

    public q9(com.tencent.mm.ui.chatting.component.r9 r9Var) {
        this.f199760d = r9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.component.p9 p9Var = new com.tencent.mm.ui.chatting.component.p9(this);
        com.tencent.mm.ui.chatting.component.r9 r9Var = this.f199760d;
        if ((r9Var.f198580d.p() instanceof android.view.View) && (((android.view.View) r9Var.f198580d.p()).getParent() instanceof android.view.View)) {
            ((android.view.View) ((android.view.View) r9Var.f198580d.p()).getParent()).setOnDragListener(p9Var);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.DragDropComponent", "mChattingContext.getListView() null!");
        }
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) r9Var.f198580d.f460708c.a(sb5.s0.class))).f199263e;
        if (chatFooter == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.DragDropComponent", "chatFooter null!");
        } else {
            chatFooter.setOnDragListener(p9Var);
            chatFooter.setEditTextOnDragListener(p9Var);
        }
    }
}
