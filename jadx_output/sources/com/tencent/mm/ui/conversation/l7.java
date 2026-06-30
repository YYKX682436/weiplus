package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class l7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.MainUIView f207847d;

    public l7(com.tencent.mm.ui.conversation.MainUIView mainUIView) {
        this.f207847d = mainUIView;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f207847d.requestLayout();
        com.tencent.mars.xlog.Log.i("MicroMsg.MainUIView", "Request layout once.");
    }
}
