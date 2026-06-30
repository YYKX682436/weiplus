package sf2;

/* loaded from: classes10.dex */
public final class w2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407340d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407341e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f407342f;

    /* renamed from: g, reason: collision with root package name */
    public int f407343g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(sf2.d3 d3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407342f = d3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407341e = obj;
        this.f407343g |= Integer.MIN_VALUE;
        return this.f407342f.r7(null, null, false, null, this);
    }
}
