package com.tencent.mm.plugin.game.ui;

/* loaded from: classes.dex */
public class GameListSocialView extends android.widget.LinearLayout implements xn5.a0 {
    public GameListSocialView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public void setData(java.util.LinkedList<java.lang.String> linkedList) {
        if (linkedList == null || linkedList.size() == 0 || linkedList.size() % 2 != 0) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        if (getChildCount() < linkedList.size() / 2) {
            int size = (linkedList.size() / 2) - getChildCount();
            for (int i17 = 0; i17 < size; i17++) {
                android.view.View.inflate(getContext(), com.tencent.mm.R.layout.bgu, this);
            }
        }
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            if (i18 < linkedList.size() / 2) {
                android.view.View childAt = getChildAt(i18);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameListSocialView", "setData", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/plugin/game/ui/GameListSocialView", "setData", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View childAt2 = getChildAt(i18);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(childAt2, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/GameListSocialView", "setData", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(childAt2, "com/tencent/mm/plugin/game/ui/GameListSocialView", "setData", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        for (int i19 = 0; i19 < linkedList.size() / 2; i19++) {
            android.view.View childAt3 = getChildAt(i19);
            android.widget.TextView textView = (android.widget.TextView) childAt3.findViewById(com.tencent.mm.R.id.gox);
            android.widget.TextView textView2 = (android.widget.TextView) childAt3.findViewById(com.tencent.mm.R.id.goy);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = getContext();
            int i27 = i19 * 2;
            java.lang.String str = linkedList.get(i27);
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = getContext();
            java.lang.String str2 = linkedList.get(i27 + 1);
            float textSize2 = textView2.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context2, str2, textSize2));
        }
    }
}
