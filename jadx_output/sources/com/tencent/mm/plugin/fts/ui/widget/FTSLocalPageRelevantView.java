package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes.dex */
public class FTSLocalPageRelevantView extends android.widget.LinearLayout implements android.view.View.OnClickListener {
    public FTSLocalPageRelevantView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public java.lang.String getQuery() {
        return "";
    }

    public java.lang.String getSearchId() {
        return "";
    }

    public java.lang.String getWordList() {
        return new java.lang.StringBuilder("").toString();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/widget/FTSLocalPageRelevantView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/widget/FTSLocalPageRelevantView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void setOnRelevantClickListener(com.tencent.mm.plugin.fts.ui.widget.n0 n0Var) {
    }

    public FTSLocalPageRelevantView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
