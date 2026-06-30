package sd;

/* loaded from: classes8.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.m f406617d;

    public l(sd.m mVar) {
        this.f406617d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        sd.m mVar = this.f406617d;
        sd.v vVar = mVar.f406623g.f406663d;
        sd.k kVar = mVar.f406622f;
        boolean contains = vVar.contains(kVar);
        sd.w wVar = mVar.f406623g;
        if (!contains) {
            wVar.f406663d.push(kVar);
        }
        if (wVar.f406667h != null) {
            return;
        }
        wVar.f406662c.postDelayed(new sd.s(wVar), 200L);
    }
}
