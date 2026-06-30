package ns4;

/* loaded from: classes8.dex */
public final class r implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.s f339627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.js3 f339628e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f339629f;

    public r(ns4.s sVar, r45.js3 js3Var, java.util.ArrayList arrayList) {
        this.f339627d = sVar;
        this.f339628e = js3Var;
        this.f339629f = arrayList;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$updatePriceItem$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        ns4.s sVar = this.f339627d;
        ns4.d dVar = sVar.f339643h;
        if (dVar == null) {
            kotlin.jvm.internal.o.o("mSecondAdapter");
            throw null;
        }
        if (dVar.f339490f && i17 == 2) {
            android.view.View view2 = sVar.f339644i;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("mCustomView");
                throw null;
            }
            if (((android.widget.CheckBox) view2.findViewById(com.tencent.mm.R.id.lmb)).isChecked()) {
                ns4.p0 p0Var = new ns4.p0(sVar.f339636a, new ns4.r0(this.f339628e.f378089h.f375993f, sVar.f339641f, new ns4.i(sVar)));
                p0Var.f339615h.f();
                p0Var.f339610c.C();
                com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = p0Var.f339613f;
                if (walletFormView == null) {
                    kotlin.jvm.internal.o.o("inputArea");
                    throw null;
                }
                walletFormView.post(new ns4.o0(p0Var));
            } else {
                sVar.b();
            }
        } else {
            java.lang.Object obj = this.f339629f.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            ns4.s.a(sVar, (r45.ja7) obj);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$updatePriceItem$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
