package wo1;

/* loaded from: classes5.dex */
public final class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f448017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f448018e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qo1.j0 f448019f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ po1.d f448020g;

    public r0(wo1.a1 a1Var, com.tencent.wechat.aff.affroam.g gVar, qo1.j0 j0Var, po1.d dVar) {
        this.f448017d = a1Var;
        this.f448018e = gVar;
        this.f448019f = j0Var;
        this.f448020g = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onPreparingState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qo1.j0 j0Var = this.f448019f;
        kotlin.jvm.internal.o.e(j0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.backup.roambackup.task.BaseRoamTask");
        po1.d dVar = this.f448020g;
        this.f448017d.p(this.f448018e, (qo1.f0) j0Var, dVar);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onPreparingState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
