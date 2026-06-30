package iy3;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Liy3/d;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes13.dex */
public final class d implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle data = (android.os.Bundle) obj;
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String string = data.getString(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_MAC);
        if (string == null) {
            string = "";
        }
        java.lang.String string2 = data.getString("avatar");
        if (string2 == null) {
            string2 = "";
        }
        my3.c0 a17 = my3.c0.f332784k.a();
        iy3.c cVar = new iy3.c(rVar);
        a17.getClass();
        if (!a17.f332789d) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosWatchService", "connectWatch not init");
            return;
        }
        a17.f332795j = false;
        a17.f332794i = string2;
        if (a17.f332790e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "ChannelReady");
            gy3.a aVar = a17.f332786a;
            cVar.a(true, aVar != null ? ((gy3.d) aVar).c() : "");
            return;
        }
        gy3.a aVar2 = a17.f332786a;
        if (aVar2 != null) {
            ((gy3.d) aVar2).d(string);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "connect no ready. wait");
        a17.f332791f = cVar;
        gy3.a aVar3 = a17.f332786a;
        if (aVar3 != null) {
            ((gy3.d) aVar3).b();
        }
    }
}
