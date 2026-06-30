package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class a9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f198368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f198369e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingUIFragment f198370f;

    public a9(com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment, boolean z17, boolean z18) {
        this.f198370f = chattingUIFragment;
        this.f198368d = z17;
        this.f198369e = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = com.tencent.mm.ui.chatting.ChattingUIFragment.M;
        this.f198370f.g1(this.f198368d, this.f198369e);
    }
}
