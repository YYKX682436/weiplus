package vh5;

/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.base.MMViewPager f437224a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.media.view.gesture.XGestureInterceptorView f437225b;

    /* renamed from: c, reason: collision with root package name */
    public vh5.s f437226c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f437227d;

    public k(com.tencent.mm.ui.base.MMViewPager viewPager, com.tencent.mm.plugin.media.view.gesture.XGestureInterceptorView interceptorView) {
        kotlin.jvm.internal.o.g(viewPager, "viewPager");
        kotlin.jvm.internal.o.g(interceptorView, "interceptorView");
        this.f437224a = viewPager;
        this.f437225b = interceptorView;
        interceptorView.a();
    }

    public final void a(int i17) {
        vh5.s sVar = this.f437226c;
        vh5.q a17 = sVar != null ? sVar.a(i17) : null;
        com.tencent.mm.ui.base.MMViewPager mMViewPager = this.f437224a;
        if (a17 == null) {
            com.tencent.mars.xlog.Log.i("MediaGallery.ChatXGestureAdapter", "ChatXGestureAdapter disabled in position " + mMViewPager.getCurrentItem());
            b(false);
            return;
        }
        com.tencent.mars.xlog.Log.i("MediaGallery.ChatXGestureAdapter", "ChatXGestureAdapter enable in position " + mMViewPager.getCurrentItem());
        b(true);
        com.tencent.mm.plugin.media.view.gesture.XGestureInterceptorView xGestureInterceptorView = this.f437225b;
        java.util.Iterator it = ((java.util.ArrayList) xGestureInterceptorView.f148599g.f326247a).iterator();
        while (it.hasNext()) {
            ((ng3.e) it.next()).e();
        }
        mg3.b l17 = a17.l();
        vh5.g gVar = a17.f437236m;
        com.tencent.mars.xlog.Log.i("MediaGallery.ChatXGestureAdapter", "onPageSelected gesture: " + mMViewPager.getCurrentItem() + ' ' + l17);
        vh5.j jVar = new vh5.j(this, gVar);
        xGestureInterceptorView.f148596d = l17;
        xGestureInterceptorView.f148597e = jVar;
        mg3.m mVar = xGestureInterceptorView.f148599g;
        mVar.f326249c = l17;
        mVar.f326250d = jVar;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    public final void b(boolean z17) {
        com.tencent.mm.plugin.media.view.gesture.XGestureInterceptorView xGestureInterceptorView = this.f437225b;
        if (z17) {
            xGestureInterceptorView.setVisibility(0);
        } else {
            xGestureInterceptorView.setVisibility(8);
        }
        com.tencent.mars.xlog.Log.i("MediaGallery.ChatXGestureAdapter", "ChatXGestureAdapter setEnabled enable: " + z17);
    }

    public final void c(boolean z17) {
        this.f437227d = z17;
        com.tencent.mm.plugin.media.view.gesture.XGestureInterceptorView xGestureInterceptorView = this.f437225b;
        if (!z17) {
            xGestureInterceptorView.a();
            return;
        }
        android.content.Context context = xGestureInterceptorView.getContext();
        mg3.m mVar = new mg3.m();
        kotlin.jvm.internal.o.d(context);
        mVar.a(new ng3.n(context));
        mVar.a(new ng3.k(context));
        mVar.a(new vh5.m(context));
        xGestureInterceptorView.setupCoordinator(mVar);
    }
}
