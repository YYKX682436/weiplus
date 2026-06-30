package vu0;

/* loaded from: classes5.dex */
public final class d0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f440067d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f440068e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f440069f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f440070g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f440071h;

    /* renamed from: i, reason: collision with root package name */
    public long f440072i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f440073m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f440074n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ vu0.o0 f440075o;

    /* renamed from: p, reason: collision with root package name */
    public int f440076p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(vu0.o0 o0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f440075o = o0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f440074n = obj;
        this.f440076p |= Integer.MIN_VALUE;
        return vu0.o0.a(this.f440075o, null, this);
    }
}
