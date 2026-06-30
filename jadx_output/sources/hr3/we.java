package hr3;

/* loaded from: classes5.dex */
public final class we extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f284156d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we(hr3.pf pfVar) {
        super(0);
        this.f284156d = pfVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f284156d.getIntent().getBooleanExtra("sayhi_with_sns_perm_send_verify", false));
    }
}
