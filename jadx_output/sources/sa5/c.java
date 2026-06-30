package sa5;

/* loaded from: classes14.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f405327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f405328e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f405329f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f405330g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f405331h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f405332i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.view.View view, long j17, float f17, long j18, int i17, yz5.a aVar) {
        super(0);
        this.f405327d = view;
        this.f405328e = j17;
        this.f405329f = f17;
        this.f405330g = j18;
        this.f405331h = i17;
        this.f405332i = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f405327d;
        float f17 = this.f405329f;
        long j17 = this.f405330g;
        int i17 = this.f405331h;
        long j18 = this.f405328e;
        view.postDelayed(new sa5.b(f17, view, j17, i17, j18, this.f405332i), j18);
        return jz5.f0.f302826a;
    }
}
