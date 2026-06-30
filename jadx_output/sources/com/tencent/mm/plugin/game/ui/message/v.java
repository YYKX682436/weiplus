package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes4.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView f141648d;

    public v(com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView) {
        this.f141648d = interactiveMsgMRecycleView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView = this.f141648d;
        if (com.tencent.mm.sdk.platformtools.t8.L0(interactiveMsgMRecycleView.f141503p2)) {
            interactiveMsgMRecycleView.t1();
        } else {
            new r33.a(interactiveMsgMRecycleView.f141503p2).l().h(new com.tencent.mm.plugin.game.ui.message.u(this));
        }
    }
}
