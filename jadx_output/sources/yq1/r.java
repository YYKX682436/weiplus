package yq1;

/* loaded from: classes8.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f464461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f464462e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f464463f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f464464g;

    public r(java.lang.String str, int i17, int i18, int i19) {
        this.f464461d = str;
        this.f464462e = i17;
        this.f464463f = i18;
        this.f464464g = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lr1.c0 c0Var = lr1.c0.f320643a;
        int i17 = this.f464462e;
        int i18 = this.f464463f;
        int i19 = this.f464464g;
        java.lang.String url = this.f464461d;
        kotlin.jvm.internal.o.g(url, "url");
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new lr1.z(java.lang.System.currentTimeMillis(), url, i17, i19, i18, 2, null), 2, null);
    }
}
