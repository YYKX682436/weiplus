package ec3;

/* loaded from: classes9.dex */
public final class l extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public boolean f251046d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f251047e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public static void O6(ec3.l lVar, yz5.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            aVar = null;
        }
        androidx.appcompat.app.AppCompatActivity activity = lVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ((ec3.g1) zVar.a(activity).a(ec3.g1.class)).findViewById(com.tencent.mm.R.id.udo);
        boolean z17 = relativeLayout != null && relativeLayout.getVisibility() == 0;
        androidx.appcompat.app.AppCompatActivity activity2 = lVar.getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        boolean O6 = ((ec3.g1) zVar.a(activity2).a(ec3.g1.class)).O6();
        androidx.appcompat.app.AppCompatActivity activity3 = lVar.getActivity();
        kotlin.jvm.internal.o.g(activity3, "activity");
        boolean z18 = ((ec3.g1) zVar.a(activity3).a(ec3.g1.class)).f251020q;
        if (!O6 && z18) {
            if (!z17) {
                androidx.appcompat.app.AppCompatActivity activity4 = lVar.getActivity();
                kotlin.jvm.internal.o.g(activity4, "activity");
                ((ec3.g1) zVar.a(activity4).a(ec3.g1.class)).V6();
            }
            ec3.r1.f251087a.c((android.widget.RelativeLayout) lVar.findViewById(com.tencent.mm.R.id.udp), ec3.m.f251052f, lVar.getActivity(), new ec3.e(aVar));
            if (lVar.f251046d) {
                return;
            }
            lVar.f251046d = true;
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[12];
            objArr[0] = 11;
            objArr[1] = 0;
            androidx.appcompat.app.AppCompatActivity activity5 = lVar.getActivity();
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = activity5 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity5 : null;
            objArr[2] = luckyMoneyNewPrepareUI != null ? luckyMoneyNewPrepareUI.T1 : null;
            androidx.appcompat.app.AppCompatActivity activity6 = lVar.getActivity();
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI2 = activity6 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity6 : null;
            objArr[3] = luckyMoneyNewPrepareUI2 != null ? luckyMoneyNewPrepareUI2.s7() : null;
            objArr[4] = lVar.f251047e;
            objArr[5] = "";
            androidx.appcompat.app.AppCompatActivity activity7 = lVar.getActivity();
            kotlin.jvm.internal.o.g(activity7, "activity");
            objArr[6] = ((ec3.g1) zVar.a(activity7).a(ec3.g1.class)).Z6();
            objArr[7] = 0;
            objArr[8] = "";
            objArr[9] = 0;
            objArr[10] = "";
            objArr[11] = 0;
            g0Var.d(18890, objArr);
        }
    }
}
