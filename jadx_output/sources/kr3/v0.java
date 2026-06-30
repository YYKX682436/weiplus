package kr3;

/* loaded from: classes8.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr3.q1 f311492d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(kr3.q1 q1Var) {
        super(0);
        this.f311492d = q1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f311492d.getIntent().getIntExtra("scroll_to", 0));
    }
}
