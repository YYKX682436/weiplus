package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class vd implements db5.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.TextPreviewUI f202805a;

    public vd(com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI) {
        this.f202805a = textPreviewUI;
    }

    @Override // db5.i
    public void a(android.widget.ScrollView scrollView, int i17, int i18, int i19, int i27) {
        android.view.View view;
        boolean z17 = scrollView.getChildAt(0).getMeasuredHeight() == scrollView.getHeight() + scrollView.getScrollY();
        com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI = this.f202805a;
        if (z17) {
            textPreviewUI.f198340v = scrollView.getScrollY();
        }
        if (scrollView.getScrollY() > 0) {
            int scrollY = scrollView.getScrollY();
            int i28 = textPreviewUI.f198340v;
            if (scrollY < i28 - 10 || i28 <= 0) {
                if (textPreviewUI.f198341w) {
                    if (i27 > i18) {
                        com.tencent.mm.ui.chatting.TextPreviewUI.V6(textPreviewUI);
                    } else if (i27 < i18 && (view = textPreviewUI.F) != null) {
                        view.setAnimation(textPreviewUI.f198338t);
                        android.view.View view2 = textPreviewUI.F;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/chatting/TextPreviewUI", "hideToolsBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/ui/chatting/TextPreviewUI", "hideToolsBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    textPreviewUI.f198341w = false;
                }
                int i29 = com.tencent.mm.ui.chatting.TextPreviewUI.H;
                textPreviewUI.Y6();
                textPreviewUI.getClass();
            }
        }
        com.tencent.mm.ui.chatting.TextPreviewUI.V6(textPreviewUI);
        int i292 = com.tencent.mm.ui.chatting.TextPreviewUI.H;
        textPreviewUI.Y6();
        textPreviewUI.getClass();
    }
}
