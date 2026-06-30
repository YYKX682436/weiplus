package qr3;

/* loaded from: classes4.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f366079d;

    /* renamed from: e, reason: collision with root package name */
    public int f366080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qr3.d f366081f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(qr3.d dVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f366081f = dVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f366079d = obj;
        this.f366080e |= Integer.MIN_VALUE;
        return this.f366081f.emit(null, this);
    }
}
