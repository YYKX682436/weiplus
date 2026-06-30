package id2;

/* loaded from: classes8.dex */
public final class l4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.s4 f290660d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(id2.s4 s4Var) {
        super(1);
        this.f290660d = s4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        id2.s4 s4Var = this.f290660d;
        if (booleanValue) {
            dk2.ef.C = false;
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LIVE_RECENT_WATCH_SETTING_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = s4Var.f290796d;
            if (mMSwitchBtn == null) {
                kotlin.jvm.internal.o.o("switchBtn");
                throw null;
            }
            mMSwitchBtn.setCheck(false);
        } else {
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = s4Var.f290796d;
            if (mMSwitchBtn2 == null) {
                kotlin.jvm.internal.o.o("switchBtn");
                throw null;
            }
            mMSwitchBtn2.setCheck(true);
        }
        return jz5.f0.f302826a;
    }
}
