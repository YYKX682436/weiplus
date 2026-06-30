package in2;

/* loaded from: classes10.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.s f292863d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(in2.s sVar) {
        super(0);
        this.f292863d = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        in2.s sVar = this.f292863d;
        ((mm2.m6) sVar.H.a(mm2.m6.class)).f329245m.postValue(java.lang.Boolean.TRUE);
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = sVar.P;
        if (mMSwitchBtn != null) {
            mMSwitchBtn.setCheck(true);
        }
        in2.n0 n0Var = sVar.A1;
        if (n0Var != null) {
            com.tencent.mm.plugin.finder.live.widget.e0.W(n0Var, sVar, false, 0, 6, null);
        }
        return jz5.f0.f302826a;
    }
}
