package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class xf extends yb5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.NewChattingTabUI f212553d;

    public xf(com.tencent.mm.ui.NewChattingTabUI newChattingTabUI) {
        this.f212553d = newChattingTabUI;
    }

    @Override // yb5.n
    public void a() {
        com.tencent.mm.ui.NewChattingTabUI newChattingTabUI = this.f212553d;
        if (!newChattingTabUI.f197024k) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LauncherUI.NewChattingTabUI", "start chatting but last chatting does't be close!");
            newChattingTabUI.f(false);
        }
        if (newChattingTabUI.f197014a.isFinishing() || newChattingTabUI.f197014a.isPaused() || !newChattingTabUI.f197024k || !gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LauncherUI.NewChattingTabUI", "[mStartChattingRunnable] pass! isPause:%s mChattingClosed:%s, account:%s", java.lang.Boolean.valueOf(newChattingTabUI.f197014a.isPaused()), java.lang.Boolean.valueOf(newChattingTabUI.f197024k), java.lang.Boolean.valueOf(gm0.j1.b().m()));
            newChattingTabUI.f197032s = true;
            return;
        }
        newChattingTabUI.f197024k = false;
        android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", newChattingTabUI.f197021h);
        android.os.Bundle bundle = newChattingTabUI.f197022i;
        if (bundle != null) {
            putExtra.putExtras(bundle);
        }
        putExtra.putExtra("img_gallery_enter_from_chatting_ui", true);
        com.tencent.mm.ui.NewChattingTabUI.e(newChattingTabUI, putExtra, false);
        if (newChattingTabUI.f197019f == null) {
            newChattingTabUI.f197019f = (com.tencent.mm.ui.base.OnLayoutChangedLinearLayout) newChattingTabUI.f197027n.getView().findViewById(com.tencent.mm.R.id.bkb);
        }
        com.tencent.mm.ui.base.OnLayoutChangedLinearLayout onLayoutChangedLinearLayout = newChattingTabUI.f197019f;
        if (onLayoutChangedLinearLayout != null) {
            onLayoutChangedLinearLayout.setOnChattingLayoutChangedListener(newChattingTabUI.f197034u);
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting = newChattingTabUI.f197016c;
        objArr[0] = java.lang.Boolean.valueOf(testTimeForChatting == null ? false : testTimeForChatting.isShown());
        objArr[1] = java.lang.Boolean.valueOf(newChattingTabUI.f197019f == null);
        objArr[2] = java.lang.Integer.valueOf(newChattingTabUI.f197016c.getVisibility());
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "ashutest::startChatting, ishow:%b, cfv is null:%s, visibility:%s", objArr);
        newChattingTabUI.f197016c.setVisibility(0);
        newChattingTabUI.f197016c.setTranslationX((newChattingTabUI.f197014a.getWindow().getDecorView().getWidth() == 0 ? newChattingTabUI.f197014a.getResources().getDisplayMetrics().widthPixels : newChattingTabUI.f197014a.getWindow().getDecorView().getWidth()) - 0.1f);
        com.tencent.mm.sdk.platformtools.t8.i1();
        newChattingTabUI.getClass();
        ((kn4.i0) ((pf0.u) i95.n0.c(pf0.u.class))).Ai("ChattingUI", 3);
        if (newChattingTabUI.n()) {
            al5.a3.d(newChattingTabUI.f197014a);
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|startChattingRunnable";
    }
}
