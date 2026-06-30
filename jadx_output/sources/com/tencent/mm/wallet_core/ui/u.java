package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.w f214236d;

    public u(com.tencent.mm.wallet_core.ui.w wVar) {
        this.f214236d = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f214236d.f214258n.findViewById(com.tencent.mm.R.id.jc9);
        if (viewGroup != null) {
            viewGroup.sendAccessibilityEvent(128);
        }
    }
}
