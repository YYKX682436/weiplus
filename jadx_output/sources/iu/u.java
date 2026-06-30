package iu;

/* loaded from: classes12.dex */
public final class u extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f294767d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f294768e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f294769f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f294770g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f294771h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ iu.v f294772i;

    /* renamed from: m, reason: collision with root package name */
    public int f294773m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(iu.v vVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f294772i = vVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f294771h = obj;
        this.f294773m |= Integer.MIN_VALUE;
        return this.f294772i.b(null, this);
    }
}
