package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f148459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexOSUIv2 f148460e;

    public p0(com.tencent.mm.plugin.mall.ui.MallIndexOSUIv2 mallIndexOSUIv2, android.widget.LinearLayout linearLayout) {
        this.f148460e = mallIndexOSUIv2;
        this.f148459d = linearLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f148460e.H = this.f148459d.getHeight();
    }
}
