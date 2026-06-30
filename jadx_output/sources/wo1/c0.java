package wo1;

/* loaded from: classes5.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f447910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f447911e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qo1.j0 f447912f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ po1.d f447913g;

    public c0(wo1.a1 a1Var, com.tencent.wechat.aff.affroam.g gVar, qo1.j0 j0Var, po1.d dVar) {
        this.f447910d = a1Var;
        this.f447911e = gVar;
        this.f447912f = j0Var;
        this.f447913g = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onDeletingState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qo1.j0 j0Var = this.f447912f;
        kotlin.jvm.internal.o.e(j0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.backup.roambackup.task.BaseRoamTask");
        po1.d dVar = this.f447913g;
        this.f447910d.p(this.f447911e, (qo1.f0) j0Var, dVar);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onDeletingState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
