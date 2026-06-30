package g20;

/* loaded from: classes8.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g20.g f267769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.n9 f267770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267771f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267772g;

    public f(g20.g gVar, bw5.n9 n9Var, java.lang.String str, java.lang.String str2) {
        this.f267769d = gVar;
        this.f267770e = n9Var;
        this.f267771f = str;
        this.f267772g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x02.h Bi = this.f267769d.Bi();
        if (Bi != null) {
            bw5.n9 preloadTiming = this.f267770e;
            kotlin.jvm.internal.o.g(preloadTiming, "preloadTiming");
            java.lang.String reddotId = this.f267771f;
            kotlin.jvm.internal.o.g(reddotId, "reddotId");
            java.lang.String reddotByPass = this.f267772g;
            kotlin.jvm.internal.o.g(reddotByPass, "reddotByPass");
            urgen.ur_7522.UR_3A2B.UR_E604(((x02.i) Bi).getCppPointer(), preloadTiming.f30566d, reddotId, reddotByPass);
        }
    }
}
