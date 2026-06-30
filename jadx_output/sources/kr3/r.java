package kr3;

/* loaded from: classes8.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr3.t f311470d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(kr3.t tVar) {
        super(0);
        this.f311470d = tVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f311470d.getIntent().getStringExtra("Contact_User");
    }
}
