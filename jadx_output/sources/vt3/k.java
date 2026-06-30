package vt3;

/* loaded from: classes5.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f440002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vt3.l f440003e;

    /* renamed from: f, reason: collision with root package name */
    public int f440004f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(vt3.l lVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f440003e = lVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f440002d = obj;
        this.f440004f |= Integer.MIN_VALUE;
        return vt3.l.a(this.f440003e, this);
    }
}
