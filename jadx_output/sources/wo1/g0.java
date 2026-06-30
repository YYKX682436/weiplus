package wo1;

/* loaded from: classes5.dex */
public final class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f447936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f447937e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f447938f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ po1.d f447939g;

    public g0(wo1.a1 a1Var, com.tencent.wechat.aff.affroam.g gVar, qo1.f0 f0Var, po1.d dVar) {
        this.f447936d = a1Var;
        this.f447937e = gVar;
        this.f447938f = f0Var;
        this.f447939g = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onDisconnectedError$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f447936d.p(this.f447937e, this.f447938f, this.f447939g);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onDisconnectedError$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
