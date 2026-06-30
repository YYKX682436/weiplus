package com.tencent.mm.ui.conversation;

/* loaded from: classes4.dex */
public class EnterpriseFullHeightListView extends android.widget.ListView {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f207364d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f207365e;

    /* renamed from: f, reason: collision with root package name */
    public int f207366f;

    public EnterpriseFullHeightListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f207364d = true;
        this.f207366f = 0;
    }

    public final void b(int i17, int i18) {
        if (this.f207364d) {
            return;
        }
        int count = getAdapter().getCount();
        if (this.f207365e != null) {
            count--;
        }
        int i19 = 0;
        for (int headerViewsCount = getHeaderViewsCount(); headerViewsCount < count; headerViewsCount++) {
            if (this.f207366f <= 0) {
                try {
                    android.view.View view = getAdapter().getView(headerViewsCount, null, this);
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                    this.f207366f = view.getMeasuredHeight();
                } catch (java.lang.Exception unused) {
                    continue;
                }
            }
            i19 += this.f207366f;
            if (i19 > i18) {
                android.view.View view2 = this.f207365e;
                if (view2 != null) {
                    removeFooterView(view2);
                    this.f207365e = null;
                    return;
                }
                return;
            }
        }
        if (i19 < i18) {
            if (this.f207365e == null) {
                this.f207365e = new android.view.View(getContext());
            }
            removeFooterView(this.f207365e);
            this.f207365e.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, i18 - i19));
            addFooterView(this.f207365e, null, false);
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        if (this.f207364d) {
            return;
        }
        try {
            b(i17, i18);
        } catch (java.lang.Exception unused) {
        }
    }

    public EnterpriseFullHeightListView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f207364d = true;
        this.f207366f = 0;
    }
}
