package dk2;

/* loaded from: classes3.dex */
public final class wg implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.xg f234290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f234291e;

    public wg(dk2.xg xgVar, java.lang.Runnable runnable) {
        this.f234290d = xgVar;
        this.f234291e = runnable;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = it.what;
        dk2.xg xgVar = this.f234290d;
        xgVar.getClass();
        if (i17 == 1) {
            java.lang.Object obj = it.obj;
            if (obj instanceof java.lang.Long) {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
                long longValue = ((java.lang.Long) obj).longValue();
                this.f234290d.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.SingleTaskLooper", this.f234290d.f234357a + " MSG_DISPATCH finish:" + this.f234290d.f234358b + " delay:" + longValue);
                if (this.f234290d.f234358b) {
                    this.f234290d.f234360d.sendEmptyMessageDelayed(0, longValue);
                    this.f234290d.f234358b = false;
                }
            }
        } else if (i17 == 2) {
            xgVar.f234358b = true;
            this.f234290d.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.SingleTaskLooper", this.f234290d.f234357a + " MSG_FINISH finish:" + this.f234290d.f234358b);
        } else if (i17 == 0) {
            this.f234290d.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.SingleTaskLooper", this.f234290d.f234357a + " MSG_RUN finish:" + this.f234290d.f234358b);
            java.lang.Runnable runnable = this.f234291e;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            this.f234290d.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.SingleTaskLooper", this.f234290d.f234357a + " invalid msg:" + it.what);
        }
        return true;
    }
}
