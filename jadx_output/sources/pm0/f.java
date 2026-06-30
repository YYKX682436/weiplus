package pm0;

/* loaded from: classes8.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f356767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f356768e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pm0.g f356769f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yz5.a aVar, android.view.View view, pm0.g gVar) {
        super(0);
        this.f356767d = aVar;
        this.f356768e = view;
        this.f356769f = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f356767d.invoke();
        this.f356768e.removeOnLayoutChangeListener(this.f356769f);
        return jz5.f0.f302826a;
    }
}
