package df2;

/* loaded from: classes3.dex */
public final class dc extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f229963d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f229964e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f229965f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f229966g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f229967h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ df2.jc f229968i;

    /* renamed from: m, reason: collision with root package name */
    public int f229969m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc(df2.jc jcVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f229968i = jcVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f229967h = obj;
        this.f229969m |= Integer.MIN_VALUE;
        return df2.jc.a7(this.f229968i, this);
    }
}
