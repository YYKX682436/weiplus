package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class ph implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderPostTextModifyView f132839d;

    public ph(com.tencent.mm.plugin.finder.view.FinderPostTextModifyView finderPostTextModifyView) {
        this.f132839d = finderPostTextModifyView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderPostTextModifyView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.FinderPostTextModifyView finderPostTextModifyView = this.f132839d;
        if (!finderPostTextModifyView.f131429t.isEmpty()) {
            finderPostTextModifyView.k();
        } else {
            finderPostTextModifyView.l();
        }
        com.tencent.mm.plugin.finder.view.pp ppVar = finderPostTextModifyView.f131433x;
        if (ppVar != null) {
            sr2.w0 w0Var = (sr2.w0) ppVar;
            androidx.appcompat.app.AppCompatActivity activity = w0Var.getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) activity).hideVKB();
            w0Var.R6(w0Var.L);
            w0Var.R6(w0Var.M);
        }
        finderPostTextModifyView.f131421i.setText((java.lang.CharSequence) null);
        if (finderPostTextModifyView.f131428s == so2.p6.f410542e) {
            finderPostTextModifyView.f131431v += 0;
        } else {
            finderPostTextModifyView.f131432w += 0;
        }
        com.tencent.mm.plugin.finder.view.pp ppVar2 = finderPostTextModifyView.f131433x;
        if (ppVar2 != null) {
            ((sr2.w0) ppVar2).P6();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderPostTextModifyView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
