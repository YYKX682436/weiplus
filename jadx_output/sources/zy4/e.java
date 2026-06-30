package zy4;

/* loaded from: classes8.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.welab.ui.WelabAppInfoUI f477677d;

    public e(com.tencent.mm.plugin.welab.ui.WelabAppInfoUI welabAppInfoUI) {
        this.f477677d = welabAppInfoUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/welab/ui/WelabAppInfoUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String obj = view.getTag().toString();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("nowUrl", obj);
        com.tencent.mm.plugin.welab.ui.WelabAppInfoUI welabAppInfoUI = this.f477677d;
        intent.putExtra("urlList", (java.lang.String[]) ((zy4.f) welabAppInfoUI.f188089n.getAdapter()).f477678d.toArray(new java.lang.String[0]));
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtras(intent.getExtras());
        if (intent.getFlags() != 0) {
            intent2.addFlags(intent.getFlags());
        }
        j45.l.j(welabAppInfoUI, "subapp", ".ui.gallery.GestureGalleryUI", intent2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
