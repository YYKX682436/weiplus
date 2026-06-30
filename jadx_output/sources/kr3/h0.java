package kr3;

/* loaded from: classes11.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr3.q0 f311384d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(kr3.q0 q0Var) {
        super(0);
        this.f311384d = q0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kr3.q0 q0Var = this.f311384d;
        androidx.appcompat.app.AppCompatActivity activity = q0Var.getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            mMActivity.enableOptionMenu(q0Var.U6() && q0Var.S6());
        }
        return jz5.f0.f302826a;
    }
}
