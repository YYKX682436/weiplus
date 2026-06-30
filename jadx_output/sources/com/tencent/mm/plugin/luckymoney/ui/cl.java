package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class cl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f146802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.gl f146803e;

    public cl(java.lang.String str, com.tencent.mm.plugin.luckymoney.ui.gl glVar) {
        this.f146802d = str;
        this.f146803e = glVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.luckymoney.model.n3 n3Var = com.tencent.mm.plugin.luckymoney.model.n3.f145460a;
        com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView = this.f146803e.f146960h;
        if (listScrollPAGView != null) {
            n3Var.f(1, this.f146802d, listScrollPAGView);
        } else {
            kotlin.jvm.internal.o.o("pagWidgetView");
            throw null;
        }
    }
}
