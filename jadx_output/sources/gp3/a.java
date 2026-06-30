package gp3;

/* loaded from: classes9.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.order.model.MallTransactionObject f274360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f274361e;

    public a(gp3.k kVar, com.tencent.mm.plugin.order.model.MallTransactionObject mallTransactionObject, android.content.Context context) {
        this.f274360d = mallTransactionObject;
        this.f274361e = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.order.model.MallTransactionObject mallTransactionObject = this.f274360d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.C)) {
            com.tencent.mm.wallet_core.ui.r1.a0(this.f274361e, mallTransactionObject.C);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
