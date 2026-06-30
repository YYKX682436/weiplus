package hr3;

/* loaded from: classes.dex */
public final class of extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f283865d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of(hr3.pf pfVar) {
        super(0);
        this.f283865d = pfVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f283865d.getIntent().getStringExtra("Contact_User");
        return stringExtra == null ? "" : stringExtra;
    }
}
