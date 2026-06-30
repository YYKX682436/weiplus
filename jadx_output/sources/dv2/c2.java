package dv2;

/* loaded from: classes2.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dv2.e2 f243828d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(dv2.e2 e2Var) {
        super(0);
        this.f243828d = e2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f243828d.getIntent().getIntExtra("report_scene", 0));
    }
}
