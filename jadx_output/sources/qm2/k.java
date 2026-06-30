package qm2;

/* loaded from: classes3.dex */
public final class k extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public qm2.f f364732d;

    /* renamed from: e, reason: collision with root package name */
    public long f364733e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f364734f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f364735g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f364732d = new qm2.f(0, 0, 0.0f, 0.0f, false, false, 0, 127, null);
        this.f364734f = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f364735g = new java.util.ArrayList();
    }

    public static final void O6(qm2.k kVar, java.lang.String str) {
        kVar.f364734f.set(false);
        kVar.f364732d = new qm2.f(1, 0, 0.0f, 0.0f, false, false, 0, 124, null);
        java.util.Iterator it = ((java.util.ArrayList) kVar.f364735g).iterator();
        if (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            throw null;
        }
        com.tencent.mars.xlog.Log.e("FinderStartLiveNetSpeedTestUIC", "Network speed test failed: " + str);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f364733e = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_NET_SPEED_TIMESTAMP_LONG_SYNC, 0L);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ((java.util.ArrayList) this.f364735g).clear();
    }
}
