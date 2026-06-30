package oy1;

/* loaded from: classes13.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oy1.s f349918d;

    public q(oy1.s sVar) {
        this.f349918d = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        java.util.Iterator it = ((java.util.LinkedHashMap) this.f349918d.f349925f).keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            oy1.m mVar = oy1.m.f349885a;
            java.util.List list = oy1.m.f349889e;
            if (list != null) {
                z17 = ((java.util.ArrayList) list).contains(java.lang.Integer.valueOf(intValue));
            } else {
                z17 = true;
            }
            if (z17) {
                oy1.c0 a17 = oy1.u.f349928a.a(intValue);
                if (a17 != null) {
                    com.tencent.mm.sdk.platformtools.n3 i17 = a17.i();
                    android.os.Message obtainMessage = a17.i().obtainMessage();
                    obtainMessage.what = 1003;
                    i17.sendMessage(obtainMessage);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.CgiReporter", "bizId = " + intValue + " start do history msg!");
            }
        }
    }
}
