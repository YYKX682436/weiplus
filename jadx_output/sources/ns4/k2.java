package ns4;

/* loaded from: classes8.dex */
public final class k2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView f339575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.kj5 f339576e;

    public k2(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView weCoinIncomeDetailView, r45.kj5 kj5Var) {
        this.f339575d = weCoinIncomeDetailView;
        this.f339576e = kj5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        r45.gs2 gs2Var;
        r45.gs2 gs2Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$updateClickButtonEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView weCoinIncomeDetailView = this.f339575d;
        ms4.t tVar = weCoinIncomeDetailView.f179176s;
        if (tVar == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        tVar.R6(2);
        r45.kj5 kj5Var = this.f339576e;
        if (kj5Var == null || kj5Var.f378766i != 1) {
            weCoinIncomeDetailView.V6();
            yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$updateClickButtonEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ms4.t tVar2 = weCoinIncomeDetailView.f179176s;
        if (tVar2 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        tVar2.R6(11);
        ms4.t tVar3 = weCoinIncomeDetailView.f179176s;
        if (tVar3 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        r45.v11 v11Var = tVar3.f331122t;
        int integer = (v11Var == null || (gs2Var2 = (r45.gs2) v11Var.getCustom(5)) == null) ? 0 : gs2Var2.getInteger(6);
        if (integer == 2) {
            kotlinx.coroutines.l.d(v65.m.b(weCoinIncomeDetailView), null, null, new ns4.j2(weCoinIncomeDetailView, null), 3, null);
        } else if (integer == 1) {
            ms4.t tVar4 = weCoinIncomeDetailView.f179176s;
            if (tVar4 == null) {
                kotlin.jvm.internal.o.o("mViewModel");
                throw null;
            }
            r45.v11 v11Var2 = tVar4.f331122t;
            if (v11Var2 == null || (gs2Var = (r45.gs2) v11Var2.getCustom(5)) == null || (str = gs2Var.getString(7)) == null) {
                str = "";
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinIncomeDetailView", "#openRealNameNewAuth, verifyUrl:".concat(str));
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("open_custom_style_url", true);
            intent.putExtra("forceHideShare", true);
            intent.putExtra("show_native_web_view", true);
            intent.putExtra("rawUrl", str);
            intent.putExtra("screen_orientation", 1);
            j45.l.n(weCoinIncomeDetailView, "webview", ".ui.tools.WebViewUI", intent, com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ALWAYS_RETURN_TRY_AGAIN);
        } else {
            java.util.Objects.toString(kj5Var);
            kotlinx.coroutines.l.d(v65.m.b(weCoinIncomeDetailView), null, null, new ns4.e2(weCoinIncomeDetailView, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$updateClickButtonEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
