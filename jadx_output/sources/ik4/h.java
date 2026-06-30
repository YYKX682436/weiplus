package ik4;

/* loaded from: classes4.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f291932d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f291933e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f291934f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f291935g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ik4.l f291936h;

    /* renamed from: i, reason: collision with root package name */
    public int f291937i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ik4.l lVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f291936h = lVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f291935g = obj;
        this.f291937i |= Integer.MIN_VALUE;
        return this.f291936h.a(null, null, null, false, false, this);
    }
}
