package pp3;

/* loaded from: classes5.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp3.l f357487d;

    public k(pp3.l lVar) {
        this.f357487d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        pp3.l lVar = this.f357487d;
        if (lVar.f357489e.isShowing()) {
            lVar.f357488d.getLocationInWindow(lVar.f357489e.f152905j);
            com.tencent.mm.plugin.patmsg.ui.PatPopupWindow patPopupWindow = lVar.f357489e;
            int[] iArr = patPopupWindow.f152905j;
            patPopupWindow.f152901f = iArr[0];
            patPopupWindow.f152902g = (iArr[1] - patPopupWindow.f152896a.getMeasuredHeight()) + com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479738dv);
            com.tencent.mm.plugin.patmsg.ui.PatPopupWindow patPopupWindow2 = lVar.f357489e;
            int i17 = patPopupWindow2.f152902g - patPopupWindow2.f152903h;
            if (java.lang.Math.abs(i17) > 100) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PatPopupWindow", "update location  yDiff:%s", java.lang.Integer.valueOf(i17));
                com.tencent.mm.plugin.patmsg.ui.PatPopupWindow patPopupWindow3 = lVar.f357489e;
                int i18 = patPopupWindow3.f152901f;
                patPopupWindow3.update(i18 >= 100 ? i18 : 0, patPopupWindow3.f152902g, -1, -1);
            }
            com.tencent.mm.plugin.patmsg.ui.PatPopupWindow patPopupWindow4 = lVar.f357489e;
            patPopupWindow4.f152903h = patPopupWindow4.f152902g;
        }
    }
}
