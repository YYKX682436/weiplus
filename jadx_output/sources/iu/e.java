package iu;

/* loaded from: classes12.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f294662d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f294663e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f294664f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f294665g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f294666h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ iu.h f294667i;

    /* renamed from: m, reason: collision with root package name */
    public int f294668m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(iu.h hVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f294667i = hVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f294666h = obj;
        this.f294668m |= Integer.MIN_VALUE;
        return this.f294667i.o(null, this);
    }
}
