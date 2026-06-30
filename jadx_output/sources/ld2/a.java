package ld2;

/* loaded from: classes15.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f318067d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f318068e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f318069f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318070g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f318071h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ld2.i f318072i;

    /* renamed from: m, reason: collision with root package name */
    public int f318073m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ld2.i iVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f318072i = iVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f318071h = obj;
        this.f318073m |= Integer.MIN_VALUE;
        return this.f318072i.a(null, null, false, this);
    }
}
