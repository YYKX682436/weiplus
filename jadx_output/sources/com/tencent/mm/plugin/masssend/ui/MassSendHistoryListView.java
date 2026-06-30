package com.tencent.mm.plugin.masssend.ui;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB%\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/masssend/ui/MassSendHistoryListView;", "Landroid/widget/ListView;", "", ya.b.INDEX, "Ljz5/f0;", "setHighLightChildNew", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MassSendHistoryListView extends android.widget.ListView {
    public MassSendHistoryListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void setHighLightChildNew(int i17) {
        android.animation.PropertyValuesHolder ofFloat;
        int max = java.lang.Math.max(0, i17);
        android.view.View childAt = getChildAt(max);
        com.tencent.mm.plugin.masssend.ui.MassMaskAnimLinearLayout massMaskAnimLinearLayout = null;
        android.view.View findViewById = childAt != null ? childAt.findViewById(com.tencent.mm.R.id.jci) : null;
        com.tencent.mm.plugin.masssend.ui.MassMaskAnimLinearLayout massMaskAnimLinearLayout2 = findViewById instanceof com.tencent.mm.plugin.masssend.ui.MassMaskAnimLinearLayout ? (com.tencent.mm.plugin.masssend.ui.MassMaskAnimLinearLayout) findViewById : null;
        if (massMaskAnimLinearLayout2 == null) {
            com.tencent.mars.xlog.Log.e("ChattingListView", "null == view index:%s", java.lang.Integer.valueOf(max));
        } else {
            massMaskAnimLinearLayout = massMaskAnimLinearLayout2;
        }
        if (massMaskAnimLinearLayout == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MassSendHistoryListView", "null == view index:%s", java.lang.Integer.valueOf(max));
            return;
        }
        massMaskAnimLinearLayout.clearAnimation();
        boolean C = com.tencent.mm.ui.bk.C();
        android.graphics.Paint paint = massMaskAnimLinearLayout.f148524f;
        if (C) {
            paint.setColor(massMaskAnimLinearLayout.getResources().getColor(com.tencent.mm.R.color.f478553an));
        } else {
            paint.setColor(massMaskAnimLinearLayout.getResources().getColor(com.tencent.mm.R.color.f478712f3));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MaskAnimView", "[setHighLightChild]view rect:%s", new android.graphics.Rect(massMaskAnimLinearLayout.getLeft(), massMaskAnimLinearLayout.getTop(), massMaskAnimLinearLayout.getRight(), massMaskAnimLinearLayout.getBottom()));
        if (com.tencent.mm.ui.bk.C()) {
            ofFloat = android.animation.PropertyValuesHolder.ofFloat("alpha", 0.0f, 0.08f, 0.08f, 0.08f, 0.08f, 0.08f, 0.0f);
            kotlin.jvm.internal.o.d(ofFloat);
        } else {
            ofFloat = android.animation.PropertyValuesHolder.ofFloat("alpha", 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.0f);
            kotlin.jvm.internal.o.d(ofFloat);
        }
        android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(ofFloat);
        massMaskAnimLinearLayout.clearAnimation();
        ofPropertyValuesHolder.addUpdateListener(new kf3.g(massMaskAnimLinearLayout, massMaskAnimLinearLayout));
        ofPropertyValuesHolder.addListener(new kf3.h(massMaskAnimLinearLayout));
        ofPropertyValuesHolder.setDuration(1150L);
        ofPropertyValuesHolder.start();
    }

    public MassSendHistoryListView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
