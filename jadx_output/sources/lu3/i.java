package lu3;

/* loaded from: classes10.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lu3.m f321405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lu3.a f321406e;

    public i(lu3.m mVar, lu3.a aVar) {
        this.f321405d = mVar;
        this.f321406e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f321405d.e(true, this.f321406e);
    }
}
