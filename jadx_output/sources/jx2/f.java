package jx2;

/* loaded from: classes3.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jx2.h f302413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f302414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jx2.a f302415f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f302416g;

    public f(jx2.h hVar, android.view.View view, jx2.a aVar, boolean z17, android.content.Context context) {
        this.f302413d = hVar;
        this.f302414e = view;
        this.f302415f = aVar;
        this.f302416g = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController$showSecondPage$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jx2.h hVar = this.f302413d;
        hVar.getClass();
        android.view.View view2 = this.f302414e;
        int i17 = com.tencent.mm.R.id.lks;
        android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.lks);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view2.findViewById(com.tencent.mm.R.id.lkn);
        java.util.List list = hVar.f302429j;
        com.tencent.mm.ui.base.FlowLayout flowLayout = hVar.f302425f;
        android.content.Context context = this.f302416g;
        if (flowLayout != null) {
            int childCount = flowLayout.getChildCount();
            int i18 = 0;
            while (i18 < childCount) {
                android.view.View childAt = flowLayout.getChildAt(i18);
                if (childAt != null) {
                    android.widget.TextView textView2 = (android.widget.TextView) childAt.findViewById(i17);
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) childAt.findViewById(com.tencent.mm.R.id.lkn);
                    if (textView2 != null) {
                        textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
                    }
                    if (weImageView2 != null) {
                        weImageView2.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
                    }
                    childAt.setBackgroundDrawable(context.getResources().getDrawable(com.tencent.mm.R.drawable.f481528vn));
                }
                i18++;
                i17 = com.tencent.mm.R.id.lks;
            }
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
        jx2.a aVar = this.f302415f;
        if (arrayList2.contains(aVar)) {
            arrayList2.clear();
        } else {
            arrayList2.clear();
            arrayList2.add(aVar);
            if (textView != null) {
                textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478502m));
            }
            if (weImageView != null) {
                weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f478502m));
            }
            view2.setBackgroundDrawable(context.getResources().getDrawable(com.tencent.mm.R.drawable.f481529vo));
        }
        hVar.c(context);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController$showSecondPage$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
