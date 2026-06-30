package ws3;

/* loaded from: classes5.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.form.InstantAutoCompleteTextView f449180d;

    public i(ws3.j jVar, com.tencent.mm.plugin.recharge.ui.form.InstantAutoCompleteTextView instantAutoCompleteTextView) {
        this.f449180d = instantAutoCompleteTextView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/form/MallCommonHintViewConfig$MobileConfigure$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f449180d.requestFocus();
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/form/MallCommonHintViewConfig$MobileConfigure$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
