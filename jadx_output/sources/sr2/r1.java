package sr2;

/* loaded from: classes3.dex */
public final class r1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.y2 f411693d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(sr2.y2 y2Var) {
        super(0);
        this.f411693d = y2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f411693d.getIntent().getIntExtra("KEY_ACTION_TYPE", 0));
    }
}
