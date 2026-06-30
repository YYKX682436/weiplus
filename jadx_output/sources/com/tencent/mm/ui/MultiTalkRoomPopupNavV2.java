package com.tencent.mm.ui;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/ui/MultiTalkRoomPopupNavV2;", "Lcom/tencent/mm/ui/MultiTalkRoomPopupNav;", "", "getInitViewId", "color", "Ljz5/f0;", "setNavBackgroundColor", "resource", "setNavBackgroundResource", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class MultiTalkRoomPopupNavV2 extends com.tencent.mm.ui.MultiTalkRoomPopupNav {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTalkRoomPopupNavV2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.ui.MultiTalkRoomPopupNav
    public void a() {
        android.widget.LinearLayout linearLayout;
        com.tencent.mm.ui.jf jfVar = this.f197004q;
        if ((jfVar == null || (linearLayout = jfVar.f209004a) == null || linearLayout.getVisibility() != 0) ? false : true) {
            findViewById(com.tencent.mm.R.id.bzg).performClick();
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f196995e;
            if (weImageView != null) {
                weImageView.setRotation(90.0f);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f196995e;
            if (weImageView2 == null) {
                return;
            }
            weImageView2.setVisibility(0);
            return;
        }
        super.a();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f196995e;
        if (weImageView3 != null) {
            weImageView3.setRotation(270.0f);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f196995e;
        if (weImageView4 == null) {
            return;
        }
        weImageView4.setVisibility(0);
    }

    @Override // com.tencent.mm.ui.MultiTalkRoomPopupNav
    public boolean f(int i17) {
        return true;
    }

    @Override // com.tencent.mm.ui.MultiTalkRoomPopupNav
    public int getInitViewId() {
        return com.tencent.mm.R.layout.c3h;
    }

    @Override // com.tencent.mm.ui.MultiTalkRoomPopupNav
    public void j(android.widget.LinearLayout linearLayout, long j17) {
        if (linearLayout == null) {
            return;
        }
        linearLayout.getLayoutParams().width = -2;
        linearLayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = linearLayout.getMeasuredHeight();
        android.view.View view = this.f196996f;
        if (view != null) {
            view.setBackgroundResource(com.tencent.mm.R.drawable.bcg);
        }
        android.view.ViewPropertyAnimator animate = animate();
        animate.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        animate.setDuration(j17);
        animate.setUpdateListener(new com.tencent.mm.ui.lf(measuredHeight, linearLayout, 90.0f, 270.0f, this));
        animate.start();
    }

    @Override // com.tencent.mm.ui.MultiTalkRoomPopupNav
    public void k(android.widget.LinearLayout linearLayout, long j17) {
        if (linearLayout == null) {
            return;
        }
        int height = linearLayout.getHeight();
        android.view.ViewPropertyAnimator animate = animate();
        animate.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        animate.setDuration(j17);
        animate.setUpdateListener(new com.tencent.mm.ui.mf(height, 0, linearLayout, 270.0f, 90.0f, this));
        animate.setListener(new com.tencent.mm.ui.nf(linearLayout, this, animate));
        animate.start();
    }

    @Override // com.tencent.mm.ui.MultiTalkRoomPopupNav
    public void setNavBackgroundColor(int i17) {
    }

    @Override // com.tencent.mm.ui.MultiTalkRoomPopupNav
    public void setNavBackgroundResource(int i17) {
    }
}
