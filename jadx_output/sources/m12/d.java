package m12;

/* loaded from: classes10.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f322824d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f322825e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f322826f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f322827g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m12.i f322828h;

    /* renamed from: i, reason: collision with root package name */
    public int f322829i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m12.i iVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f322828h = iVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f322827g = obj;
        this.f322829i |= Integer.MIN_VALUE;
        return this.f322828h.c(this);
    }
}
