package u9;

/* loaded from: classes15.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f425778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f425779e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u9.s f425780f;

    public o(u9.s sVar, int i17, long j17) {
        this.f425780f = sVar;
        this.f425778d = i17;
        this.f425779e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f425780f.f425791b.g(this.f425778d, this.f425779e);
    }
}
