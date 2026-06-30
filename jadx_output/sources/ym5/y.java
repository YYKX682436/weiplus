package ym5;

/* loaded from: classes15.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.EmojiPanelSlideIndicatorView f463574d;

    public y(com.tencent.mm.view.EmojiPanelSlideIndicatorView emojiPanelSlideIndicatorView) {
        this.f463574d = emojiPanelSlideIndicatorView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/EmojiPanelSlideIndicatorView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ym5.f0 controller = this.f463574d.getController();
        if (controller != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPanelDragIndicator", "onClicked");
            if (controller.f463285k) {
                com.tencent.mars.xlog.Log.e("MicroMsg.EmojiPanelDragIndicator", "has reset");
            } else {
                com.tencent.mm.pluginsdk.ui.g1 g1Var = controller.f463278d;
                if (g1Var != null) {
                    g1Var.d();
                }
                com.tencent.mm.autogen.mmdata.rpt.EmoticonBoardExpandStruct emoticonBoardExpandStruct = new com.tencent.mm.autogen.mmdata.rpt.EmoticonBoardExpandStruct();
                emoticonBoardExpandStruct.f56005d = java.lang.System.currentTimeMillis();
                if (controller.f463293s == 0) {
                    controller.f(controller.f463290p, 500);
                    emoticonBoardExpandStruct.f56006e = 1L;
                } else {
                    controller.f(0, 500);
                    emoticonBoardExpandStruct.f56006e = 2L;
                }
                emoticonBoardExpandStruct.f56007f = (controller.f463294t != null ? r1.f339043a : 0) + 1;
                emoticonBoardExpandStruct.k();
                com.tencent.mm.pluginsdk.ui.g1 g1Var2 = controller.f463278d;
                if (g1Var2 != null) {
                    g1Var2.f(controller.f463293s == controller.f463290p);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/view/EmojiPanelSlideIndicatorView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
