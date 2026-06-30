package db5;

/* loaded from: classes13.dex */
public final class y9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.WeAgreementCheckBox f228589d;

    public y9(com.tencent.mm.ui.base.WeAgreementCheckBox weAgreementCheckBox) {
        this.f228589d = weAgreementCheckBox;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int height = com.tencent.mm.ui.base.WeAgreementCheckBox.f197731o - this.f228589d.getHeight();
        if (height > 0) {
            int i17 = height / 2;
            com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.INSTANCE.expand(this.f228589d, 0, i17, 0, i17, true);
        }
    }
}
