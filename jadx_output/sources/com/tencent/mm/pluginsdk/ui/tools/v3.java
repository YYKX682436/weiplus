package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes9.dex */
public interface v3 {
    android.view.View C(int i17, int i18);

    android.view.View F(int i17);

    void addFooterView(android.view.View view);

    void addHeaderView(android.view.View view);

    void addOnLayoutChangeListener(android.view.View.OnLayoutChangeListener onLayoutChangeListener);

    android.view.ViewGroup f();

    int getBottom();

    android.view.View getChildAt(int i17);

    int getChildCount();

    android.content.Context getContext();

    int getCount();

    int getFirstCompletelyVisiblePosition();

    int getFirstVisiblePosition();

    int getFooterViewsCount();

    int getHeaderViewsCount();

    int getHeight();

    int getLastVisiblePosition();

    boolean getLocalVisibleRect(android.graphics.Rect rect);

    int getPaddingBottom();

    int getPaddingTop();

    int getPositionForView(android.view.View view);

    int getVisibility();

    void i(androidx.recyclerview.widget.w2 w2Var);

    void k(com.tencent.mm.pluginsdk.ui.tools.u3 u3Var);

    boolean post(java.lang.Runnable runnable);

    boolean postDelayed(java.lang.Runnable runnable, long j17);

    void postInvalidate();

    android.view.View q(int i17);

    boolean removeFooterView(android.view.View view);

    boolean removeHeaderView(android.view.View view);

    void removeOnLayoutChangeListener(android.view.View.OnLayoutChangeListener onLayoutChangeListener);

    com.tencent.mm.pluginsdk.ui.tools.u3 s();

    void setBackgroundDrawable(android.graphics.drawable.Drawable drawable);

    void setCacheColorHint(int i17);

    void setClipToPadding(boolean z17);

    void setDivider(android.graphics.drawable.Drawable drawable);

    void setFocusable(boolean z17);

    void setFocusableInTouchMode(boolean z17);

    void setId(int i17);

    void setItemChecked(int i17, boolean z17);

    void setKeepScreenOn(boolean z17);

    void setOnDragListener(android.view.View.OnDragListener onDragListener);

    void setOnScrollListener(android.widget.AbsListView.OnScrollListener onScrollListener);

    void setOnTouchListener(android.view.View.OnTouchListener onTouchListener);

    void setOverScrollMode(int i17);

    void setPadding(int i17, int i18, int i19, int i27);

    void setScrollBarStyle(int i17);

    void setSelection(int i17);

    void setSelectionFromTop(int i17, int i18);

    void setSelector(int i17);

    void setTranscriptMode(int i17);

    void setVisibility(int i17);

    void smoothScrollBy(int i17, int i18);

    void smoothScrollToPositionFromTop(int i17, int i18, int i19);

    int x(int i17, int i18);
}
