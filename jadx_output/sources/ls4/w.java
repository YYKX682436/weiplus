package ls4;

/* loaded from: classes8.dex */
public final class w implements ns4.m1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f321105a;

    /* renamed from: b, reason: collision with root package name */
    public final js4.q f321106b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ref.WeakReference f321107c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f321108d;

    public w(com.tencent.mm.ui.MMActivity context, js4.q parameter, java.lang.ref.WeakReference delegate) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(parameter, "parameter");
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f321105a = context;
        this.f321106b = parameter;
        this.f321107c = delegate;
    }

    public final void a() {
        js4.q qVar = this.f321106b;
        java.lang.Object obj = qVar.f301560e;
        com.tencent.mm.ui.MMActivity context = this.f321105a;
        if (obj != null) {
            com.tencent.mars.xlog.Log.i("WeCoinEncashLogic", "jumpEncashInterceptor");
            java.lang.Object obj2 = qVar.f301560e;
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = obj2 instanceof com.tencent.mm.protocal.protobuf.FinderJumpInfo ? (com.tencent.mm.protocal.protobuf.FinderJumpInfo) obj2 : null;
            if (finderJumpInfo != null) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                kotlin.jvm.internal.o.g(context, "context");
                xc2.y2 y2Var = xc2.y2.f453343a;
                xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
                p0Var.f453252n = 0;
                xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("WeCoinEncashLogic", "gotoIncomeBalanceView: ");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView.class);
        intent.putExtra("wecoin_income_balance", qVar.f301557b);
        intent.putExtra("WECOIN_BUSINESS_ID", qVar.f301556a);
        intent.putExtra("WECOIN_ENCASH_SCENE", qVar.f301561f);
        intent.putExtra("WECOIN_ENCASH_BIZ_TYPE", qVar.f301562g);
        intent.putExtra("WECOIN_ENCASH_BIZ_ACCT_ID", qVar.f301563h);
        intent.putExtra("WECOIN_ENCASH_KEYBOARD_TIPS", qVar.f301564i);
        r45.ma7 ma7Var = qVar.f301558c;
        if (ma7Var != null) {
            intent.putExtra("WECOIN_TAX_CUT_ENTRANCE_INFO", ma7Var.toByteArray());
        }
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView.f179148v;
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView.f179148v = new java.lang.ref.WeakReference(this);
        com.tencent.mm.ui.MMActivity mMActivity = this.f321105a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mMActivity, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/logic/WeCoinEncashLogic", "gotoEnCashView", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mMActivity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mMActivity, "com/tencent/mm/plugin/wallet/wecoin/logic/WeCoinEncashLogic", "gotoEnCashView", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
