package wo1;

/* loaded from: classes5.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f448006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f448007e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f448008f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f448009g;

    public p0(wo1.a1 a1Var, com.tencent.wechat.aff.affroam.g gVar, po1.d dVar, qo1.f0 f0Var) {
        this.f448006d = a1Var;
        this.f448007e = gVar;
        this.f448008f = dVar;
        this.f448009g = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onLockFailedError$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f448006d.a(this.f448007e, this.f448008f, !(this.f448009g instanceof qo1.c1));
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onLockFailedError$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
