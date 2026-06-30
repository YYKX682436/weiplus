package qr3;

/* loaded from: classes4.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f366085d;

    /* renamed from: e, reason: collision with root package name */
    public int f366086e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qr3.g f366087f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(qr3.g gVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f366087f = gVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f366085d = obj;
        this.f366086e |= Integer.MIN_VALUE;
        return this.f366087f.emit(null, this);
    }
}
