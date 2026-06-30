package g63;

/* loaded from: classes.dex */
public final class e1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gamelife.ui.TestUI f269103d;

    public e1(com.tencent.mm.plugin.gamelife.ui.TestUI testUI) {
        this.f269103d = testUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String userName = this.f269103d.f141999d;
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiTest", "getBlackList, userName = ".concat(userName));
        new w53.a(userName).l();
        yj0.a.h(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
