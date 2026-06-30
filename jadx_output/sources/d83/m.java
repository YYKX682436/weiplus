package d83;

/* loaded from: classes2.dex */
public final class m extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f226994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d83.o f226995e;

    /* renamed from: f, reason: collision with root package name */
    public int f226996f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(d83.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f226995e = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f226994d = obj;
        this.f226996f |= Integer.MIN_VALUE;
        return this.f226995e.a(null, 0, this);
    }
}
