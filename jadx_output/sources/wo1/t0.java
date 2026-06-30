package wo1;

/* loaded from: classes5.dex */
public final class t0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f448028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f448029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f448030f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ po1.d f448031g;

    public t0(wo1.a1 a1Var, com.tencent.wechat.aff.affroam.g gVar, qo1.f0 f0Var, po1.d dVar) {
        this.f448028d = a1Var;
        this.f448029e = gVar;
        this.f448030f = f0Var;
        this.f448031g = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onRestError$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f448028d.p(this.f448029e, this.f448030f, this.f448031g);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onRestError$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
