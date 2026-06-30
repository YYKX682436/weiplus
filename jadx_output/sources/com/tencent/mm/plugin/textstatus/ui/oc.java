package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class oc extends com.tencent.mm.plugin.sns.ui.x6 {
    public boolean C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(android.content.Context context, zd4.o resCollector) {
        super(context, resCollector);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(resCollector, "resCollector");
    }

    @Override // com.tencent.mm.plugin.sns.ui.xk, android.widget.ExpandableListAdapter
    public int getGroupCount() {
        zd4.o oVar = this.f171535f;
        oVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHeaderGroupCount", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        int size = oVar.l().size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHeaderGroupCount", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return size;
    }

    @Override // com.tencent.mm.plugin.sns.ui.xk, android.widget.ExpandableListAdapter
    public android.view.View getGroupView(int i17, boolean z17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View groupView = super.getGroupView(i17, z17, view, viewGroup);
        java.lang.Object tag = groupView.getTag();
        com.tencent.mm.plugin.sns.ui.widget.n nVar = tag instanceof com.tencent.mm.plugin.sns.ui.widget.n ? (com.tencent.mm.plugin.sns.ui.widget.n) tag : null;
        zd4.o oVar = this.f171535f;
        int n17 = oVar.n(i17);
        if (n17 == 5 && this.C) {
            android.view.View view2 = new android.view.View(this.f171537h);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusLabelAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/textstatus/ui/TextStatusLabelAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return view2;
        }
        android.widget.TextView textView = nVar != null ? nVar.f171222a : null;
        int j17 = oVar.j(n17);
        int m17 = oVar.m(n17);
        int k17 = oVar.k(n17);
        android.view.ViewGroup.LayoutParams layoutParams = textView != null ? textView.getLayoutParams() : null;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        android.widget.ImageView imageView = nVar != null ? nVar.f171226e : null;
        if (imageView != null) {
            imageView.setVisibility(j17);
        }
        android.widget.TextView textView2 = nVar != null ? nVar.f171223b : null;
        if (textView2 != null) {
            textView2.setVisibility(m17);
        }
        groupView.setPadding(k17, groupView.getPaddingTop(), groupView.getPaddingRight(), groupView.getPaddingBottom());
        if (m17 == 8) {
            if (layoutParams2 != null) {
                layoutParams2.addRule(15, -1);
            }
            if (layoutParams2 != null) {
                layoutParams2.removeRule(10);
            }
        } else {
            if (layoutParams2 != null) {
                layoutParams2.addRule(10, -1);
            }
            if (layoutParams2 != null) {
                layoutParams2.removeRule(15);
            }
        }
        if (textView != null) {
            textView.setLayoutParams(layoutParams2);
            textView.setSingleLine();
            textView.setMaxLines(1);
            textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        }
        return groupView;
    }
}
