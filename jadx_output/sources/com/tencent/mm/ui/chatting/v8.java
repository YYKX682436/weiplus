package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class v8 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingUIFragment f202799d;

    public v8(com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment) {
        this.f202799d = chattingUIFragment;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = this.f202799d;
        ((com.tencent.mm.ui.chatting.adapter.k) chattingUIFragment.f198268s).G0(chattingUIFragment.f198269t.getFirstVisiblePosition() - chattingUIFragment.f198269t.getHeaderViewsCount(), chattingUIFragment.f198269t.getLastVisiblePosition());
        chattingUIFragment.f198269t.removeOnLayoutChangeListener(this);
    }
}
