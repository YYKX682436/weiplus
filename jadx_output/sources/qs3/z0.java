package qs3;

/* loaded from: classes15.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarViewController f366409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f366410e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.oi5 f366411f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ps3.e f366412g;

    public z0(com.tencent.mm.plugin.radar.ui.RadarViewController radarViewController, android.view.View view, r45.oi5 oi5Var, ps3.e eVar) {
        this.f366409d = radarViewController;
        this.f366410e = view;
        this.f366411f = oi5Var;
        this.f366412g = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.radar.ui.RadarMemberView memberDetailView;
        com.tencent.mm.plugin.radar.ui.RadarWaveView waveView;
        com.tencent.mm.plugin.radar.ui.RadarViewController radarViewController = this.f366409d;
        memberDetailView = radarViewController.getMemberDetailView();
        memberDetailView.d(this.f366410e, this.f366411f, this.f366412g);
        waveView = radarViewController.getWaveView();
        waveView.b();
    }
}
