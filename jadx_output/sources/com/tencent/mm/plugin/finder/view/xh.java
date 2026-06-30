package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class xh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f133329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.ei f133330e;

    public xh(android.view.View view, com.tencent.mm.plugin.finder.view.ei eiVar) {
        this.f133329d = view;
        this.f133330e = eiVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow$initFirstPage$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.TextView textView = (android.widget.TextView) this.f133329d.findViewById(com.tencent.mm.R.id.lks);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f133329d.findViewById(com.tencent.mm.R.id.lkn);
        textView.setTextColor(this.f133330e.f132007b.getResources().getColor(com.tencent.mm.R.color.f478502m));
        weImageView.setIconColor(this.f133330e.f132007b.getResources().getColor(com.tencent.mm.R.color.f478502m));
        this.f133329d.setBackgroundDrawable(this.f133330e.f132007b.getResources().getDrawable(com.tencent.mm.R.drawable.f481529vo));
        com.tencent.mm.plugin.finder.view.ei eiVar = this.f133330e;
        long j17 = eiVar.f132008c;
        java.lang.String str = eiVar.f132009d;
        android.content.Context context = eiVar.f132007b;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        new db2.j0(j17, str, "", 9, 1, nyVar != null ? nyVar.V6() : null, java.lang.Boolean.FALSE, null).l();
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.finder.view.wh whVar = new com.tencent.mm.plugin.finder.view.wh(this.f133330e);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(whVar, 200L, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow$initFirstPage$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
