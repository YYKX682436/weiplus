package zw1;

/* loaded from: classes8.dex */
public class l5 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ln f476714d;

    public l5(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, r45.ln lnVar) {
        this.f476714d = lnVar;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        java.lang.String str;
        java.util.Iterator it = this.f476714d.f379648e.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            r45.wf5 wf5Var = (r45.wf5) it.next();
            if (wf5Var != null && (str = wf5Var.f389135d) != null) {
                g4Var.f(i17, str);
                i17++;
            }
        }
    }
}
