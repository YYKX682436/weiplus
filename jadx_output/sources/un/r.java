package un;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.w f429323d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(un.w wVar) {
        super(0);
        this.f429323d = wVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f429323d.getIntent().getStringExtra("chatroomName");
        return stringExtra == null ? "" : stringExtra;
    }
}
