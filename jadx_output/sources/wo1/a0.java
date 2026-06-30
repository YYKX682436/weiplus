package wo1;

/* loaded from: classes5.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f447883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f447884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f447885f;

    public a0(wo1.a1 a1Var, com.tencent.wechat.aff.affroam.g gVar, po1.d dVar) {
        this.f447883d = a1Var;
        this.f447884e = gVar;
        this.f447885f = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onAutoBackupConsecutiveFail$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f447883d.a(this.f447884e, this.f447885f, true);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onAutoBackupConsecutiveFail$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
