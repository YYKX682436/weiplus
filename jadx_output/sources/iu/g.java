package iu;

/* loaded from: classes12.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f294678d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f294679e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f294680f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f294681g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f294682h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f294683i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f294684m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ iu.h f294685n;

    /* renamed from: o, reason: collision with root package name */
    public int f294686o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(iu.h hVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f294685n = hVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f294684m = obj;
        this.f294686o |= Integer.MIN_VALUE;
        return this.f294685n.q(null, null, false, this);
    }
}
