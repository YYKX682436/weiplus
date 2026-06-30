package g63;

/* loaded from: classes.dex */
public final class h1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final g63.h1 f269122d = new g63.h1();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.gamelife.ui.TestUI.f141998h;
        java.util.LinkedList linkedList = new java.util.LinkedList(kz5.b0.c("S1_BgAAdQoEcfnVwzCiSbiVnB7BOg@gamelifesess"));
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiTest", "getSessionData, sesseionIdList = " + linkedList);
        new w53.b(linkedList).l();
        yj0.a.h(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
