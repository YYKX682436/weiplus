package gp3;

/* loaded from: classes9.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.order.model.MallTransactionObject f274372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f274373e;

    public h(gp3.k kVar, com.tencent.mm.plugin.order.model.MallTransactionObject mallTransactionObject, android.content.Context context) {
        this.f274372d = mallTransactionObject;
        this.f274373e = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        com.tencent.mm.plugin.order.model.MallTransactionObject mallTransactionObject = this.f274372d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.C);
        android.content.Context context = this.f274373e;
        if (!K0) {
            linkedList2.add(0);
            linkedList.add(context.getString(com.tencent.mm.R.string.f493579kt3));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.D)) {
            linkedList2.add(1);
            linkedList.add(context.getString(com.tencent.mm.R.string.f493580kt4));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.N)) {
            linkedList2.add(2);
            linkedList.add(context.getString(com.tencent.mm.R.string.kt6));
        }
        if (linkedList2.size() == 1) {
            dp3.g.b(((java.lang.Integer) linkedList2.get(0)).intValue(), context, mallTransactionObject);
            yj0.a.h(this, "com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            db5.e1.d(this.f274373e, null, linkedList, linkedList2, null, true, new gp3.g(this));
            yj0.a.h(this, "com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
