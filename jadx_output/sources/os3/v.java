package os3;

/* loaded from: classes8.dex */
public class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.ComposeUI f348220d;

    public v(com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI) {
        this.f348220d = composeUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/ComposeUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI = this.f348220d;
        db5.e1.e(composeUI, null, new java.lang.String[]{composeUI.getString(com.tencent.mm.R.string.hjx), composeUI.getString(com.tencent.mm.R.string.hju), composeUI.getString(com.tencent.mm.R.string.hjv)}, null, new os3.u(this));
        yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/ComposeUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
