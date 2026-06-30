package vr0;

/* loaded from: classes14.dex */
public final class s extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f439506d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f439507e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f439508f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f439509g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vr0.z f439510h;

    /* renamed from: i, reason: collision with root package name */
    public int f439511i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(vr0.z zVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f439510h = zVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f439509g = obj;
        this.f439511i |= Integer.MIN_VALUE;
        return this.f439510h.s(null, null, null, null, this);
    }
}
