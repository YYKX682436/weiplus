package kr3;

/* loaded from: classes11.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr3.q1 f311385d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(kr3.q1 q1Var) {
        super(0);
        this.f311385d = q1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kr3.q1 q1Var = this.f311385d;
        androidx.appcompat.app.AppCompatActivity activity = q1Var.getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            mMActivity.enableOptionMenu(q1Var.U6() && q1Var.S6());
        }
        return jz5.f0.f302826a;
    }
}
