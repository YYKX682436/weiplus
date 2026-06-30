package kr3;

/* loaded from: classes8.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr3.j f311383d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(kr3.j jVar) {
        super(0);
        this.f311383d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f311383d.getIntent().getStringExtra("Contact_User");
    }
}
