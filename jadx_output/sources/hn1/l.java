package hn1;

/* loaded from: classes11.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f282459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hn1.s f282460e;

    /* renamed from: f, reason: collision with root package name */
    public int f282461f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(hn1.s sVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f282460e = sVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f282459d = obj;
        this.f282461f |= Integer.MIN_VALUE;
        return this.f282460e.fj(null, 0.0f, this);
    }
}
