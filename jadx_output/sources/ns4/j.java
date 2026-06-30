package ns4;

/* loaded from: classes8.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.s f339551d;

    public j(ns4.s sVar) {
        this.f339551d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$initHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ns4.s sVar = this.f339551d;
        sVar.f339640e.P6();
        ((q30.k) ((r30.p) i95.n0.c(r30.p.class))).Ai();
        if (sVar.f339637b.f301551i != null) {
            sVar.f339647l = true;
            ns4.v vVar = sVar.f339639d;
            if (vVar == null) {
                kotlin.jvm.internal.o.o("buyCoinView");
                throw null;
            }
            vVar.h();
        } else {
            com.tencent.mm.ui.widget.dialog.y1 y1Var = sVar.f339638c;
            if (y1Var == null) {
                kotlin.jvm.internal.o.o("mBottomSheet");
                throw null;
            }
            y1Var.q();
        }
        js4.j jVar = sVar.f339648m;
        if (jVar != null) {
            jVar.a(sVar, java.lang.Boolean.TRUE);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$initHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
