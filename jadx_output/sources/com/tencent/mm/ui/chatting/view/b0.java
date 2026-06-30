package com.tencent.mm.ui.chatting.view;

/* loaded from: classes13.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.FoldableCellLayout f202877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f202878e;

    public b0(com.tencent.mm.ui.chatting.view.FoldableCellLayout foldableCellLayout, yz5.a aVar) {
        this.f202877d = foldableCellLayout;
        this.f202878e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.view.FoldableCellLayout foldableCellLayout = this.f202877d;
        if (!foldableCellLayout.f202828h || foldableCellLayout.f202829i) {
            return;
        }
        com.tencent.mars.xlog.Log.i(foldableCellLayout.f202824d, "reset anim params by post delay");
        foldableCellLayout.f202835r.clear();
        foldableCellLayout.f202836s.clear();
        foldableCellLayout.f202828h = false;
        foldableCellLayout.f202829i = true;
        yz5.a aVar = this.f202878e;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
