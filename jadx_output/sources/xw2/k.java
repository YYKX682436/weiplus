package xw2;

/* loaded from: classes2.dex */
public final class k implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f457702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f457703e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xw2.s f457704f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f457705g;

    public k(int i17, int i18, xw2.s sVar, android.view.View view) {
        this.f457702d = i17;
        this.f457703e = i18;
        this.f457704f = sVar;
        this.f457705g = view;
    }

    @Override // kotlinx.coroutines.flow.k
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.util.Objects.toString(obj);
        xw2.u viewModel = this.f457704f.getViewModel();
        android.view.View slot = this.f457705g;
        kotlin.jvm.internal.o.f(slot, "$slot");
        com.tencent.mm.plugin.finder.viewmodel.component.h00 h00Var = (com.tencent.mm.plugin.finder.viewmodel.component.h00) viewModel;
        h00Var.getClass();
        com.tencent.mm.plugin.finder.viewmodel.component.lz lzVar = (com.tencent.mm.plugin.finder.viewmodel.component.lz) obj;
        android.widget.ImageView imageView = (android.widget.ImageView) slot.findViewById(com.tencent.mm.R.id.a9m);
        android.widget.TextView textView = (android.widget.TextView) slot.findViewById(com.tencent.mm.R.id.kbf);
        android.view.View findViewById = slot.findViewById(com.tencent.mm.R.id.d2f);
        if (lzVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FollowFreqReport] attach_avatar_personal_center view_id=person_center_frequently_read position=");
            int i17 = this.f457702d;
            sb6.append(i17);
            sb6.append(" positionInGroup=");
            int i18 = this.f457703e;
            sb6.append(i18);
            sb6.append(" avatar_finder_username=");
            sb6.append(lzVar.f135100d);
            com.tencent.mars.xlog.Log.i("Finder.SelfOftenReadAuthorUIC", sb6.toString());
            hc2.v0.e(slot, "person_center_frequently_read", 40, 0, false, false, null, new com.tencent.mm.plugin.finder.viewmodel.component.vz(h00Var, lzVar, i17, i18), 60, null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(slot, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC", "onItemBind", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC$AuthorItem;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            slot.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(slot, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC", "onItemBind", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC$AuthorItem;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mn2.g1 g1Var = mn2.g1.f329975a;
            vo0.d a17 = g1Var.a();
            java.lang.String str = lzVar.f135098b;
            if (str == null) {
                str = "";
            }
            mn2.n nVar = new mn2.n(str, com.tencent.mm.plugin.finder.storage.y90.V);
            kotlin.jvm.internal.o.d(imageView);
            a17.c(nVar, imageView, g1Var.h(mn2.f1.f329957h));
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            androidx.appcompat.app.AppCompatActivity activity = h00Var.getActivity();
            java.lang.String str2 = lzVar.f135097a;
            if (str2 == null) {
                str2 = "";
            }
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(activity, str2));
            int i19 = lzVar.f135099c ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC", "onItemBind", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC$AuthorItem;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC", "onItemBind", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC$AuthorItem;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(slot, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC", "onItemBind", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC$AuthorItem;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            slot.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(slot, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC", "onItemBind", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC$AuthorItem;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setText("");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC", "onItemBind", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC$AuthorItem;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC", "onItemBind", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC$AuthorItem;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
