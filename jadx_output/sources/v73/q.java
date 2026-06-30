package v73;

/* loaded from: classes8.dex */
public class q extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI f433732d;

    public q(com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI honeyPayCardManagerUI, v73.m mVar) {
        this.f433732d = honeyPayCardManagerUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f433732d.F.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (r45.v55) this.f433732d.F.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI honeyPayCardManagerUI = this.f433732d;
        if (view == null) {
            view2 = android.view.LayoutInflater.from(honeyPayCardManagerUI.getContext()).inflate(com.tencent.mm.R.layout.bjn, viewGroup, false);
            v73.r rVar = new v73.r(honeyPayCardManagerUI, null);
            rVar.f433734a = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.h2k);
            com.tencent.mm.wallet_core.ui.WalletTextView walletTextView = (com.tencent.mm.wallet_core.ui.WalletTextView) view2.findViewById(com.tencent.mm.R.id.h2i);
            rVar.f433735b = walletTextView;
            walletTextView.b();
            rVar.f433736c = view2.findViewById(com.tencent.mm.R.id.h2j);
            view2.setTag(rVar);
        } else {
            view2 = view;
        }
        r45.v55 v55Var = (r45.v55) honeyPayCardManagerUI.F.get(i17);
        v73.r rVar2 = (v73.r) view2.getTag();
        rVar2.f433734a.setText(v55Var.f387917d);
        rVar2.f433735b.setText(u73.h.a(v55Var.f387918e));
        if (rVar2.f433737d.F.size() == 1) {
            android.view.View view3 = rVar2.f433736c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI$SettingViewHolder", "setCreditLine", "(Lcom/tencent/mm/protocal/protobuf/PayCreditLine;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI$SettingViewHolder", "setCreditLine", "(Lcom/tencent/mm/protocal/protobuf/PayCreditLine;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view4 = rVar2.f433736c;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI$SettingViewHolder", "setCreditLine", "(Lcom/tencent/mm/protocal/protobuf/PayCreditLine;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI$SettingViewHolder", "setCreditLine", "(Lcom/tencent/mm/protocal/protobuf/PayCreditLine;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i17) {
        return !com.tencent.mm.sdk.platformtools.t8.K0(((r45.v55) this.f433732d.F.get(i17)).f387919f);
    }
}
