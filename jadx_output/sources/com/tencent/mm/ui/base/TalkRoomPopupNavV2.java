package com.tencent.mm.ui.base;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/ui/base/TalkRoomPopupNavV2;", "Lcom/tencent/mm/ui/base/TalkRoomPopupNav;", "", "getInitViewLayout", "", "rotation", "Ljz5/f0;", "setArrowRotation", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class TalkRoomPopupNavV2 extends com.tencent.mm.ui.base.TalkRoomPopupNav {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TalkRoomPopupNavV2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.ui.base.TalkRoomPopupNav
    public void f(long j17) {
        this.f197690g.getLayoutParams().width = -2;
        this.f197690g.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.f197690g.getMeasuredHeight();
        android.widget.LinearLayout linearLayout = this.f197689f;
        if (linearLayout != null) {
            linearLayout.setBackgroundResource(com.tencent.mm.R.drawable.bcg);
        }
        android.view.ViewPropertyAnimator animate = animate();
        animate.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        animate.setDuration(j17);
        animate.setUpdateListener(new db5.j9(measuredHeight, this, 90.0f, 270.0f));
        animate.start();
    }

    @Override // com.tencent.mm.ui.base.TalkRoomPopupNav
    public void g(long j17) {
        int height = this.f197690g.getHeight();
        android.view.ViewPropertyAnimator animate = animate();
        animate.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        animate.setDuration(j17);
        animate.setUpdateListener(new db5.k9(height, 0, this, 270.0f, 90.0f));
        animate.setListener(new db5.l9(this, animate));
        animate.start();
    }

    @Override // com.tencent.mm.ui.base.TalkRoomPopupNav
    public int getInitViewLayout() {
        return com.tencent.mm.R.layout.cxr;
    }

    @Override // com.tencent.mm.ui.base.TalkRoomPopupNav
    public void h() {
    }

    public final void setArrowRotation(float f17) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f197700t;
        if (weImageView == null) {
            return;
        }
        weImageView.setRotation(f17);
    }
}
