package qw3;

/* loaded from: classes9.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI f367188d;

    public p(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI) {
        this.f367188d = bankRemitBankcardInputUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f367188d.showVKB();
    }
}
