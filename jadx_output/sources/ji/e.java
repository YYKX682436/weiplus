package ji;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Runnable f299874a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f299875b;

    /* renamed from: c, reason: collision with root package name */
    public final long f299876c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.matrix.lifecycle.IBackgroundStatefulOwner f299877d;

    /* renamed from: e, reason: collision with root package name */
    public final ji.h[] f299878e;

    public e(long j17, com.tencent.matrix.lifecycle.IBackgroundStatefulOwner bgStatefulOwner, ji.h[] configs) {
        kotlin.jvm.internal.o.g(bgStatefulOwner, "bgStatefulOwner");
        kotlin.jvm.internal.o.g(configs, "configs");
        this.f299876c = j17;
        this.f299877d = bgStatefulOwner;
        this.f299878e = configs;
        this.f299874a = new ji.c(this);
        this.f299875b = oj.g.a();
    }
}
