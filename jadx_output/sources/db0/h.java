package db0;

/* loaded from: classes8.dex */
public final class h implements db0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ db0.j f227829a;

    public h(db0.j jVar) {
        this.f227829a = jVar;
    }

    @Override // db0.e
    public void a(java.lang.Object obj, int i17) {
        com.tencent.mm.feature.openmsg.uic.e0 item = (com.tencent.mm.feature.openmsg.uic.e0) obj;
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo = item.f67330d;
        int hashCode = networkDeviceInfo.hashCode();
        db0.j jVar = this.f227829a;
        if (jVar.f227834d.indexOfKey(hashCode) >= 0) {
            return;
        }
        jVar.f227834d.put(hashCode, true);
        ((di1.f) jVar.f227831a).i(1L, networkDeviceInfo.f66586d, networkDeviceInfo.f66588f, networkDeviceInfo.f66594o ? networkDeviceInfo.f66595p : 3);
    }
}
