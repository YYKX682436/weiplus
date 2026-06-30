package in4;

/* loaded from: classes8.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in4.c0 f292948d;

    public b0(in4.c0 c0Var) {
        this.f292948d = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        in4.c0 c0Var = this.f292948d;
        if (c0Var.f292952e.isShowing()) {
            c0Var.f292951d.getLocationInWindow(c0Var.f292952e.f175278j);
            com.tencent.mm.plugin.topstory.ui.widget.TopStoryTipsPopupWindow topStoryTipsPopupWindow = c0Var.f292952e;
            int[] iArr = topStoryTipsPopupWindow.f175278j;
            topStoryTipsPopupWindow.f175274f = iArr[0];
            topStoryTipsPopupWindow.f175275g = (iArr[1] - topStoryTipsPopupWindow.f175269a.getMeasuredHeight()) + com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479738dv);
            com.tencent.mm.plugin.topstory.ui.widget.TopStoryTipsPopupWindow topStoryTipsPopupWindow2 = c0Var.f292952e;
            int i17 = topStoryTipsPopupWindow2.f175275g - topStoryTipsPopupWindow2.f175276h;
            if (java.lang.Math.abs(i17) > 100) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PatPopupWindow", "update location  yDiff:%s", java.lang.Integer.valueOf(i17));
                com.tencent.mm.plugin.topstory.ui.widget.TopStoryTipsPopupWindow topStoryTipsPopupWindow3 = c0Var.f292952e;
                int i18 = topStoryTipsPopupWindow3.f175274f;
                topStoryTipsPopupWindow3.update(i18 >= 100 ? i18 : 0, topStoryTipsPopupWindow3.f175275g, -1, -1);
            }
            com.tencent.mm.plugin.topstory.ui.widget.TopStoryTipsPopupWindow topStoryTipsPopupWindow4 = c0Var.f292952e;
            topStoryTipsPopupWindow4.f175276h = topStoryTipsPopupWindow4.f175275g;
        }
    }
}
