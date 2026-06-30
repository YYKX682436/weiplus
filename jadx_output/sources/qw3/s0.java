package qw3;

/* loaded from: classes9.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f367201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI f367202e;

    public s0(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI bankRemitMoneyInputUI, int i17) {
        this.f367202e = bankRemitMoneyInputUI;
        this.f367201d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f367202e.f156518i.scrollBy(0, this.f367201d);
    }
}
