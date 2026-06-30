package yt2;

/* loaded from: classes3.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt2.v f465324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f465325e;

    public t(yt2.v vVar, yz5.a aVar) {
        this.f465324d = vVar;
        this.f465325e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f465324d.c();
        yz5.a aVar = this.f465325e;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
