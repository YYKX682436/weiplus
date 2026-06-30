package wo1;

/* loaded from: classes5.dex */
public final class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f448037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f448038e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qo1.j0 f448039f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ po1.d f448040g;

    public v0(wo1.a1 a1Var, com.tencent.wechat.aff.affroam.g gVar, qo1.j0 j0Var, po1.d dVar) {
        this.f448037d = a1Var;
        this.f448038e = gVar;
        this.f448039f = j0Var;
        this.f448040g = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onRunningState$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f448037d.p(this.f448038e, (qo1.f0) this.f448039f, this.f448040g);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onRunningState$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
