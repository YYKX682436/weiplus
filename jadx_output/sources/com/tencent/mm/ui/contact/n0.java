package com.tencent.mm.ui.contact;

/* loaded from: classes4.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f207034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.CategoryTipView f207035e;

    public n0(com.tencent.mm.ui.contact.CategoryTipView categoryTipView, int i17) {
        this.f207035e = categoryTipView;
        this.f207034d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.ui.contact.CategoryTipView.f206333h;
        com.tencent.mm.ui.contact.CategoryTipView categoryTipView = this.f207035e;
        categoryTipView.a(this.f207034d);
        categoryTipView.invalidate();
    }
}
