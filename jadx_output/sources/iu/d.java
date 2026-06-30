package iu;

/* loaded from: classes12.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f294659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iu.h f294660e;

    /* renamed from: f, reason: collision with root package name */
    public int f294661f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(iu.h hVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f294660e = hVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f294659d = obj;
        this.f294661f |= Integer.MIN_VALUE;
        return this.f294660e.j(null, null, this);
    }
}
