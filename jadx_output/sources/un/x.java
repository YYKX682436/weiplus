package un;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.k0 f429337d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(un.k0 k0Var) {
        super(0);
        this.f429337d = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f429337d.getIntent().getStringExtra("chatroomName");
        return stringExtra == null ? "" : stringExtra;
    }
}
