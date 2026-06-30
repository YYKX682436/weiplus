package wo1;

/* loaded from: classes5.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f447958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f447959e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f447960f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f447961g;

    public j0(wo1.a1 a1Var, com.tencent.wechat.aff.affroam.g gVar, po1.d dVar, qo1.f0 f0Var) {
        this.f447958d = a1Var;
        this.f447959e = gVar;
        this.f447960f = dVar;
        this.f447961g = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onDiskFullError$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f447958d.a(this.f447959e, this.f447960f, !(this.f447961g instanceof qo1.c1));
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onDiskFullError$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
