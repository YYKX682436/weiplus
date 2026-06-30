package m50;

/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m50.x f323502d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(m50.x xVar) {
        super(0);
        this.f323502d = xVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f323502d.getIntent().getIntExtra("ForwardParams_ReportFromScene", 0));
    }
}
