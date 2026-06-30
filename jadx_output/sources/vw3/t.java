package vw3;

/* loaded from: classes10.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI f441112d;

    public t(com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI repairerBlockDetectUI) {
        this.f441112d = repairerBlockDetectUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerBlockDetectUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ix3.f fVar = ix3.i.f295434j;
        ix3.i b17 = fVar.b();
        b17.getClass();
        android.os.Looper.getMainLooper().setMessageLogging(null);
        b17.f295444h = false;
        boolean z17 = fVar.b().f295444h;
        int i17 = com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI.e;
        this.f441112d.V6(z17);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerBlockDetectUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
