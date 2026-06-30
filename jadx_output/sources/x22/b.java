package x22;

/* loaded from: classes2.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x22.c f451561e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f451562f;

    public b(java.lang.String str, x22.c cVar, yz5.l lVar) {
        this.f451560d = str;
        this.f451561e = cVar;
        this.f451562f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        new p22.a(this.f451560d).l().K(new x22.a(this.f451561e, this.f451562f));
    }
}
