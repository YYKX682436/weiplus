package mj;

/* loaded from: classes12.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mj.i f326964d;

    public g(mj.i iVar) {
        this.f326964d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        mj.i iVar = this.f326964d;
        if (iVar.f326973c) {
            iVar.f326973c = false;
            iVar.f326971a.removeView(iVar.f326974d);
        }
    }
}
