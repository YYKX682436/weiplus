package g22;

/* loaded from: classes15.dex */
public final class p implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment f267853d;

    public p(com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment) {
        this.f267853d = emojiStoreV3HomeBaseFragment;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        android.app.ProgressDialog progressDialog;
        java.lang.Integer num = (java.lang.Integer) obj;
        com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment = this.f267853d;
        java.lang.String str = emojiStoreV3HomeBaseFragment.f98412d;
        int i17 = emojiStoreV3HomeBaseFragment.n0().f267832q;
        boolean z17 = false;
        if (num != null && num.intValue() == i17) {
            i22.s m07 = this.f267853d.m0();
            com.tencent.mm.plugin.emoji.model.q qVar = this.f267853d.n0().f267823e;
            if (qVar == null) {
                m07.getClass();
            } else {
                m07.f288025r = qVar;
                java.util.ArrayList arrayList = m07.f288017g;
                arrayList.clear();
                arrayList.addAll(kz5.n0.S0(qVar.f97595a));
                m07.f288020m.clear();
                m07.notifyDataSetChanged();
            }
            com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment2 = this.f267853d;
            if (emojiStoreV3HomeBaseFragment2.f98427v) {
                emojiStoreV3HomeBaseFragment2.f98427v = false;
                ku5.u0 u0Var = ku5.t0.f312615d;
                g22.o oVar = new g22.o(this.f267853d);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(oVar, 500L, false);
                return;
            }
            return;
        }
        int i18 = this.f267853d.n0().f267833r;
        if (num != null && num.intValue() == i18) {
            com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment3 = this.f267853d;
            android.app.ProgressDialog progressDialog2 = emojiStoreV3HomeBaseFragment3.f98420o;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                z17 = true;
            }
            if (!z17 || (progressDialog = emojiStoreV3HomeBaseFragment3.f98420o) == null) {
                return;
            }
            progressDialog.dismiss();
            return;
        }
        int i19 = this.f267853d.n0().f267836u;
        if (num != null && num.intValue() == i19) {
            com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment4 = this.f267853d;
            android.view.View view = emojiStoreV3HomeBaseFragment4.f98422q;
            if (view != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showLoadingUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showLoadingUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view2 = emojiStoreV3HomeBaseFragment4.f98423r;
            if (view2 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showLoadingUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showLoadingUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = emojiStoreV3HomeBaseFragment4.f98419n;
            if (recyclerView == null) {
                return;
            }
            recyclerView.setVisibility(8);
            return;
        }
        int i27 = this.f267853d.n0().f267834s;
        if (num != null && num.intValue() == i27) {
            this.f267853d.r0();
            return;
        }
        int i28 = this.f267853d.n0().f267835t;
        if (num != null && num.intValue() == i28) {
            this.f267853d.r0();
            return;
        }
        int i29 = this.f267853d.n0().f267837v;
        if (num != null && num.intValue() == i29) {
            com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment5 = this.f267853d;
            android.view.View view3 = emojiStoreV3HomeBaseFragment5.f98422q;
            if (view3 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showContentUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showContentUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view4 = emojiStoreV3HomeBaseFragment5.f98423r;
            if (view4 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showContentUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showContentUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            androidx.recyclerview.widget.RecyclerView recyclerView2 = emojiStoreV3HomeBaseFragment5.f98419n;
            if (recyclerView2 == null) {
                return;
            }
            recyclerView2.setVisibility(0);
        }
    }
}
