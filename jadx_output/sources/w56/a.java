package w56;

/* loaded from: classes16.dex */
public class a extends p56.r {

    /* renamed from: h, reason: collision with root package name */
    public final p56.r f443042h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f443043i;

    public a(p56.r rVar) {
        super(rVar, true);
        this.f443042h = rVar;
    }

    @Override // p56.m
    public void a(java.lang.Object obj) {
        try {
            if (this.f443043i) {
                return;
            }
            this.f443042h.a(obj);
        } catch (java.lang.Throwable th6) {
            q56.f.c(th6, this);
        }
    }

    @Override // p56.m
    public void onCompleted() {
        q56.n nVar;
        if (this.f443043i) {
            return;
        }
        this.f443043i = true;
        try {
            this.f443042h.onCompleted();
            try {
                c();
            } finally {
            }
        } catch (java.lang.Throwable th6) {
            try {
                q56.f.b(th6);
                x56.m.a(th6);
                throw new q56.h(th6.getMessage(), th6);
            } catch (java.lang.Throwable th7) {
                try {
                    c();
                    throw th7;
                } finally {
                }
            }
        }
    }

    @Override // p56.m
    public void onError(java.lang.Throwable th6) {
        q56.f.b(th6);
        if (this.f443043i) {
            return;
        }
        this.f443043i = true;
        x56.m.a(th6);
        try {
            this.f443042h.onError(th6);
            try {
                c();
            } catch (java.lang.Throwable th7) {
                x56.m.a(th7);
                throw new q56.i(th7);
            }
        } catch (q56.j e17) {
            try {
                c();
                throw e17;
            } catch (java.lang.Throwable th8) {
                x56.m.a(th8);
                throw new q56.j("Observer.onError not implemented and error while unsubscribing.", new q56.e(java.util.Arrays.asList(th6, th8)));
            }
        } catch (java.lang.Throwable th9) {
            x56.m.a(th9);
            try {
                c();
                throw new q56.i("Error occurred when trying to propagate error to Observer.onError", new q56.e(java.util.Arrays.asList(th6, th9)));
            } catch (java.lang.Throwable th10) {
                x56.m.a(th10);
                throw new q56.i("Error occurred when trying to propagate error to Observer.onError and during unsubscription.", new q56.e(java.util.Arrays.asList(th6, th9, th10)));
            }
        }
    }
}
