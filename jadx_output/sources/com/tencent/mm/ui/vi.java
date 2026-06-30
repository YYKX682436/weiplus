package com.tencent.mm.ui;

/* loaded from: classes4.dex */
public class vi implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f211160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.SingleChatInfoUI f211161e;

    public vi(com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI, int i17) {
        this.f211161e = singleChatInfoUI;
        this.f211160d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI = this.f211161e;
        android.view.View x17 = ((com.tencent.mm.ui.base.preference.b) singleChatInfoUI.f197070d).x(this.f211160d, singleChatInfoUI.getListView());
        if (x17 != null) {
            zg5.a.a(singleChatInfoUI.getContext(), x17);
        }
    }
}
