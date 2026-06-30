package fc4;

/* loaded from: classes3.dex */
public final class n implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f261187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fc4.p f261188e;

    public n(android.widget.LinearLayout linearLayout, fc4.p pVar) {
        this.f261187d = linearLayout;
        this.f261188e = pVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC$dealSecondCutJumpClick$1$2");
        this.f261187d.setBackground(i65.a.i(this.f261188e.getContext(), com.tencent.mm.R.drawable.d9c));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC$dealSecondCutJumpClick$1$2");
    }
}
