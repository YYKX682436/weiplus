package gc0;

/* loaded from: classes3.dex */
public final class n1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f270228d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(gc0.p2 p2Var) {
        super(0);
        this.f270228d = p2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f270228d.getIntent().getIntExtra("Contact_Scene", 9));
    }
}
