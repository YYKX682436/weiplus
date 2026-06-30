package y00;

/* loaded from: classes4.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f458504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f458505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f458506f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f458507g;

    public c0(int i17, int i18, java.util.concurrent.atomic.AtomicInteger atomicInteger, java.lang.String str) {
        this.f458504d = i17;
        this.f458505e = i18;
        this.f458506f = atomicInteger;
        this.f458507g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfProductCardWarmer", "warmForTalker: queried %d parsed %d put %d talker=%s", java.lang.Integer.valueOf(this.f458504d), java.lang.Integer.valueOf(this.f458505e), java.lang.Integer.valueOf(this.f458506f.get()), this.f458507g);
    }
}
