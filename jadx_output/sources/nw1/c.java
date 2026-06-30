package nw1;

/* loaded from: classes14.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f340775d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f340776e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw1.d f340777f;

    /* renamed from: g, reason: collision with root package name */
    public int f340778g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(nw1.d dVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f340777f = dVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f340776e = obj;
        this.f340778g |= Integer.MIN_VALUE;
        return this.f340777f.b(this);
    }
}
