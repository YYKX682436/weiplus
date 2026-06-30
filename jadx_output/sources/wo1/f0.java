package wo1;

/* loaded from: classes5.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f447931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f447932e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f447933f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ po1.d f447934g;

    public f0(wo1.a1 a1Var, com.tencent.wechat.aff.affroam.g gVar, qo1.f0 f0Var, po1.d dVar) {
        this.f447931d = a1Var;
        this.f447932e = gVar;
        this.f447933f = f0Var;
        this.f447934g = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onDisconnectedError$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f447931d.p(this.f447932e, this.f447933f, this.f447934g);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onDisconnectedError$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
