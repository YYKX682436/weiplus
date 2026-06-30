package dk2;

/* loaded from: classes3.dex */
public final class z2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f234411d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f234412e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f234413f;

    /* renamed from: g, reason: collision with root package name */
    public int f234414g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(dk2.r4 r4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f234413f = r4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f234412e = obj;
        this.f234414g |= Integer.MIN_VALUE;
        return this.f234413f.f0(null, null, null, null, this);
    }
}
