package s56;

/* loaded from: classes16.dex */
public class n implements r56.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p56.r f403225d;

    public n(s56.o oVar, p56.r rVar) {
        this.f403225d = rVar;
    }

    @Override // r56.a
    public void call() {
        p56.r rVar = this.f403225d;
        try {
            rVar.a(0L);
            rVar.onCompleted();
        } catch (java.lang.Throwable th6) {
            q56.f.c(th6, rVar);
        }
    }
}
