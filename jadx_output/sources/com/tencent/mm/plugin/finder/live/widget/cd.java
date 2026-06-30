package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class cd extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.gd f117992d;

    public cd(com.tencent.mm.plugin.finder.live.widget.gd gdVar) {
        this.f117992d = gdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.widget.gd gdVar = this.f117992d;
        gdVar.setVisibility(8);
        int i17 = gdVar.f118420d;
        gdVar.f118422f = i17;
        gdVar.f118423g.setText(java.lang.String.valueOf(i17));
        gdVar.setAlpha(1.0f);
        yz5.a aVar = gdVar.f118426m;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.widget.gd gdVar = this.f117992d;
        gdVar.setVisibility(8);
        int i17 = gdVar.f118420d;
        gdVar.f118422f = i17;
        gdVar.f118423g.setText(java.lang.String.valueOf(i17));
        gdVar.setAlpha(1.0f);
        yz5.a aVar = gdVar.f118426m;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
