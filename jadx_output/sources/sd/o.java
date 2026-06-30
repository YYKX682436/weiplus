package sd;

/* loaded from: classes8.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.k f406628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sd.w f406629e;

    public o(sd.w wVar, sd.k kVar) {
        this.f406629e = wVar;
        this.f406628d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f406629e.j(this.f406628d);
    }
}
