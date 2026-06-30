package wo1;

/* loaded from: classes5.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.a f447989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f447990e;

    public m0(com.tencent.mm.plugin.backup.roambackup.a aVar, com.tencent.wechat.aff.affroam.g gVar) {
        this.f447989d = aVar;
        this.f447990e = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onExtState$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onExtState] remove extState=");
        sb6.append(this.f447989d);
        sb6.append(", pkgId=");
        com.tencent.wechat.aff.affroam.g gVar = this.f447990e;
        sb6.append(gVar.f215829d);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseTaskStatusView", sb6.toString());
        com.tencent.mm.plugin.backup.roambackup.b.f92568a.b(gVar.f215829d);
        com.tencent.mm.plugin.backup.roambackup.r0.f92684a.q(gVar.f215829d);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onExtState$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
