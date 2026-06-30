package p61;

/* loaded from: classes14.dex */
public class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI f352216d;

    public b0(com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI bindLinkedInUI) {
        this.f352216d = bindLinkedInUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI bindLinkedInUI = this.f352216d;
        db5.e1.u(bindLinkedInUI, bindLinkedInUI.getString(com.tencent.mm.R.string.beg), null, new p61.z(this), new p61.a0(this));
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
