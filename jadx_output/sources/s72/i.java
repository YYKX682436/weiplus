package s72;

/* loaded from: classes12.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f404055d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f404056e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f404057f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f404058g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f404059h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s72.j0 f404060i;

    /* renamed from: m, reason: collision with root package name */
    public int f404061m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(s72.j0 j0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f404060i = j0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f404059h = obj;
        this.f404061m |= Integer.MIN_VALUE;
        return this.f404060i.U6(null, null, null, this);
    }
}
