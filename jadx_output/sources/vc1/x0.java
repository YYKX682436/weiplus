package vc1;

/* loaded from: classes13.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f435203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f435204e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f435205f;

    public x0(vc1.p1 p1Var, int i17, int i18) {
        this.f435205f = p1Var;
        this.f435203d = i17;
        this.f435204e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f435205f.f435096s == null) {
            vc1.p1 p1Var = this.f435205f;
            p1Var.f435096s = new vc1.j1(p1Var, p1Var.f435060a, p1Var.f435068e.getMap());
        }
        vc1.p1 p1Var2 = this.f435205f;
        com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer defaultClusterRenderer = p1Var2.f435098t;
        if (defaultClusterRenderer == null) {
            vc1.p1 p1Var3 = this.f435205f;
            p1Var2.f435098t = new vc1.l1(p1Var3, p1Var3.f435060a, p1Var3.f435068e.getMap(), this.f435205f.f435096s);
            this.f435205f.f435098t.setMinClusterSize(this.f435203d);
            com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.NonHierarchicalDistanceBasedAlgorithm nonHierarchicalDistanceBasedAlgorithm = new com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.NonHierarchicalDistanceBasedAlgorithm(this.f435205f.f435060a);
            nonHierarchicalDistanceBasedAlgorithm.setMaxDistanceAtZoom(this.f435204e);
            this.f435205f.f435096s.setAlgorithm(nonHierarchicalDistanceBasedAlgorithm);
        } else {
            defaultClusterRenderer.setMinClusterSize(this.f435203d);
            if (this.f435205f.f435096s.getAlgorithm() != null && (this.f435205f.f435096s.getAlgorithm() instanceof com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.NonHierarchicalDistanceBasedAlgorithm)) {
                ((com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.NonHierarchicalDistanceBasedAlgorithm) this.f435205f.f435096s.getAlgorithm()).setMaxDistanceAtZoom(this.f435204e);
            }
        }
        this.f435205f.f435096s.setOnClusterClickListener(new vc1.v0(this));
        this.f435205f.f435096s.setOnClusterItemClickListener(new vc1.w0(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "init map marker cluster finish");
        this.f435205f.f435096s.setRenderer(this.f435205f.f435098t);
        this.f435205f.f435096s.setClusterEnabled(true);
        this.f435205f.f435068e.getMap().setOnMapCameraChangeListener(this.f435205f.f435096s);
        this.f435205f.f435100u = false;
    }
}
