package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class b9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f198496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f198497e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f198498f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f198499g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingUIFragment f198500h;

    public b9(com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment, boolean z17, int i17, int i18, boolean z18) {
        this.f198500h = chattingUIFragment;
        this.f198496d = z17;
        this.f198497e = i17;
        this.f198498f = i18;
        this.f198499g = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f198496d;
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = this.f198500h;
        if (z17 && chattingUIFragment.B.A5()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIFragment", "scrollToLastImpl: isAtBottom in post");
        } else {
            com.tencent.mm.pluginsdk.ui.tools.f7.b(chattingUIFragment.f198269t, this.f198497e - 1, -this.f198498f, this.f198499g, false);
        }
    }
}
