package tf5;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tf5.j f418993d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(tf5.j jVar) {
        super(0);
        this.f418993d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Long.valueOf(this.f418993d.getIntent().getLongExtra("MvvmAddressReportUIC_session_id", 0L));
    }
}
