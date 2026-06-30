package yt3;

/* loaded from: classes10.dex */
public final class g4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f465464d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f465465e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f465466f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f465467g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yt3.r4 f465468h;

    /* renamed from: i, reason: collision with root package name */
    public int f465469i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(yt3.r4 r4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f465468h = r4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f465467g = obj;
        this.f465469i |= Integer.MIN_VALUE;
        return yt3.r4.a(this.f465468h, null, this);
    }
}
