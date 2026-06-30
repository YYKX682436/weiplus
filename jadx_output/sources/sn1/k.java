package sn1;

/* loaded from: classes9.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public int f410039d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f410040e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f410041f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sn1.z f410042g;

    /* renamed from: h, reason: collision with root package name */
    public int f410043h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(sn1.z zVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f410042g = zVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f410041f = obj;
        this.f410043h |= Integer.MIN_VALUE;
        return this.f410042g.a(0, null, null, null, null, this);
    }
}
