package gp3;

/* loaded from: classes9.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f274374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.order.model.MallTransactionObject f274375e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gp3.k f274376f;

    public i(gp3.k kVar, android.content.Context context, com.tencent.mm.plugin.order.model.MallTransactionObject mallTransactionObject) {
        this.f274376f = kVar;
        this.f274374d = context;
        this.f274375e = mallTransactionObject;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.order.model.MallTransactionObject mallTransactionObject = this.f274375e;
        gp3.k.b(this.f274376f, this.f274374d, mallTransactionObject.N, mallTransactionObject);
        yj0.a.h(this, "com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
