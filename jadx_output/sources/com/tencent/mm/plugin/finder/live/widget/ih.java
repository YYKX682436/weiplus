package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ih implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.xh f118674d;

    public ih(com.tencent.mm.plugin.finder.live.widget.xh xhVar) {
        this.f118674d = xhVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveFansModifyGiftWidget", "[landScapeKeyBoardObserve] show:" + bool);
        if (bool.booleanValue()) {
            return;
        }
        java.util.Set set = com.tencent.mm.plugin.finder.live.widget.xh.H;
        this.f118674d.e();
    }
}
