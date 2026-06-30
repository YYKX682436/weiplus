package vi1;

/* loaded from: classes.dex */
public final class e1 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMSwitchBtn f437295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437297c;

    public e1(com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn, java.lang.String str, java.lang.String str2) {
        this.f437295a = mMSwitchBtn;
        this.f437296b = str;
        this.f437297c = str2;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PhoneNumberAddView", "onStatusChange, isChecked: " + z17);
        this.f437295a.setContentDescription(z17 ? this.f437296b : this.f437297c);
    }
}
