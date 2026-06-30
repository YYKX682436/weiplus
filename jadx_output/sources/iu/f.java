package iu;

/* loaded from: classes12.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f294669d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f294670e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f294671f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f294672g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f294673h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f294674i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f294675m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ iu.h f294676n;

    /* renamed from: o, reason: collision with root package name */
    public int f294677o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(iu.h hVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f294676n = hVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f294675m = obj;
        this.f294677o |= Integer.MIN_VALUE;
        return this.f294676n.p(null, null, 0, false, this);
    }
}
