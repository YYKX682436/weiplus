package iu;

/* loaded from: classes12.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f294649d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f294650e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f294651f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f294652g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f294653h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ iu.h f294654i;

    /* renamed from: m, reason: collision with root package name */
    public int f294655m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(iu.h hVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f294654i = hVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f294653h = obj;
        this.f294655m |= Integer.MIN_VALUE;
        return this.f294654i.h(null, 0, this);
    }
}
