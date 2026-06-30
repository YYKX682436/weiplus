package db5;

/* loaded from: classes13.dex */
public final class x9 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.WeAgreementCheckBox f228574a;

    public x9(com.tencent.mm.ui.base.WeAgreementCheckBox weAgreementCheckBox) {
        this.f228574a = weAgreementCheckBox;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        kotlin.jvm.internal.o.g(compoundButton, "<anonymous parameter 0>");
        db5.t9 t9Var = this.f228574a.f197733e;
        if (t9Var != null) {
            int i17 = com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.Y;
            ((com.tencent.mm.plugin.account.ui.jf) t9Var).f73961a.V6();
        }
    }
}
