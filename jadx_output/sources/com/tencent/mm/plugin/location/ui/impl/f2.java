package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.y1 f144818d;

    public f2(com.tencent.mm.plugin.location.ui.impl.y1 y1Var) {
        this.f144818d = y1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.location.ui.impl.y1 y1Var = this.f144818d;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) y1Var.m(com.tencent.mm.R.id.jbp);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) y1Var.W.findViewById(com.tencent.mm.R.id.in_);
        if (frameLayout == null || relativeLayout.getHeight() < 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TrackMapUI", "mapcontent is null!");
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        }
        layoutParams.height = frameLayout.getHeight() - relativeLayout.getHeight();
        frameLayout.setLayoutParams(layoutParams);
        y1Var.f144741t.setLogoMargin(new int[]{24, 24});
    }
}
