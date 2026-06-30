package iu;

/* loaded from: classes12.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f294732d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f294733e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f294734f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f294735g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f294736h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f294737i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ iu.r f294738m;

    /* renamed from: n, reason: collision with root package name */
    public int f294739n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(iu.r rVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f294738m = rVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f294737i = obj;
        this.f294739n |= Integer.MIN_VALUE;
        return this.f294738m.s(null, null, 0, this);
    }
}
