package db5;

/* loaded from: classes15.dex */
public class k3 extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMHorList f228420a;

    public k3(com.tencent.mm.ui.base.MMHorList mMHorList) {
        this.f228420a = mMHorList;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.tencent.mm.ui.base.MMHorList mMHorList = this.f228420a;
        mMHorList.f197436o = true;
        mMHorList.invalidate();
        mMHorList.requestLayout();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        int i17 = com.tencent.mm.ui.base.MMHorList.E;
        com.tencent.mm.ui.base.MMHorList mMHorList = this.f228420a;
        mMHorList.b();
        mMHorList.removeAllViewsInLayout();
        mMHorList.requestLayout();
        mMHorList.invalidate();
        mMHorList.requestLayout();
    }
}
