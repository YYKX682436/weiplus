package iu;

/* loaded from: classes12.dex */
public final class s extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f294760d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f294761e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f294762f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f294763g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f294764h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ iu.t f294765i;

    /* renamed from: m, reason: collision with root package name */
    public int f294766m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(iu.t tVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f294765i = tVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f294764h = obj;
        this.f294766m |= Integer.MIN_VALUE;
        return this.f294765i.b(null, this);
    }
}
