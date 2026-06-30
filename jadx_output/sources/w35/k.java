package w35;

/* loaded from: classes8.dex */
public final class k implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w35.l f442739d;

    public k(w35.l lVar) {
        this.f442739d = lVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.util.ArrayList<com.tencent.mm.feature.exdevice.NetworkDeviceInfo> parcelableArrayList = bundle != null ? bundle.getParcelableArrayList("deviceList") : null;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (parcelableArrayList != null) {
            for (com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo : parcelableArrayList) {
                com.tencent.mm.pluginsdk.ui.otherway.w wVar = new com.tencent.mm.pluginsdk.ui.otherway.w();
                wVar.f191016f = networkDeviceInfo;
                arrayList.add(wVar);
            }
        }
        w35.l lVar = this.f442739d;
        com.tencent.mars.xlog.Log.i(lVar.f442740e, "get device open way count: " + arrayList.size());
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new w35.j(lVar, arrayList));
    }
}
