package o25;

/* loaded from: classes11.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o11.g f342534e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f342535f;

    public i(java.lang.String str, o11.g gVar, long j17) {
        this.f342533d = str;
        this.f342534e = gVar;
        this.f342535f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o25.q qVar = o25.q.f342574a;
        boolean booleanValue = ((java.lang.Boolean) ((jz5.n) o25.q.f342578e).getValue()).booleanValue();
        long j17 = this.f342535f;
        o11.g gVar = this.f342534e;
        java.lang.String str = this.f342533d;
        if (booleanValue) {
            n11.a.b().j(str, null, gVar, new o25.f(j17));
        } else {
            n11.a.b().i(str, null, gVar, new o25.h(j17));
        }
    }
}
