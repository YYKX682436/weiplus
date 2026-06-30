package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class i7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f207747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.MainUI f207748e;

    public i7(com.tencent.mm.ui.conversation.MainUI mainUI, int i17) {
        this.f207748e = mainUI;
        this.f207747d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.conversation.MainUI mainUI = this.f207748e;
        mainUI.f207372o.smoothScrollToPositionFromTop(this.f207747d, i65.a.b(mainUI.getContext(), 120), 900);
    }
}
