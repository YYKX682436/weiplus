package xb3;

/* loaded from: classes9.dex */
public class j implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI f452905d;

    public j(com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI) {
        this.f452905d = luckyMoneyHKReceiveUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI = this.f452905d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = luckyMoneyHKReceiveUI.f145147u;
        if (u3Var != null && u3Var.isShowing()) {
            luckyMoneyHKReceiveUI.f145147u.dismiss();
        }
        luckyMoneyHKReceiveUI.A.j();
        luckyMoneyHKReceiveUI.finish();
    }
}
