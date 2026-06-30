package ii5;

/* loaded from: classes15.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mogic.WxViewPager f291656d;

    public f(com.tencent.mm.ui.mogic.WxViewPager wxViewPager) {
        this.f291656d = wxViewPager;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.mogic.WxViewPager wxViewPager = this.f291656d;
        wxViewPager.setScrollState(0);
        wxViewPager.populate();
    }
}
