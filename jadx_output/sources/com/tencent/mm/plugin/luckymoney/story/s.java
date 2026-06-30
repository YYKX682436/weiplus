package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout f145908d;

    public s(com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f145908d = envelopeAppBarLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout = this.f145908d;
        envelopeAppBarLayout.f145788w.getGlobalVisibleRect(rect);
        envelopeAppBarLayout.f145788w.setTranslationY((envelopeAppBarLayout.f145780l1 - rect.bottom) / 2.0f);
        envelopeAppBarLayout.f145790x0 = true;
        envelopeAppBarLayout.f145788w.getTranslationY();
    }
}
