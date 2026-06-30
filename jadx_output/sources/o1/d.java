package o1;

/* loaded from: classes14.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f342018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o1.e f342019e;

    /* renamed from: f, reason: collision with root package name */
    public int f342020f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o1.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f342019e = eVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f342018d = obj;
        this.f342020f |= Integer.MIN_VALUE;
        return this.f342019e.c(0L, this);
    }
}
