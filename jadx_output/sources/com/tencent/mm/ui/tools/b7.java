package com.tencent.mm.ui.tools;

/* loaded from: classes4.dex */
public class b7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.MaskImageButton f210301d;

    public b7(com.tencent.mm.ui.tools.MaskImageButton maskImageButton) {
        this.f210301d = maskImageButton;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.MaskImageButton maskImageButton = this.f210301d;
        maskImageButton.setPressed(false);
        maskImageButton.invalidate();
    }
}
