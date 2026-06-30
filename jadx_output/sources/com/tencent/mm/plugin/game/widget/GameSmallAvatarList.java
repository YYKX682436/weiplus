package com.tencent.mm.plugin.game.widget;

/* loaded from: classes5.dex */
public class GameSmallAvatarList extends android.widget.LinearLayout {
    public GameSmallAvatarList(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setData(java.util.LinkedList<java.lang.String> linkedList) {
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        while (getChildCount() < linkedList.size()) {
            android.widget.ImageView imageView = new android.widget.ImageView(getContext());
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479835gk), getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479835gk));
            layoutParams.setMargins(0, 0, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479829ge), 0);
            imageView.setLayoutParams(layoutParams);
            imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            addView(imageView);
        }
        int i17 = 0;
        while (i17 < linkedList.size()) {
            r53.v vVar = new r53.v();
            vVar.f392705c = true;
            r53.y.a().e((android.widget.ImageView) getChildAt(i17), linkedList.get(i17), vVar.a(), null);
            android.view.View childAt = getChildAt(i17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/game/widget/GameSmallAvatarList", "setData", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(childAt, "com/tencent/mm/plugin/game/widget/GameSmallAvatarList", "setData", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i17++;
        }
        while (i17 < getChildCount()) {
            int i18 = i17 + 1;
            android.view.View childAt2 = getChildAt(i17);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(childAt2, arrayList2.toArray(), "com/tencent/mm/plugin/game/widget/GameSmallAvatarList", "setData", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(childAt2, "com/tencent/mm/plugin/game/widget/GameSmallAvatarList", "setData", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i17 = i18;
        }
    }
}
