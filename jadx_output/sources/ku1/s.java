package ku1;

/* loaded from: classes15.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f312141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ku1.v f312142e;

    public s(ku1.v vVar, android.view.ViewGroup viewGroup) {
        this.f312142e = vVar;
        this.f312141d = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        ku1.v vVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.ViewGroup viewGroup = this.f312141d;
        android.widget.Button button = (android.widget.Button) viewGroup.findViewById(com.tencent.mm.R.id.c08);
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.c0o);
        if (button.getVisibility() == 0 && findViewById.getVisibility() == 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int visibility = findViewById.getVisibility();
        ku1.v vVar2 = this.f312142e;
        if (visibility != 0) {
            str = "(Landroid/view/View;)V";
            vVar = vVar2;
        } else {
            if (!lu1.a0.x(vVar2.f312131b.getContext())) {
                com.tencent.mm.ui.MMActivity mMActivity = vVar2.f312131b;
                lu1.r.e(mMActivity, mMActivity.getString(com.tencent.mm.R.string.ase), false);
                yj0.a.h(this, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            str = "(Landroid/view/View;)V";
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.c0m);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            vVar = vVar2;
        }
        vVar.f312130a.l(lu1.e.CARDCODEREFRESHACTION_DOREFRESH);
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$1", "android/view/View$OnClickListener", "onClick", str);
    }
}
