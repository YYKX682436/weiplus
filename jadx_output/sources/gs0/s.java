package gs0;

/* loaded from: classes14.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gs0.w f275020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rs0.h f275021e;

    public s(gs0.w wVar, rs0.h hVar) {
        this.f275020d = wVar;
        this.f275021e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gs0.w wVar = this.f275020d;
        os0.g gVar = wVar.f275038h;
        if (gVar != null) {
            gVar.n();
        }
        rs0.i.f399296a.u(this.f275021e);
        wVar.f275039i = null;
    }
}
