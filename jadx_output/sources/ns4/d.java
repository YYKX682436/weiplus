package ns4;

/* loaded from: classes8.dex */
public final class d extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f339488d;

    /* renamed from: e, reason: collision with root package name */
    public int f339489e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f339490f;

    /* renamed from: g, reason: collision with root package name */
    public long f339491g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f339492h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ns4.s f339493i;

    public d(ns4.s sVar) {
        this.f339493i = sVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.ArrayList arrayList = this.f339488d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        ns4.s sVar;
        ns4.a holder = (ns4.a) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.ArrayList arrayList = this.f339488d;
        if (arrayList != null) {
            int size = arrayList.size();
            ns4.s sVar2 = this.f339493i;
            if (i17 < size) {
                java.lang.Object obj = arrayList.get(i17);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                r45.ja7 ja7Var = (r45.ja7) obj;
                boolean z17 = sVar2.f339641f;
                android.widget.TextView textView = holder.f339427g;
                android.widget.TextView textView2 = holder.f339426f;
                androidx.fragment.app.FragmentActivity fragmentActivity = sVar2.f339636a;
                if (z17) {
                    textView2.setTextColor(fragmentActivity.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
                    textView.setTextColor(fragmentActivity.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
                }
                boolean z18 = this.f339490f;
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = holder.f339428h;
                if (z18 && i17 == 2) {
                    weImageView.setVisibility(8);
                    textView2.setTextSize(1, 17.0f);
                    java.lang.String string = fragmentActivity.getString(com.tencent.mm.R.string.l9r);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    sVar = sVar2;
                    java.lang.String string2 = fragmentActivity.getString(com.tencent.mm.R.string.l9o, java.lang.String.valueOf(this.f339491g / 100));
                    kotlin.jvm.internal.o.f(string2, "getString(...)");
                    textView2.setText(string);
                    textView2.setContentDescription(string);
                    textView.setText(string2);
                    android.view.View view = holder.f339429i;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(4);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    sVar = sVar2;
                    weImageView.setVisibility(0);
                    textView2.setTextSize(1, 24.0f);
                    textView2.setText(java.lang.String.valueOf(ja7Var.f377680e));
                    textView2.setContentDescription(fragmentActivity.getString(com.tencent.mm.R.string.l99, java.lang.String.valueOf(ja7Var.f377680e)));
                    java.lang.String string3 = fragmentActivity.getString(com.tencent.mm.R.string.l_1, java.lang.String.valueOf(com.tencent.mm.wallet_core.ui.r1.i("" + ja7Var.f377681f, "100", 0, java.math.RoundingMode.CEILING).longValue()));
                    kotlin.jvm.internal.o.f(string3, "getString(...)");
                    textView.setText(string3);
                    ja7Var.f377683h = false;
                    android.view.View view2 = holder.f339429i;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList3.add(4);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view3 = holder.f339424d;
                dy1.a.c(view3);
                dy1.a.i(view3, "pay_coin_view");
                jz5.l[] lVarArr = new jz5.l[7];
                java.lang.String str = ja7Var.f377679d;
                lVarArr[0] = new jz5.l("product_id", str != null ? str : "");
                lVarArr[1] = new jz5.l("wecoin_count", java.lang.Integer.valueOf(ja7Var.f377680e));
                lVarArr[2] = new jz5.l(ya.b.PRICE, java.lang.Integer.valueOf(ja7Var.f377681f));
                lVarArr[3] = new jz5.l("discount_wecoin_count", java.lang.Integer.valueOf(ja7Var.f377682g));
                lVarArr[4] = new jz5.l("new_user_discount", java.lang.Boolean.valueOf(ja7Var.f377683h));
                lVarArr[5] = new jz5.l("coin_report_session_id", js4.r.f301567c);
                lVarArr[6] = new jz5.l("coin_business_id", java.lang.Integer.valueOf(js4.r.f301565a));
                dy1.a.k(view3, kz5.c1.l(lVarArr));
                dy1.a.l(view3, 40, 25955);
            } else {
                sVar = sVar2;
            }
            ns4.s sVar3 = sVar;
            ns4.c cVar = new ns4.c(sVar3, this, holder);
            if (this.f339489e <= 0) {
                android.view.View view4 = sVar3.f339644i;
                if (view4 == null) {
                    kotlin.jvm.internal.o.o("mCustomView");
                    throw null;
                }
                if (view4.getWidth() <= 0) {
                    android.view.View view5 = sVar3.f339644i;
                    if (view5 != null) {
                        view5.post(new ns4.b(cVar));
                        return;
                    } else {
                        kotlin.jvm.internal.o.o("mCustomView");
                        throw null;
                    }
                }
            }
            cVar.invoke();
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f339493i.f339636a).inflate(com.tencent.mm.R.layout.f488255o9, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new ns4.a(this, inflate);
    }
}
