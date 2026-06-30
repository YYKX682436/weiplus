package sr2;

/* loaded from: classes10.dex */
public final class a0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.w0 f411508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.p6 f411509e;

    public a0(sr2.w0 w0Var, so2.p6 p6Var) {
        this.f411508d = w0Var;
        this.f411509e = p6Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        sr2.w0 w0Var = this.f411508d;
        w0Var.getClass();
        so2.p6 p6Var = so2.p6.f410542e;
        boolean z17 = false;
        so2.p6 textType = this.f411509e;
        boolean z18 = textType == p6Var && w0Var.S6(w0Var.G, w0Var.H) != null;
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf == null || valueOf.intValue() != 0) {
            if (valueOf != null && valueOf.intValue() == 1) {
                so2.m mVar = z18 ? so2.m.f410476e : so2.m.f410475d;
                com.tencent.mm.plugin.finder.view.FinderPostTextModifyView finderPostTextModifyView = w0Var.I;
                if (finderPostTextModifyView != null) {
                    java.lang.String text = w0Var.F;
                    int i18 = w0Var.G;
                    int i19 = w0Var.H;
                    kotlin.jvm.internal.o.g(text, "text");
                    kotlin.jvm.internal.o.g(textType, "textType");
                    finderPostTextModifyView.f131428s = textType;
                    if (!finderPostTextModifyView.g(i18, i19, textType)) {
                        finderPostTextModifyView.j(text, i18, i19);
                        java.lang.String str = finderPostTextModifyView.f131425p;
                        finderPostTextModifyView.p(str, str, finderPostTextModifyView.f131428s, false);
                        int length = str.length() - finderPostTextModifyView.f131425p.length();
                        finderPostTextModifyView.o(length, finderPostTextModifyView.f131426q);
                        finderPostTextModifyView.q(new so2.n6(finderPostTextModifyView.f131425p, str, finderPostTextModifyView.f131426q, finderPostTextModifyView.f131427r + length, finderPostTextModifyView.f131428s, so2.a.f410242f, mVar, 0, null, 0L, ce1.h.CTRL_INDEX, null));
                        finderPostTextModifyView.n();
                        finderPostTextModifyView.k();
                        com.tencent.mm.plugin.finder.view.pp ppVar = finderPostTextModifyView.f131433x;
                        if (ppVar != null) {
                            ((sr2.w0) ppVar).n7(finderPostTextModifyView.f131425p, str, finderPostTextModifyView.f131426q, finderPostTextModifyView.f131427r, finderPostTextModifyView.f131428s, false, true);
                        }
                    }
                }
                w0Var.R6(textType == p6Var ? w0Var.L : w0Var.M);
                return;
            }
            return;
        }
        if (z18) {
            com.tencent.mm.plugin.finder.view.FinderPostTextModifyView finderPostTextModifyView2 = w0Var.I;
            if (finderPostTextModifyView2 != null && finderPostTextModifyView2.b(w0Var.F, w0Var.G, w0Var.H, textType)) {
                z17 = true;
            }
            if (z17) {
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                androidx.appcompat.app.AppCompatActivity activity = w0Var.getActivity();
                kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((c61.l7) b6Var).Lk((com.tencent.mm.ui.MMActivity) activity, 20001, null, 1);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.finder.view.FinderPostTextModifyView finderPostTextModifyView3 = w0Var.I;
        if (finderPostTextModifyView3 != null) {
            java.lang.String text2 = w0Var.F;
            int i27 = w0Var.G;
            int i28 = w0Var.H;
            kotlin.jvm.internal.o.g(text2, "text");
            kotlin.jvm.internal.o.g(textType, "textType");
            finderPostTextModifyView3.f131428s = textType;
            if (!finderPostTextModifyView3.g(i27, i28, textType)) {
                finderPostTextModifyView3.j(text2, i27, i28);
                finderPostTextModifyView3.f131417e.setVisibility(8);
                android.view.View view = finderPostTextModifyView3.f131420h;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderPostTextModifyView", "showModify", "(Ljava/lang/String;IILcom/tencent/mm/plugin/finder/model/TextType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/view/FinderPostTextModifyView", "showModify", "(Ljava/lang/String;IILcom/tencent/mm/plugin/finder/model/TextType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                androidx.recyclerview.widget.RecyclerView recyclerView = finderPostTextModifyView3.f131424o;
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                }
                finderPostTextModifyView3.f131422m.setText(finderPostTextModifyView3.getContext().getResources().getString(com.tencent.mm.R.string.nz7, finderPostTextModifyView3.f131425p));
                finderPostTextModifyView3.f131421i.requestFocus();
                com.tencent.mm.plugin.finder.view.pp ppVar2 = finderPostTextModifyView3.f131433x;
                if (ppVar2 != null) {
                    ((sr2.w0) ppVar2).P6();
                }
            }
        }
        androidx.appcompat.app.AppCompatActivity activity2 = w0Var.getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity2).showVKB();
    }
}
