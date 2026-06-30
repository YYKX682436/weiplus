package iy3;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Liy3/b;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes9.dex */
public final class b implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        android.os.Bundle bundle2 = new android.os.Bundle();
        com.tencent.mm.network.s sVar = gm0.j1.d().f70764d;
        int i17 = bundle != null ? bundle.getInt("taskid", -1) : -1;
        java.lang.String string = bundle != null ? bundle.getString("handshke") : null;
        if (sVar != null && bundle != null && string != null && i17 != -1) {
            jy3.c cVar = new jy3.c();
            cVar.J(jy3.c.f302503f.b(string));
            cVar.doScene(sVar, new iy3.a(bundle2, i17, rVar));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.IPCBuildDeviceSecureChannel", "dispatcher null");
            h73.e.c(bundle2, "code", -1);
            h73.e.c(bundle2, "taskid", i17);
            if (rVar != null) {
                rVar.a(bundle2);
            }
        }
    }
}
