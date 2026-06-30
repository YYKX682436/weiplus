package u9;

/* loaded from: classes15.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f425773e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f425774f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u9.s f425775g;

    public m(u9.s sVar, java.lang.String str, long j17, long j18) {
        this.f425775g = sVar;
        this.f425772d = str;
        this.f425773e = j17;
        this.f425774f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f425775g.f425791b.l(this.f425772d, this.f425773e, this.f425774f);
    }
}
