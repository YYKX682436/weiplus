package db5;

/* loaded from: classes15.dex */
public class d4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMListPopupWindow f228317d;

    public d4(com.tencent.mm.ui.base.MMListPopupWindow mMListPopupWindow, db5.w3 w3Var) {
        this.f228317d = mMListPopupWindow;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.base.MMListPopupWindow mMListPopupWindow = this.f228317d;
        db5.y3 y3Var = mMListPopupWindow.f197479i;
        if (y3Var == null || y3Var.getCount() <= mMListPopupWindow.f197479i.getChildCount() || mMListPopupWindow.f197479i.getChildCount() > mMListPopupWindow.f197475e) {
            return;
        }
        mMListPopupWindow.f197477g.setInputMethodMode(2);
        mMListPopupWindow.d();
    }
}
