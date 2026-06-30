package kr3;

/* loaded from: classes10.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr3.q0 f311488d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(kr3.q0 q0Var) {
        super(0);
        this.f311488d = q0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f311488d.getIntent().getIntExtra("Contact_Scene", 9));
    }
}
