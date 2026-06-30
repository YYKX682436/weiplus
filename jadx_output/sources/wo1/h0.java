package wo1;

/* loaded from: classes5.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f447941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f447942e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f447943f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f447944g;

    public h0(wo1.a1 a1Var, com.tencent.wechat.aff.affroam.g gVar, po1.d dVar, qo1.f0 f0Var) {
        this.f447941d = a1Var;
        this.f447942e = gVar;
        this.f447943f = dVar;
        this.f447944g = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onDisconnectedError$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f447941d.a(this.f447942e, this.f447943f, !(this.f447944g instanceof qo1.c1));
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onDisconnectedError$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
