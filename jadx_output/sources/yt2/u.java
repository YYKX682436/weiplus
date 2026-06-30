package yt2;

/* loaded from: classes3.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt2.v f465326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f465327e;

    public u(yt2.v vVar, yz5.a aVar) {
        this.f465326d = vVar;
        this.f465327e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f465326d.b();
        yz5.a aVar = this.f465327e;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
