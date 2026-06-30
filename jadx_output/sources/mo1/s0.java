package mo1;

/* loaded from: classes5.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI f330333d;

    public s0(com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI roamLiteTaskDetailUI) {
        this.f330333d = roamLiteTaskDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/roamlite/RoamLiteTaskDetailUI$updateStatus$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI roamLiteTaskDetailUI = this.f330333d;
        com.tencent.wechat.aff.affroam.g gVar = roamLiteTaskDetailUI.f92714e;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("pkgInfo");
            throw null;
        }
        roamLiteTaskDetailUI.Z6(gVar, kz5.p0.f313996d);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/roamlite/RoamLiteTaskDetailUI$updateStatus$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
