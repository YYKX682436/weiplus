package wo1;

/* loaded from: classes5.dex */
public final class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f448013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f448014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f448015f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ po1.d f448016g;

    public q0(wo1.a1 a1Var, com.tencent.wechat.aff.affroam.g gVar, qo1.f0 f0Var, po1.d dVar) {
        this.f448013d = a1Var;
        this.f448014e = gVar;
        this.f448015f = f0Var;
        this.f448016g = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onLockFailedError$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f448013d.p(this.f448014e, this.f448015f, this.f448016g);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onLockFailedError$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
