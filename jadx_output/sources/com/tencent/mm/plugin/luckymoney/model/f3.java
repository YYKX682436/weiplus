package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public final class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatting.component.ListScrollPAGView f145273d;

    public f3(com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView) {
        this.f145273d = listScrollPAGView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f145273d.d();
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.luckymoney.model.e3(this.f145273d));
    }
}
