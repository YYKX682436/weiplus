package gp3;

/* loaded from: classes9.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.order.model.MallTransactionObject f274383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gp3.s f274384e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.r f274385f;

    public m(gp3.n nVar, com.tencent.mm.plugin.order.model.MallTransactionObject mallTransactionObject, gp3.s sVar, com.tencent.mm.ui.base.preference.r rVar) {
        this.f274383d = mallTransactionObject;
        this.f274384e = sVar;
        this.f274385f = rVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/order/ui/preference/FetchOrderPrefFactory$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.order.model.MallTransactionObject mallTransactionObject = this.f274383d;
        sb6.append(mallTransactionObject.f152789n);
        sb6.append("\n");
        sb6.append(mallTransactionObject.f152790o);
        this.f274384e.M(sb6.toString());
        ((com.tencent.mm.ui.base.preference.h0) this.f274385f).notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/order/ui/preference/FetchOrderPrefFactory$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
