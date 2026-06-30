package db5;

/* loaded from: classes15.dex */
public class j3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMHorList f228408d;

    public j3(com.tencent.mm.ui.base.MMHorList mMHorList) {
        this.f228408d = mMHorList;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f228408d.requestLayout();
    }
}
