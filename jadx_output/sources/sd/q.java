package sd;

/* loaded from: classes8.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.k f406643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sd.w f406644e;

    public q(sd.w wVar, sd.k kVar) {
        this.f406644e = wVar;
        this.f406643d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        sd.w wVar = this.f406644e;
        if (((android.app.Activity) wVar.f406661b).isFinishing()) {
            return;
        }
        sd.k kVar = wVar.f406663d.size() == 0 ? null : (sd.k) wVar.f406663d.pop();
        if (kVar != null) {
            wVar.j(kVar);
        }
        sd.v vVar = wVar.f406663d;
        sd.k kVar2 = this.f406643d;
        vVar.push(kVar2);
        wVar.f406662c.addView(((sd.u0) kVar2).f406654h);
        kVar2.h();
    }
}
