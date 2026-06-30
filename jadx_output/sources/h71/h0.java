package h71;

/* loaded from: classes.dex */
public class h0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI f279392d;

    public h0(com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI securityAccountVerifyUI) {
        this.f279392d = securityAccountVerifyUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI securityAccountVerifyUI = this.f279392d;
        int intValue = ((java.lang.Integer) securityAccountVerifyUI.f73236g.getTag()).intValue();
        if (intValue <= 1) {
            securityAccountVerifyUI.f73238i.setVisibility(0);
            securityAccountVerifyUI.f73236g.setVisibility(8);
            return false;
        }
        int i17 = intValue - 1;
        securityAccountVerifyUI.f73236g.setTag(java.lang.Integer.valueOf(i17));
        securityAccountVerifyUI.f73236g.setText(securityAccountVerifyUI.getString(com.tencent.mm.R.string.f492912i80, java.lang.Integer.valueOf(i17)));
        if (securityAccountVerifyUI.f73236g.getVisibility() != 0) {
            securityAccountVerifyUI.f73236g.setVisibility(0);
        }
        return true;
    }
}
