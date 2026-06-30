package mj;

/* loaded from: classes12.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f326965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mj.i f326966e;

    public h(mj.i iVar, boolean z17) {
        this.f326966e = iVar;
        this.f326965d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f326965d;
        mj.i iVar = this.f326966e;
        if (z17) {
            if (iVar.f326977g) {
                mj.i.f326967n.post(new mj.f(iVar));
            }
        } else if (iVar.f326977g) {
            mj.i.f326967n.post(new mj.g(iVar));
        }
    }
}
