package g63;

/* loaded from: classes.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gamelife.ui.TestUI f269180d;

    public w0(com.tencent.mm.plugin.gamelife.ui.TestUI testUI) {
        this.f269180d = testUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(qx.e0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        int i17 = com.tencent.mm.plugin.gamelife.ui.TestUI.f141998h;
        com.tencent.mm.plugin.gamelife.ui.TestUI testUI = this.f269180d;
        ((gm0.n) com.tencent.mm.modelbase.z2.f70847b).f273260a.f273288b.g(((px.c) ((qx.e0) c17)).Ai(3, "S1_BgAAdQoEcfnVwzCiSbiVnB7BOg@gamelifesess", testUI.f142000e, testUI.f141999d, "this is the first gamelife text", -1L));
        yj0.a.h(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
