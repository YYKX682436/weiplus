package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public final class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatting.component.ListScrollPAGView f145449d;

    public m3(com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView) {
        this.f145449d = listScrollPAGView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView = this.f145449d;
        listScrollPAGView.n();
        listScrollPAGView.setProgress(0.0d);
    }
}
