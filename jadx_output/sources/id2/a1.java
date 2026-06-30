package id2;

/* loaded from: classes3.dex */
public final class a1 implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f290475d;

    public a1(id2.v1 v1Var) {
        this.f290475d = v1Var;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public final void w2(int i17, boolean z17) {
        id2.v1 v1Var = this.f290475d;
        com.tencent.mars.xlog.Log.i(v1Var.f290834d, "onKeyboardHeightChanged, height:" + i17 + ", isResized:" + z17);
        dl2.f0 f0Var = (dl2.f0) ((jz5.n) v1Var.f290850w).getValue();
        if (((com.tencent.mm.ui.widget.LiveBottomSheetPanel) ((jz5.n) f0Var.f235199c).getValue()).isShowing) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(f0Var.f235218v);
            int intValue = valueOf.intValue();
            if (!(intValue >= 0 && intValue < ((dl2.p) ((jz5.n) f0Var.f235204h).getValue()).getItemCount())) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue2 = valueOf.intValue();
                jz5.g gVar = f0Var.f235203g;
                android.view.ViewGroup.LayoutParams layoutParams = ((com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar).getValue()).getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    com.tencent.mars.xlog.Log.i(f0Var.f235198b, "[onKeyBoardChange], height = " + i17 + ", pos = " + intValue2);
                    layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, i17);
                    ((com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar).getValue()).setLayoutParams(layoutParams2);
                    if (i17 > 0) {
                        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar).getValue();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(java.lang.Integer.valueOf(intValue2));
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(wxRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView", "onKeyBoardChange", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                        wxRecyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(wxRecyclerView, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView", "onKeyBoardChange", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                    }
                }
            }
        }
    }
}
