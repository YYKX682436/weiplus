package id2;

/* loaded from: classes8.dex */
public final class m4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.s4 f290675d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(id2.s4 s4Var) {
        super(1);
        this.f290675d = s4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            dk2.ef.C = true;
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LIVE_RECENT_WATCH_SETTING_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f290675d.f290796d;
            if (mMSwitchBtn == null) {
                kotlin.jvm.internal.o.o("switchBtn");
                throw null;
            }
            mMSwitchBtn.setCheck(true);
        }
        return jz5.f0.f302826a;
    }
}
