package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public class x8 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingUIFragment f206235d;

    public x8(com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment) {
        this.f206235d = chattingUIFragment;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        if (i38 <= 0 || i38 <= i27) {
            return;
        }
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = this.f206235d;
        if (((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) chattingUIFragment.f198152f.f460708c.a(sb5.s0.class))).f199263e.f190010k2) {
            chattingUIFragment.f1(true, false, false);
        }
    }
}
