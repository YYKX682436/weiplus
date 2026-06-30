package vc1;

/* loaded from: classes13.dex */
public class d1 implements com.tencent.tencentmap.mapsdk.map.TencentMap.OnIndoorStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f434953a;

    public d1(vc1.p1 p1Var) {
        this.f434953a = p1Var;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnIndoorStateChangeListener
    public boolean onIndoorBuildingDeactivated() {
        vc1.p1 p1Var = this.f434953a;
        if (p1Var.M == null) {
            return true;
        }
        vc1.v1 v1Var = new vc1.v1();
        v1Var.f435186a = "";
        v1Var.f435187b = "";
        v1Var.f435188c = new java.util.LinkedList();
        v1Var.f435189d = -1;
        p1Var.N = v1Var;
        p1Var.M.a(v1Var);
        return true;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnIndoorStateChangeListener
    public boolean onIndoorBuildingFocused() {
        return true;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnIndoorStateChangeListener
    public boolean onIndoorLevelActivated(com.tencent.mapsdk.raster.model.IndoorBuilding indoorBuilding) {
        vc1.p1 p1Var = this.f434953a;
        if (p1Var.M == null) {
            return true;
        }
        vc1.v1 v1Var = new vc1.v1();
        v1Var.f435186a = indoorBuilding.getBuidlingId();
        v1Var.f435187b = indoorBuilding.getBuildingName();
        v1Var.f435188c = new java.util.LinkedList();
        for (com.tencent.mapsdk.raster.model.IndoorLevel indoorLevel : indoorBuilding.getLevels()) {
            vc1.w1 w1Var = new vc1.w1();
            w1Var.f435192a = indoorLevel.getName();
            v1Var.f435188c.add(w1Var);
        }
        v1Var.f435189d = indoorBuilding.getActiveLevelIndex();
        p1Var.N = v1Var;
        p1Var.M.a(v1Var);
        return true;
    }
}
