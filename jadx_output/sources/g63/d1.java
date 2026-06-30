package g63;

/* loaded from: classes.dex */
public final class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gamelife.ui.TestUI f269099d;

    public d1(com.tencent.mm.plugin.gamelife.ui.TestUI testUI) {
        this.f269099d = testUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.gamelife.ui.TestUI testUI = this.f269099d;
        java.util.LinkedList linkedList = new java.util.LinkedList(kz5.c0.i(testUI.f142000e, testUI.f141999d));
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiTest", "getChatUserInfo, userNameList = " + linkedList);
        new w53.d(linkedList).l();
        yj0.a.h(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
