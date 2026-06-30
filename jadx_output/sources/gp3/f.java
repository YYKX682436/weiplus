package gp3;

/* loaded from: classes9.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f274368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.order.model.MallTransactionObject f274369e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gp3.k f274370f;

    public f(gp3.k kVar, android.graphics.Bitmap bitmap, com.tencent.mm.plugin.order.model.MallTransactionObject mallTransactionObject) {
        this.f274370f = kVar;
        this.f274368d = bitmap;
        this.f274369e = mallTransactionObject;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gp3.k kVar = this.f274370f;
        com.tencent.mm.wallet_core.ui.w wVar = kVar.f274380a;
        if (wVar != null) {
            wVar.f214249e = this.f274369e.f152804y;
            android.graphics.Bitmap bitmap = this.f274368d;
            wVar.f214246b = bitmap;
            wVar.f214247c = bitmap;
            db5.d5 d5Var = wVar.f214252h;
            if (d5Var != null && d5Var.isShowing()) {
                wVar.d();
            }
            kVar.f274380a.c(view, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
