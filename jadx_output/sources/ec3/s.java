package ec3;

/* loaded from: classes9.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f251088d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ec3.g1 g1Var) {
        super(0);
        this.f251088d = g1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ec3.g1 g1Var = this.f251088d;
        g1Var.getClass();
        androidx.appcompat.app.AppCompatActivity activity = g1Var.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity : null;
        android.widget.RelativeLayout relativeLayout = luckyMoneyNewPrepareUI != null ? luckyMoneyNewPrepareUI.f146291z : null;
        float b17 = i65.a.b(g1Var.getContext(), 8);
        if (relativeLayout != null) {
            relativeLayout.setOutlineProvider(new zl5.a(true, true, b17));
        }
        if (relativeLayout != null) {
            relativeLayout.setClipToOutline(true);
        }
        return jz5.f0.f302826a;
    }
}
