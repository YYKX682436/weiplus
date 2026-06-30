package vp4;

/* loaded from: classes10.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f439049d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f439050e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vp4.p f439051f;

    /* renamed from: g, reason: collision with root package name */
    public int f439052g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(vp4.p pVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f439051f = pVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f439050e = obj;
        this.f439052g |= Integer.MIN_VALUE;
        return this.f439051f.f(this);
    }
}
