package un;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.w f429329d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(un.w wVar) {
        super(0);
        this.f429329d = wVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f429329d.getIntent().getStringExtra("intent_key_ticket");
        return stringExtra == null ? "" : stringExtra;
    }
}
