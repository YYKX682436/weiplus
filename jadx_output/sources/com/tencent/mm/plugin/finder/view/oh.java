package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class oh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderPostRemindLayout f132789d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh(com.tencent.mm.plugin.finder.view.FinderPostRemindLayout finderPostRemindLayout) {
        super(0);
        this.f132789d = finderPostRemindLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.FinderPostRemindLayout finderPostRemindLayout = this.f132789d;
        int measuredHeight = finderPostRemindLayout.f131401i.getMeasuredHeight();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat.addUpdateListener(new com.tencent.mm.plugin.finder.view.mh(finderPostRemindLayout, measuredHeight));
        ofFloat.addListener(new com.tencent.mm.plugin.finder.view.nh(finderPostRemindLayout));
        ofFloat.start();
        return jz5.f0.f302826a;
    }
}
