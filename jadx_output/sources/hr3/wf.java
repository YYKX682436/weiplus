package hr3;

/* loaded from: classes12.dex */
public final class wf extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f284157d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f284158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hr3.ag f284159f;

    /* renamed from: g, reason: collision with root package name */
    public int f284160g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf(hr3.ag agVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f284159f = agVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f284158e = obj;
        this.f284160g |= Integer.MIN_VALUE;
        return this.f284159f.g(null, this);
    }
}
