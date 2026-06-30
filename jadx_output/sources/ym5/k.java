package ym5;

/* loaded from: classes5.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.h f463411d;

    public k(ym5.h hVar) {
        this.f463411d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int bottom;
        android.graphics.Rect rect = new android.graphics.Rect();
        ym5.h hVar = this.f463411d;
        hVar.getWindowVisibleDisplayFrame(rect);
        boolean z17 = hVar.getBottom() - rect.bottom >= 300;
        hVar.getResources().getDisplayMetrics();
        if (z17) {
            bottom = (hVar.getBottom() - com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).getInt("com.tencent.mm.compatible.util.keybord.height", 0)) - ((int) hVar.getResources().getDimension(com.tencent.mm.R.dimen.f480251sk));
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseDrawingView", "[onKeyboardChanged] height:%s", java.lang.Integer.valueOf(bottom));
        } else {
            bottom = hVar.getBottom() - ((int) hVar.getResources().getDimension(com.tencent.mm.R.dimen.f480251sk));
        }
        if (hVar.f463357t.getHeight() != bottom) {
            hVar.f463357t.setHeight(bottom);
        }
        hVar.getViewTreeObserver().removeOnGlobalLayoutListener(hVar);
        hVar.getViewTreeObserver().addOnGlobalLayoutListener(hVar);
    }
}
