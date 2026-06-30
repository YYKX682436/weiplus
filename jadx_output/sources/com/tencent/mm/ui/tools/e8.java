package com.tencent.mm.ui.tools;

/* loaded from: classes14.dex */
public class e8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.PressImageView f210377d;

    public e8(com.tencent.mm.ui.tools.PressImageView pressImageView) {
        this.f210377d = pressImageView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.PressImageView pressImageView = this.f210377d;
        pressImageView.setPressed(false);
        pressImageView.invalidate();
    }
}
