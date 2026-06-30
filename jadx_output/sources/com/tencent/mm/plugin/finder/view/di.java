package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class di implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f131896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.ei f131897e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.rw4 f131898f;

    public di(android.view.View view, com.tencent.mm.plugin.finder.view.ei eiVar, r45.rw4 rw4Var) {
        this.f131896d = view;
        this.f131897e = eiVar;
        this.f131898f = rw4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow$initSecondPage$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f131896d;
        android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.lks);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view2.findViewById(com.tencent.mm.R.id.lkn);
        com.tencent.mm.plugin.finder.view.ei eiVar = this.f131897e;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) eiVar.f132015j;
        r45.rw4 rw4Var = this.f131898f;
        if (arrayList2.contains(rw4Var)) {
            textView.setTextColor(eiVar.f132007b.getResources().getColor(com.tencent.mm.R.color.FG_0));
            weImageView.setIconColor(eiVar.f132007b.getResources().getColor(com.tencent.mm.R.color.FG_0));
            view2.setBackgroundDrawable(eiVar.f132007b.getResources().getDrawable(com.tencent.mm.R.drawable.f481528vn));
            ((java.util.ArrayList) eiVar.f132015j).remove(rw4Var);
        } else {
            textView.setTextColor(eiVar.f132007b.getResources().getColor(com.tencent.mm.R.color.f478502m));
            weImageView.setIconColor(eiVar.f132007b.getResources().getColor(com.tencent.mm.R.color.f478502m));
            view2.setBackgroundDrawable(eiVar.f132007b.getResources().getDrawable(com.tencent.mm.R.drawable.f481529vo));
            ((java.util.ArrayList) eiVar.f132015j).add(rw4Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow$initSecondPage$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
