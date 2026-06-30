package com.tencent.mm.plugin.product.ui;

/* loaded from: classes9.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.h1 f153290d;

    public g1(com.tencent.mm.plugin.product.ui.h1 h1Var) {
        this.f153290d = h1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ScrollView scrollView = (android.widget.ScrollView) this.f153290d.f153296a.findViewById(com.tencent.mm.R.id.jaq);
        if (scrollView != null) {
            scrollView.pageScroll(33);
        }
    }
}
