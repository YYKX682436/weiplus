package k50;

/* loaded from: classes9.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k50.g f304203d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k50.g gVar) {
        super(0);
        this.f304203d = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f304203d.getIntent().getStringExtra("received_card_name");
        return stringExtra == null ? "" : stringExtra;
    }
}
