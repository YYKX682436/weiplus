package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class y1 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190757d;

    public y1(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190757d = chatFooter;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190757d;
        if (chatFooter.f189955a3 != null) {
            int measuredHeight = (int) ((chatFooter.f190021m.getMeasuredHeight() - chatFooter.f190021m.getMinimumHeight()) * 1.3d);
            com.tencent.mm.pluginsdk.ui.tools.v3 v3Var = ((com.tencent.mm.ui.chatting.ChattingUIFragment) chatFooter.f189955a3.a().f460718m).f198269t;
            if (v3Var instanceof com.tencent.mm.pluginsdk.ui.tools.z3) {
                ((com.tencent.mm.pluginsdk.ui.tools.z3) v3Var).setExtraScrollDistance(measuredHeight);
            }
        }
    }
}
