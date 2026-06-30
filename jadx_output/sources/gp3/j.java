package gp3;

/* loaded from: classes9.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f274377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.order.model.MallTransactionObject f274378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gp3.k f274379f;

    public j(gp3.k kVar, android.content.Context context, com.tencent.mm.plugin.order.model.MallTransactionObject mallTransactionObject) {
        this.f274379f = kVar;
        this.f274377d = context;
        this.f274378e = mallTransactionObject;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getTag() instanceof com.tencent.mm.plugin.order.model.MallOrderDetailObject$HelpCenter) {
            gp3.k.b(this.f274379f, this.f274377d, ((com.tencent.mm.plugin.order.model.MallOrderDetailObject$HelpCenter) view.getTag()).f152778e, this.f274378e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
