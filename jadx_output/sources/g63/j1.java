package g63;

/* loaded from: classes.dex */
public final class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final g63.j1 f269132d = new g63.j1();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.gamelife.ui.TestUI.f141998h;
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiTest", "setChatSessionData, sessionId = S1_BgAAdQoEcfnVwzCiSbiVnB7BOg@gamelifesess, mask = 1, switch = false");
        new w53.f("S1_BgAAdQoEcfnVwzCiSbiVnB7BOg@gamelifesess", 1L, false).l();
        yj0.a.h(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
