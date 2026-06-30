package id2;

/* loaded from: classes3.dex */
public final class u4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.f5 f290828d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(id2.f5 f5Var) {
        super(1);
        this.f290828d = f5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            id2.f5 f5Var = this.f290828d;
            id2.f5.O6(f5Var, false);
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = f5Var.f290567d;
            if (mMSwitchBtn == null) {
                kotlin.jvm.internal.o.o("switchBtn");
                throw null;
            }
            mMSwitchBtn.setCheck(false);
        }
        return jz5.f0.f302826a;
    }
}
