package im2;

/* loaded from: classes3.dex */
public final class s5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f292526d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f292527e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f292528f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ im2.h6 f292529g;

    /* renamed from: h, reason: collision with root package name */
    public int f292530h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(im2.h6 h6Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f292529g = h6Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f292528f = obj;
        this.f292530h |= Integer.MIN_VALUE;
        return im2.h6.h(this.f292529g, this);
    }
}
