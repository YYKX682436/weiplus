package ik4;

/* loaded from: classes4.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f291918d;

    /* renamed from: e, reason: collision with root package name */
    public long f291919e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f291920f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ik4.g f291921g;

    /* renamed from: h, reason: collision with root package name */
    public int f291922h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ik4.g gVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f291921g = gVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f291920f = obj;
        this.f291922h |= Integer.MIN_VALUE;
        return this.f291921g.f(this);
    }
}
