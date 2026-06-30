package kf3;

/* loaded from: classes5.dex */
public class f1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.masssend.ui.MassSendMsgUI f307343d;

    public f1(com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI) {
        this.f307343d = massSendMsgUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/masssend/ui/MassSendMsgUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.masssend.ui.MassSendMsgUI.T6(this.f307343d);
        yj0.a.h(this, "com/tencent/mm/plugin/masssend/ui/MassSendMsgUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
