package hn1;

/* loaded from: classes11.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f282468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hn1.s f282469e;

    /* renamed from: f, reason: collision with root package name */
    public int f282470f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(hn1.s sVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f282469e = sVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f282468d = obj;
        this.f282470f |= Integer.MIN_VALUE;
        return this.f282469e.nj(null, null, 0.0f, null, this);
    }
}
