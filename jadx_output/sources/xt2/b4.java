package xt2;

/* loaded from: classes3.dex */
public final class b4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.b5 f456635d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(xt2.b5 b5Var) {
        super(2);
        this.f456635d = b5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        xt2.b5 b5Var = this.f456635d;
        if (booleanValue) {
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = b5Var.f456639n;
            if (mMSwitchBtn == null) {
                kotlin.jvm.internal.o.o("askForPromoteSwitchBtn");
                throw null;
            }
            mMSwitchBtn.setCheck(booleanValue2);
        } else {
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = b5Var.f456639n;
            if (mMSwitchBtn2 == null) {
                kotlin.jvm.internal.o.o("askForPromoteSwitchBtn");
                throw null;
            }
            mMSwitchBtn2.setCheck(!booleanValue2);
            com.tencent.mm.ui.MMActivity mMActivity = b5Var.f456636h;
            db5.t7.g(mMActivity, mMActivity.getString(com.tencent.mm.R.string.f491780e75));
        }
        return jz5.f0.f302826a;
    }
}
