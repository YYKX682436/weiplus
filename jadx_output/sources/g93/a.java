package g93;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g93.j f269771d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g93.j jVar) {
        super(0);
        this.f269771d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f269771d.getIntent().getStringExtra("always_select_contact");
    }
}
