package x40;

/* loaded from: classes11.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f451726d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f451727e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f451728f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f451729g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f451730h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f451731i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x40.h f451732m;

    /* renamed from: n, reason: collision with root package name */
    public int f451733n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(x40.h hVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f451732m = hVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f451731i = obj;
        this.f451733n |= Integer.MIN_VALUE;
        return x40.h.a(this.f451732m, null, null, this);
    }
}
