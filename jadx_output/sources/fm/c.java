package fm;

/* loaded from: classes13.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f263968d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f263969e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f263970f;

    /* renamed from: g, reason: collision with root package name */
    public long f263971g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f263972h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fm.h f263973i;

    /* renamed from: m, reason: collision with root package name */
    public int f263974m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(fm.h hVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f263973i = hVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f263972h = obj;
        this.f263974m |= Integer.MIN_VALUE;
        return this.f263973i.wi(null, 0, this);
    }
}
