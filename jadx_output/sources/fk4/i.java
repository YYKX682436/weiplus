package fk4;

/* loaded from: classes12.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk4.k f263608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f263609e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f263610f;

    public i(fk4.k kVar, long j17, long j18) {
        this.f263608d = kVar;
        this.f263609e = j17;
        this.f263610f = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t21.o2.Di().p(this.f263608d.f(), (int) this.f263609e, (int) this.f263610f, 0);
    }
}
