package kl2;

/* loaded from: classes3.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl2.e0 f308828d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(kl2.e0 e0Var) {
        super(1);
        this.f308828d = e0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            kl2.e0 e0Var = this.f308828d;
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = e0Var.f308764g;
            if (mMSwitchBtn == null) {
                kotlin.jvm.internal.o.o("switchBtn");
                throw null;
            }
            mMSwitchBtn.setCheck(false);
            kl2.e0.a(e0Var, false);
        }
        return jz5.f0.f302826a;
    }
}
