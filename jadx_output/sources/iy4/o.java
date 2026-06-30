package iy4;

/* loaded from: classes11.dex */
public final class o implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iy4.p f295979d;

    public o(iy4.p pVar) {
        this.f295979d = pVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.ArrayList K = ug3.i.K();
        kotlin.jvm.internal.o.f(K, "getOnlineInfoList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(K, 10));
        java.util.Iterator it = K.iterator();
        while (it.hasNext()) {
            arrayList.add(((ug3.k) it.next()).F);
        }
        com.tencent.pigeon.ext_device.ExtDeviceManageFlutterAPI extDeviceManageFlutterAPI = this.f295979d.f295982e;
        if (extDeviceManageFlutterAPI != null) {
            extDeviceManageFlutterAPI.updateDeviceInfos(arrayList, iy4.n.f295978d);
        }
    }
}
