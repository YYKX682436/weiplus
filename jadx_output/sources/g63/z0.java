package g63;

/* loaded from: classes8.dex */
public final class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gamelife.ui.TestUI f269186d;

    public z0(com.tencent.mm.plugin.gamelife.ui.TestUI testUI) {
        this.f269186d = testUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        z53.t Ui = ((t53.m0) i95.n0.c(t53.m0.class)).Ui();
        for (int i17 = 0; i17 < 51; i17++) {
            z53.i iVar = new z53.i();
            iVar.field_sessionId = "test" + i17;
            iVar.field_digest = "digest" + i17;
            iVar.field_updateTime = java.lang.System.currentTimeMillis();
            iVar.field_talker = "talker" + i17;
            iVar.field_selfUserName = this.f269186d.f142000e;
            Ui.insert(iVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
