package vr0;

/* loaded from: classes14.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f439478d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f439479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vr0.z f439480f;

    /* renamed from: g, reason: collision with root package name */
    public int f439481g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(vr0.z zVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f439480f = zVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f439479e = obj;
        this.f439481g |= Integer.MIN_VALUE;
        return this.f439480f.w(null, this);
    }
}
