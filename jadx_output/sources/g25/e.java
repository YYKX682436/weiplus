package g25;

/* loaded from: classes11.dex */
public final class e implements f25.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f267978a;

    /* renamed from: b, reason: collision with root package name */
    public final f25.l0 f267979b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f267980c;

    /* renamed from: d, reason: collision with root package name */
    public final f25.l0 f267981d;

    /* renamed from: e, reason: collision with root package name */
    public final c4.f f267982e;

    /* renamed from: f, reason: collision with root package name */
    public final f25.f f267983f;

    public e(long j17, f25.l0 requestScene, boolean z17, f25.l0 l0Var, c4.f focusRequestCompat, f25.f fVar) {
        kotlin.jvm.internal.o.g(requestScene, "requestScene");
        kotlin.jvm.internal.o.g(focusRequestCompat, "focusRequestCompat");
        this.f267978a = j17;
        this.f267979b = requestScene;
        this.f267980c = z17;
        this.f267981d = l0Var;
        this.f267982e = focusRequestCompat;
        this.f267983f = fVar;
    }

    public java.lang.String toString() {
        return "IAudioFocusService.Session(id:" + this.f267978a + ",requestScene:" + this.f267979b + ",gain:" + this.f267980c + ')';
    }
}
