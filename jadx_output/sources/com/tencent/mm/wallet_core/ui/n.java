package com.tencent.mm.wallet_core.ui;

/* loaded from: classes8.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.MMScrollView f214209e;

    public n(com.tencent.mm.wallet_core.ui.MMScrollView mMScrollView, android.view.View view) {
        this.f214209e = mMScrollView;
        this.f214208d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        int top = this.f214208d.getTop();
        com.tencent.mm.wallet_core.ui.MMScrollView mMScrollView = this.f214209e;
        mMScrollView.scrollTo(0, top - i65.a.b(mMScrollView.getContext(), 10));
    }
}
