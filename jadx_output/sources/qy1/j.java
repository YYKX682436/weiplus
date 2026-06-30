package qy1;

/* loaded from: classes13.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f367733d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f367734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qy1.m f367735f;

    /* renamed from: g, reason: collision with root package name */
    public int f367736g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(qy1.m mVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f367735f = mVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f367734e = obj;
        this.f367736g |= Integer.MIN_VALUE;
        return this.f367735f.a(null, this);
    }
}
