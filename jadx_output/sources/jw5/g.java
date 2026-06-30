package jw5;

/* loaded from: classes11.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f302354d;

    public g(java.lang.String str) {
        this.f302354d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj = jw5.i.f302356d;
        java.lang.String str = this.f302354d;
        synchronized (obj) {
            jz5.o oVar = (jz5.o) jw5.i.f302358f.remove(str);
            if (oVar != null) {
                java.lang.String msg = "pushChannel: waitingChannel timeout remove " + str;
                kotlin.jvm.internal.o.g(msg, "msg");
                if (iw5.o.f295275a != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AidlZChannelServerFactory", msg);
                }
                ((yz5.l) oVar.f302843f).invoke(java.lang.Boolean.FALSE);
            }
        }
    }
}
