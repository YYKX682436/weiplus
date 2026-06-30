package f34;

/* loaded from: classes11.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f34.m f259358d;

    public l(f34.m mVar) {
        this.f259358d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        f34.m mVar = this.f259358d;
        if (mVar.f259367o) {
            return;
        }
        mVar.f();
    }
}
