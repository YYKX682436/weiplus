package hg2;

/* loaded from: classes3.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f281359d;

    /* renamed from: e, reason: collision with root package name */
    public int f281360e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f281361f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hg2.l f281362g;

    /* renamed from: h, reason: collision with root package name */
    public int f281363h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(hg2.l lVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f281362g = lVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f281361f = obj;
        this.f281363h |= Integer.MIN_VALUE;
        return hg2.l.Z6(this.f281362g, 0, this);
    }
}
