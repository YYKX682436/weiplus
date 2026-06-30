package mh2;

/* loaded from: classes10.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f326358d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f326359e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f326360f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f326361g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mh2.k f326362h;

    /* renamed from: i, reason: collision with root package name */
    public int f326363i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(mh2.k kVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f326362h = kVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f326361g = obj;
        this.f326363i |= Integer.MIN_VALUE;
        return mh2.k.a(this.f326362h, null, this);
    }
}
