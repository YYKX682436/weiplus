package vc1;

/* loaded from: classes13.dex */
public class v0 implements com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.OnClusterClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.x0 f435185a;

    public v0(vc1.x0 x0Var) {
        this.f435185a = x0Var;
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager.OnClusterClickListener
    public boolean onClusterClick(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster cluster) {
        this.f435185a.f435205f.e(cluster);
        return true;
    }
}
