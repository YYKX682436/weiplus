package db5;

/* loaded from: classes15.dex */
public class z3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMListPopupWindow f228592d;

    public z3(com.tencent.mm.ui.base.MMListPopupWindow mMListPopupWindow, db5.w3 w3Var) {
        this.f228592d = mMListPopupWindow;
    }

    @Override // java.lang.Runnable
    public void run() {
        db5.y3 y3Var = this.f228592d.f197479i;
        if (y3Var != null) {
            y3Var.f228579d = true;
            y3Var.requestLayout();
        }
    }
}
