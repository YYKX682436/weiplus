package g63;

/* loaded from: classes.dex */
public final class f1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gamelife.ui.TestUI f269114d;

    public f1(com.tencent.mm.plugin.gamelife.ui.TestUI testUI) {
        this.f269114d = testUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.gamelife.ui.TestUI testUI = this.f269114d;
        java.lang.String userName = testUI.f141999d;
        boolean z17 = testUI.f142001f;
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiTest", "setBlackList, userName = " + userName + ", swith = " + z17 + ", associateWxGameAccount = false");
        new w53.e(userName, z17, false).l();
        testUI.f142001f = testUI.f142001f ^ true;
        yj0.a.h(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
