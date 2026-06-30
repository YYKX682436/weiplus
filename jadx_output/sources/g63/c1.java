package g63;

/* loaded from: classes.dex */
public final class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gamelife.ui.TestUI f269097d;

    public c1(com.tencent.mm.plugin.gamelife.ui.TestUI testUI) {
        this.f269097d = testUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.gamelife.ui.TestUI testUI = this.f269097d;
        java.lang.String fromUserName = testUI.f142000e;
        java.lang.String toUserName = testUI.f141999d;
        kotlin.jvm.internal.o.g(fromUserName, "fromUserName");
        kotlin.jvm.internal.o.g(toUserName, "toUserName");
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiTest", "getChatSessionId, fromUsrName = " + fromUserName + " , toUserName = " + toUserName);
        new w53.c(fromUserName, toUserName, 0, null).l();
        yj0.a.h(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
