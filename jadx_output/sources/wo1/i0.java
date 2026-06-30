package wo1;

/* loaded from: classes5.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f447948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f447949e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f447950f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ po1.d f447951g;

    public i0(wo1.a1 a1Var, com.tencent.wechat.aff.affroam.g gVar, qo1.f0 f0Var, po1.d dVar) {
        this.f447948d = a1Var;
        this.f447949e = gVar;
        this.f447950f = f0Var;
        this.f447951g = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onDisconnectedError$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f447948d.p(this.f447949e, this.f447950f, this.f447951g);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onDisconnectedError$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
