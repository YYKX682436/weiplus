package nr2;

/* loaded from: classes2.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f339162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nr2.l f339163e;

    /* renamed from: f, reason: collision with root package name */
    public int f339164f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(nr2.l lVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f339163e = lVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f339162d = obj;
        this.f339164f |= Integer.MIN_VALUE;
        java.lang.Object O6 = nr2.l.O6(this.f339163e, null, this);
        return O6 == pz5.a.f359186d ? O6 : kotlin.Result.m520boximpl(O6);
    }
}
