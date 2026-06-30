package hf2;

/* loaded from: classes10.dex */
public final class j2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.l2 f281092d;

    public j2(hf2.l2 l2Var) {
        this.f281092d = l2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerTextPanelWidget$init$4$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hf2.l2 l2Var = this.f281092d;
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = l2Var.f281107d;
        if (liveBottomSheetPanel != null) {
            com.tencent.mm.ui.widget.LiveBottomSheetPanel.b(liveBottomSheetPanel, null, 1, null);
        }
        l2Var.f281104a.m7("PanelClose");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerTextPanelWidget$init$4$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
