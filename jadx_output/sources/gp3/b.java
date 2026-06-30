package gp3;

/* loaded from: classes9.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.order.model.MallTransactionObject f274362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gp3.s f274363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.r f274364f;

    public b(gp3.k kVar, com.tencent.mm.plugin.order.model.MallTransactionObject mallTransactionObject, gp3.s sVar, com.tencent.mm.ui.base.preference.r rVar) {
        this.f274362d = mallTransactionObject;
        this.f274363e = sVar;
        this.f274364f = rVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.order.model.MallTransactionObject mallTransactionObject = this.f274362d;
        sb6.append(mallTransactionObject.f152789n);
        sb6.append("\n");
        sb6.append(mallTransactionObject.f152790o);
        this.f274363e.M(sb6.toString());
        ((com.tencent.mm.ui.base.preference.h0) this.f274364f).notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
