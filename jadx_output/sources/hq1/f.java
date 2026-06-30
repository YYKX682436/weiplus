package hq1;

/* loaded from: classes7.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq1.g f283106d;

    public f(hq1.g gVar) {
        this.f283106d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        hq1.g gVar = this.f283106d;
        if (gVar.f283107a.f283144j.isEmpty()) {
            return;
        }
        java.util.Iterator it = gVar.f283107a.f283144j.iterator();
        while (it.hasNext()) {
            java.lang.Long l17 = (java.lang.Long) it.next();
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLEManager", "Cannot scan out Remote device(Mac = %d), Connect Failed!!!", l17);
            hq1.h hVar = gVar.f283107a.f283135a;
            if (hVar != null) {
                hVar.a(l17.longValue(), false);
            }
        }
        gVar.f283107a.f283144j.clear();
    }
}
