package z81;

/* loaded from: classes13.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z81.g f470689d;

    public c(z81.g gVar) {
        this.f470689d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f470689d.f470704n;
        this.f470689d.f470704n = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.DrawActionDelegateImpl", "preStae %b, hasChanged %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f470689d.f470697d));
        if (z17 && this.f470689d.f470697d) {
            this.f470689d.f470702i.a();
        }
    }
}
