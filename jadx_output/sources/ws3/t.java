package ws3;

/* loaded from: classes9.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws3.y f449191d;

    public t(ws3.y yVar) {
        this.f449191d = yVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/form/MobileHistoryAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ws3.y yVar = this.f449191d;
        yVar.f449203m.dismissDropDown();
        com.tencent.mm.plugin.recharge.ui.form.MallFormView mallFormView = yVar.f449204n;
        if (mallFormView.L) {
            mallFormView.getContentEditText().clearFocus();
        } else {
            mallFormView.L = true;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/form/MobileHistoryAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
