package df2;

/* loaded from: classes3.dex */
public final class ck extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pk f229888d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck(df2.pk pkVar) {
        super(3);
        this.f229888d = pkVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        jz5.f0 f0Var;
        java.lang.String string;
        r45.ma0 ma0Var = (r45.ma0) obj;
        java.lang.String selectKey = (java.lang.String) obj2;
        ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(selectKey, "selectKey");
        df2.pk pkVar = this.f229888d;
        ce2.i iVar = pkVar.f231072J;
        r45.na0 D0 = iVar != null ? iVar.D0() : null;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (ma0Var == null || (string = ma0Var.getString(4)) == null) {
            f0Var = null;
        } else {
            ma0Var.set(2, selectKey);
            com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView = pkVar.f231079s;
            if (magicRewardView != null) {
                magicRewardView.j(string, selectKey);
            }
            pkVar.f7("onCustomerSelectComponent");
            f0Var = f0Var2;
        }
        java.lang.String str = pkVar.f231073m;
        if (f0Var == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCustomerSelectComponent but ");
            sb6.append(pm0.b0.g(ma0Var == null ? "" : ma0Var));
            sb6.append(" component_key is null");
            com.tencent.mars.xlog.Log.e(str, sb6.toString());
        }
        boolean Z6 = pkVar.Z6("", pkVar.I, pkVar.f231072J);
        boolean a76 = pkVar.a7(pkVar.I, pkVar.f231072J);
        android.widget.TextView textView = pkVar.f231078r;
        if (textView != null) {
            textView.setEnabled(Z6 || a76);
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onCustomerSelectComponent key:");
        sb7.append(selectKey);
        sb7.append(",component:");
        sb7.append(ma0Var);
        sb7.append(", componentChange:");
        sb7.append(Z6);
        sb7.append(",customGiftTextChange:");
        sb7.append(a76);
        sb7.append(", new customComponentList:");
        sb7.append(pkVar.b7(D0 != null ? D0.getList(0) : null));
        sb7.append(" customText:");
        sb7.append(D0 != null ? (r45.pa0) D0.getCustom(1) : null);
        com.tencent.mars.xlog.Log.i(str, sb7.toString());
        return f0Var2;
    }
}
