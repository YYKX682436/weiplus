package vc1;

/* loaded from: classes13.dex */
public class b1 implements com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapLoadedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f434914a;

    public b1(vc1.p1 p1Var) {
        this.f434914a = p1Var;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapLoadedListener
    public void onMapLoaded() {
        vc1.p1 p1Var = this.f434914a;
        p1Var.getClass();
        vc1.p1.f(p1Var);
        p1Var.f435102v = true;
        if (p1Var.P.size() > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(p1Var.P);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                p1Var.m((java.lang.String) it.next());
            }
            p1Var.P.clear();
        }
    }
}
