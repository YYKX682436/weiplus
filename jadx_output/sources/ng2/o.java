package ng2;

/* loaded from: classes10.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ng2.s f336976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.live.core.view.LiveVideoView f336977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f336978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f336979g;

    public o(ng2.s sVar, com.tencent.mm.live.core.view.LiveVideoView liveVideoView, yz5.l lVar, yz5.a aVar) {
        this.f336976d = sVar;
        this.f336977e = liveVideoView;
        this.f336978f = lVar;
        this.f336979g = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ng2.s sVar = this.f336976d;
        com.tencent.mars.xlog.Log.i(sVar.f318557e, "switchInLiveRoom switch view success. #2");
        if (ig2.e.f291372a.c()) {
            qg2.d dVar = qg2.d.f362793a;
            com.tencent.mm.live.core.view.LiveVideoView view = this.f336977e;
            kotlin.jvm.internal.o.g(view, "view");
            android.view.ViewParent parent = view.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.addView(view);
            }
        }
        this.f336978f.invoke(java.lang.Boolean.FALSE);
        boolean z17 = sVar.d().f291386k;
        yz5.a aVar = this.f336979g;
        if (z17 && ((java.lang.Boolean) aVar.invoke()).booleanValue()) {
            sVar.p();
        } else {
            pm0.v.V(60L, new ng2.n(aVar, sVar));
        }
        com.tencent.mars.xlog.Log.i(sVar.f318557e, "switchInLiveRoom switch view success. #3");
    }
}
