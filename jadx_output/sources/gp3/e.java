package gp3;

/* loaded from: classes9.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f274366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.order.model.MallTransactionObject f274367e;

    public e(gp3.k kVar, android.content.Context context, com.tencent.mm.plugin.order.model.MallTransactionObject mallTransactionObject) {
        this.f274366d = context;
        this.f274367e = mallTransactionObject;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f274366d;
        java.lang.String string = context.getString(com.tencent.mm.R.string.f492817hz4);
        android.content.Context context2 = this.f274366d;
        db5.e1.A(context, string, context2.getString(com.tencent.mm.R.string.f490539xy), context2.getString(com.tencent.mm.R.string.f492827i11), context2.getString(com.tencent.mm.R.string.f490347sg), new gp3.c(this), new gp3.d(this));
        yj0.a.h(this, "com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
