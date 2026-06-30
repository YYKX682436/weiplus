package db5;

/* loaded from: classes15.dex */
public class y5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMSlideDelView f228581d;

    public y5(com.tencent.mm.ui.base.MMSlideDelView mMSlideDelView) {
        this.f228581d = mMSlideDelView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.base.MMSlideDelView mMSlideDelView = this.f228581d;
        mMSlideDelView.setPressed(false);
        mMSlideDelView.f197561m.a(mMSlideDelView, mMSlideDelView.f197560i, 0);
        mMSlideDelView.c();
    }
}
