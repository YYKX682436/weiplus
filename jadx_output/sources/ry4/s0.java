package ry4;

/* loaded from: classes.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.d1 f401677d;

    public s0(ry4.d1 d1Var) {
        this.f401677d = d1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC$setupBottomButtons$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ry4.d1 d1Var = this.f401677d;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = d1Var.f401613i;
        if (wxRecyclerView != null) {
            d1Var.f401611g = kz5.n0.S0(d1Var.f401610f);
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = d1Var.P6();
            if (P6 != null) {
                P6.setMMTitle(com.tencent.mm.R.string.f493897pk0);
            }
            androidx.appcompat.app.AppCompatActivity activity = d1Var.getActivity();
            com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
            if (mMActivity != null) {
                mMActivity.setBackBtn(new ry4.o0(d1Var), com.tencent.mm.R.raw.actionbar_icon_dark_close);
            }
            android.view.View findViewById = d1Var.getActivity().findViewById(com.tencent.mm.R.id.v4v);
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "enterEditMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "enterEditMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = d1Var.getActivity().findViewById(com.tencent.mm.R.id.v4u);
            if (findViewById2 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "enterEditMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "enterEditMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            d1Var.Y6(0);
            ry4.g gVar = d1Var.f401609e;
            if (gVar != null) {
                gVar.f401629m = true;
                gVar.f401630n.clear();
                int childCount = wxRecyclerView.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    android.view.View childAt = wxRecyclerView.getChildAt(i17);
                    if (childAt != null) {
                        childAt.setTag(com.tencent.mm.R.id.v59, "PAYLOAD_ENTER_EDIT");
                    }
                }
                int size = gVar.f401623d.size();
                for (int i18 = 0; i18 < size; i18++) {
                    gVar.notifyItemChanged(i18, "PAYLOAD_ENTER_EDIT");
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC$setupBottomButtons$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
