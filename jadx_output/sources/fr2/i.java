package fr2;

/* loaded from: classes2.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f265723d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f265724e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f265725f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fr2.p f265726g;

    /* renamed from: h, reason: collision with root package name */
    public int f265727h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(fr2.p pVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f265726g = pVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f265725f = obj;
        this.f265727h |= Integer.MIN_VALUE;
        return fr2.p.Q6(this.f265726g, false, this);
    }
}
