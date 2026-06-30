package lm2;

/* loaded from: classes3.dex */
public final class e0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f319381d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f319382e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lm2.h0 f319383f;

    /* renamed from: g, reason: collision with root package name */
    public int f319384g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(lm2.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f319383f = h0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f319382e = obj;
        this.f319384g |= Integer.MIN_VALUE;
        return this.f319383f.f(null, false, this);
    }
}
