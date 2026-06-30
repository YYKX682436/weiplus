package pi0;

/* loaded from: classes11.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f354529d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f354530e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f354531f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f354532g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f354533h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f354534i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f354535m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ pi0.q f354536n;

    /* renamed from: o, reason: collision with root package name */
    public int f354537o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(pi0.q qVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f354536n = qVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f354535m = obj;
        this.f354537o |= Integer.MIN_VALUE;
        return this.f354536n.c(null, null, null, false, null, this);
    }
}
