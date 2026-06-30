package yw3;

/* loaded from: classes11.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f466813d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f466814e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f466815f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f466816g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yw3.o f466817h;

    /* renamed from: i, reason: collision with root package name */
    public int f466818i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(yw3.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f466817h = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f466816g = obj;
        this.f466818i |= Integer.MIN_VALUE;
        return this.f466817h.a(null, null, null, null, this);
    }
}
