package db5;

/* loaded from: classes15.dex */
public class c4 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMListPopupWindow f228305d;

    public c4(com.tencent.mm.ui.base.MMListPopupWindow mMListPopupWindow, db5.w3 w3Var) {
        this.f228305d = mMListPopupWindow;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        db5.d5 d5Var;
        int action = motionEvent.getAction();
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        com.tencent.mm.ui.base.MMListPopupWindow mMListPopupWindow = this.f228305d;
        if (action == 0 && (d5Var = mMListPopupWindow.f197477g) != null && d5Var.isShowing() && x17 >= 0 && x17 < mMListPopupWindow.f197477g.getWidth() && y17 >= 0 && y17 < mMListPopupWindow.f197477g.getHeight()) {
            mMListPopupWindow.f197489s.postDelayed(mMListPopupWindow.f197471a, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        mMListPopupWindow.f197489s.removeCallbacks(mMListPopupWindow.f197471a);
        return false;
    }
}
