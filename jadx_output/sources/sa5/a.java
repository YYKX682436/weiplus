package sa5;

/* loaded from: classes14.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f405313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f405314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f405315f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f405316g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f405317h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f405318i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i17, android.view.View view, float f17, long j17, long j18, yz5.a aVar) {
        super(0);
        this.f405313d = i17;
        this.f405314e = view;
        this.f405315f = f17;
        this.f405316g = j17;
        this.f405317h = j18;
        this.f405318i = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f405313d;
        if (i17 > 1) {
            sa5.d.e(this.f405314e, this.f405315f, i17 - 1, this.f405316g, this.f405317h, this.f405318i);
        } else {
            yz5.a aVar = this.f405318i;
            if (aVar != null) {
                aVar.invoke();
            }
        }
        return jz5.f0.f302826a;
    }
}
