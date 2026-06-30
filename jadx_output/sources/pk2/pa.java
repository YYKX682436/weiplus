package pk2;

/* loaded from: classes3.dex */
public final class pa extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356170i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356170i = "audience.more.morefunction.gifteffect";
    }

    public static final void w(pk2.o9 o9Var, com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn, boolean z17) {
        java.lang.String string = o9Var.f356078d.getString(com.tencent.mm.R.string.dhq);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.ui.MMActivity mMActivity = o9Var.f356078d;
        if (z17) {
            mMSwitchBtn.setContentDescription(mMActivity.getString(com.tencent.mm.R.string.efy, string));
        } else {
            mMSwitchBtn.setContentDescription(mMActivity.getString(com.tencent.mm.R.string.efx, string));
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356170i;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.tencent.mm.plugin.finder.view.e3 bottomSheet, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) bottomSheet.f131959f.findViewById(com.tencent.mm.R.id.nti);
        mMSwitchBtn.setCheck(!((mm2.c1) o9Var.c(mm2.c1.class)).f328894u5);
        pk2.f8.d(pk2.f8.f355747a, 4, 0, 2, 1, null, 16, null);
        w(o9Var, mMSwitchBtn, mMSwitchBtn.f211363x);
        mMSwitchBtn.setSwitchListener(new pk2.oa(o9Var, this, mMSwitchBtn));
    }

    @Override // qk2.d
    public java.lang.Integer u() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.id.grg);
    }
}
