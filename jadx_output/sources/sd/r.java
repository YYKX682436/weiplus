package sd;

/* loaded from: classes8.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.k f406646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sd.w f406647e;

    public r(sd.w wVar, sd.k kVar) {
        this.f406647e = wVar;
        this.f406646d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f406647e.f406662c.removeView(((sd.u0) this.f406646d).f406654h);
    }
}
