package s56;

/* loaded from: classes16.dex */
public class r extends p56.r {

    /* renamed from: h, reason: collision with root package name */
    public boolean f403236h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p56.r f403237i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s56.s f403238m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s56.s sVar, p56.r rVar, p56.r rVar2) {
        super(rVar, true);
        this.f403238m = sVar;
        this.f403237i = rVar2;
    }

    @Override // p56.m
    public void a(java.lang.Object obj) {
        if (this.f403236h) {
            return;
        }
        try {
            this.f403238m.f403239a.a(obj);
            this.f403237i.a(obj);
        } catch (java.lang.Throwable th6) {
            q56.f.d(th6, this, obj);
        }
    }

    @Override // p56.m
    public void onCompleted() {
        if (this.f403236h) {
            return;
        }
        try {
            this.f403238m.f403239a.onCompleted();
            this.f403236h = true;
            this.f403237i.onCompleted();
        } catch (java.lang.Throwable th6) {
            q56.f.c(th6, this);
        }
    }

    @Override // p56.m
    public void onError(java.lang.Throwable th6) {
        p56.r rVar = this.f403237i;
        q56.f.b(th6);
        if (this.f403236h) {
            return;
        }
        this.f403236h = true;
        try {
            this.f403238m.f403239a.onError(th6);
            rVar.onError(th6);
        } catch (java.lang.Throwable th7) {
            q56.f.b(th7);
            rVar.onError(new q56.e(java.util.Arrays.asList(th6, th7)));
        }
    }
}
