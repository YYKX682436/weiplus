package db5;

/* loaded from: classes15.dex */
public class a4 extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMListPopupWindow f228277a;

    public a4(com.tencent.mm.ui.base.MMListPopupWindow mMListPopupWindow, db5.w3 w3Var) {
        this.f228277a = mMListPopupWindow;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.tencent.mm.ui.base.MMListPopupWindow mMListPopupWindow = this.f228277a;
        if (mMListPopupWindow.f197477g.isShowing()) {
            mMListPopupWindow.d();
        }
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.f228277a.a();
    }
}
