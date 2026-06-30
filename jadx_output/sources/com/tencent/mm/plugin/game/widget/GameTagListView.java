package com.tencent.mm.plugin.game.widget;

/* loaded from: classes.dex */
public class GameTagListView extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public int f141960d;

    /* renamed from: e, reason: collision with root package name */
    public int f141961e;

    public GameTagListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a(java.util.LinkedList linkedList, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        while (getChildCount() < linkedList.size()) {
            android.widget.TextView textView = new android.widget.TextView(getContext());
            textView.setBackgroundResource(com.tencent.mm.R.drawable.f481862af5);
            textView.setMaxLines(1);
            textView.setTextColor(this.f141960d);
            textView.setTextSize(0, this.f141961e);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479829ge), 0);
            textView.setLayoutParams(layoutParams);
            addView(textView);
        }
        float f17 = 0.0f;
        int i18 = 0;
        while (true) {
            if (i18 >= linkedList.size()) {
                break;
            }
            java.lang.String str = (java.lang.String) linkedList.get(i18);
            android.widget.TextView textView2 = (android.widget.TextView) getChildAt(i18);
            textView2.setVisibility(0);
            textView2.setText(str);
            f17 = f17 + textView2.getPaint().measureText(str) + textView2.getPaddingLeft() + textView2.getPaddingRight() + getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479829ge);
            if (f17 > i17) {
                textView2.setVisibility(8);
                break;
            }
            i18++;
        }
        while (i18 < getChildCount()) {
            int i19 = i18 + 1;
            android.view.View childAt = getChildAt(i18);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/game/widget/GameTagListView", "setData", "(Ljava/util/LinkedList;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(childAt, "com/tencent/mm/plugin/game/widget/GameTagListView", "setData", "(Ljava/util/LinkedList;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i18 = i19;
        }
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f141960d = getResources().getColor(com.tencent.mm.R.color.f479191sf);
        this.f141961e = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479833gi);
    }
}
