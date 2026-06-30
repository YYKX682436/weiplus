package com.tencent.mm.plugin.luckymoney.scaledLayout;

/* loaded from: classes15.dex */
public class d extends com.tencent.mm.plugin.luckymoney.scaledLayout.e {
    public d(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        super(layoutManager, null);
    }

    @Override // com.tencent.mm.plugin.luckymoney.scaledLayout.e
    public int a(android.view.View view) {
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f145753a.getDecoratedMeasuredHeight(view) + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // com.tencent.mm.plugin.luckymoney.scaledLayout.e
    public int b(android.view.View view) {
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f145753a.getDecoratedMeasuredWidth(view) + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // com.tencent.mm.plugin.luckymoney.scaledLayout.e
    public int c() {
        return this.f145753a.getPaddingTop();
    }

    @Override // com.tencent.mm.plugin.luckymoney.scaledLayout.e
    public int d() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f145753a;
        return (layoutManager.getHeight() - layoutManager.getPaddingTop()) - layoutManager.getPaddingBottom();
    }

    @Override // com.tencent.mm.plugin.luckymoney.scaledLayout.e
    public int e() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f145753a;
        return (layoutManager.getWidth() - layoutManager.getPaddingLeft()) - layoutManager.getPaddingRight();
    }
}
