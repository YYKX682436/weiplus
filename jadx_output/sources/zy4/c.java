package zy4;

/* loaded from: classes15.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.welab.ui.WelabAppInfoUI f477675d;

    public c(com.tencent.mm.plugin.welab.ui.WelabAppInfoUI welabAppInfoUI) {
        this.f477675d = welabAppInfoUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/welab/ui/WelabAppInfoUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("open func ");
        com.tencent.mm.plugin.welab.ui.WelabAppInfoUI welabAppInfoUI = this.f477675d;
        sb6.append(welabAppInfoUI.f188082d);
        com.tencent.mars.xlog.Log.i("WelabAppInfoUI", sb6.toString());
        sy4.m mVar = sy4.m.f413884c;
        java.lang.String str = welabAppInfoUI.f188082d;
        uy4.w e17 = mVar.e(str);
        if (e17 != null) {
            com.tencent.mars.xlog.Log.i("WelabMgr", "use custome opener to open " + str);
            e17.Wc(welabAppInfoUI, str);
        } else {
            com.tencent.mars.xlog.Log.i("WelabMgr", "use default opener open " + str);
            if (mVar.b(str).field_Type == 2) {
                uy4.w wVar = mVar.f413885a;
                if (wVar != null) {
                    wVar.Wc(welabAppInfoUI, str);
                } else {
                    com.tencent.mars.xlog.Log.e("WelabMgr", "defaultWeAppOpener is null!");
                }
            } else {
                com.tencent.mars.xlog.Log.e("WelabMgr", "can not find opener for " + str);
            }
        }
        sy4.r.a(welabAppInfoUI.f188082d, 7, welabAppInfoUI.f188085g);
        yj0.a.h(this, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
