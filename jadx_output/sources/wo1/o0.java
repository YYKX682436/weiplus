package wo1;

/* loaded from: classes5.dex */
public final class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f447998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.j0 f447999e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f448000f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f448001g;

    public o0(com.tencent.wechat.aff.affroam.g gVar, qo1.j0 j0Var, po1.d dVar, wo1.a1 a1Var) {
        this.f447998d = gVar;
        this.f447999e = j0Var;
        this.f448000f = dVar;
        this.f448001g = a1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onInitialState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.backup.roambackup.a2.a(com.tencent.mm.plugin.backup.roambackup.a2.f92567a, com.tencent.mm.plugin.backup.roambackup.y1.F, this.f447998d, this.f447999e, this.f448000f, null, null, 48, null);
        this.f448001g.a(this.f447998d, this.f448000f, !(this.f447999e instanceof qo1.c1));
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onInitialState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
