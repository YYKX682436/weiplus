package i04;

/* loaded from: classes8.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i04.f f286544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286545e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f286546f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f286547g;

    public h(i04.f fVar, java.lang.String str, long j17, long j18) {
        this.f286544d = fVar;
        this.f286545e = str;
        this.f286546f = j17;
        this.f286547g = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f286544d.f286540c.a(this.f286545e, this.f286546f, this.f286547g);
    }
}
