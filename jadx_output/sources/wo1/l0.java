package wo1;

/* loaded from: classes5.dex */
public final class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f447982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f447983e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f447984f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qo1.j0 f447985g;

    public l0(wo1.a1 a1Var, com.tencent.wechat.aff.affroam.g gVar, po1.d dVar, qo1.j0 j0Var) {
        this.f447982d = a1Var;
        this.f447983e = gVar;
        this.f447984f = dVar;
        this.f447985g = j0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onExtState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f447982d.a(this.f447983e, this.f447984f, !(this.f447985g instanceof qo1.c1));
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onExtState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
