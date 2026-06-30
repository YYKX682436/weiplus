package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class e9 implements com.tencent.mm.sdk.platformtools.f7 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingUIFragment f200466d;

    public e9(com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment) {
        this.f200466d = chattingUIFragment;
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = this.f200466d;
        chattingUIFragment.f198152f.b0();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIFragment", "onScreenShot dateAdded = %d", java.lang.Long.valueOf(j17));
        w04.l.INSTANCE.kc(str, j17, chattingUIFragment.f198152f.x(), chattingUIFragment.f198152f.u().r2() ? 1 : chattingUIFragment.f198152f.C() ? 2 : 0);
    }
}
