package com.tencent.mm.plugin.game.media;

/* loaded from: classes3.dex */
public class GameVideoTagContainer extends android.widget.LinearLayout {
    public GameVideoTagContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    public void setData(java.util.LinkedList<p33.c0> linkedList) {
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        while (getChildCount() < linkedList.size()) {
            android.widget.ImageView imageView = new android.widget.ImageView(getContext());
            imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams.height = com.tencent.mm.ui.zk.a(getContext(), 14);
            layoutParams.rightMargin = com.tencent.mm.ui.zk.a(getContext(), 4);
            imageView.setLayoutParams(layoutParams);
            addView(imageView);
        }
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            android.view.View childAt = getChildAt(i17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/game/media/GameVideoTagContainer", "setData", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(childAt, "com/tencent/mm/plugin/game/media/GameVideoTagContainer", "setData", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        for (int i18 = 0; i18 < linkedList.size(); i18++) {
            p33.c0 c0Var = linkedList.get(i18);
            android.widget.ImageView imageView2 = (android.widget.ImageView) getChildAt(i18);
            ((android.widget.LinearLayout.LayoutParams) imageView2.getLayoutParams()).width = com.tencent.mm.ui.zk.a(getContext(), c0Var.f351525f);
            n11.a.b().g(c0Var.f351524e, imageView2);
            imageView2.setVisibility(0);
        }
    }

    public GameVideoTagContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
