package wo1;

/* loaded from: classes5.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f447921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f447922e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f447923f;

    public e0(wo1.a1 a1Var, qo1.f0 f0Var, po1.d dVar) {
        this.f447921d = a1Var;
        this.f447922e = f0Var;
        this.f447923f = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onDisconnectedError$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long j17 = this.f447922e.f365483i;
        wo1.a1 a1Var = this.f447921d;
        a1Var.getClass();
        po1.d device = this.f447923f;
        kotlin.jvm.internal.o.g(device, "device");
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseTaskStatusView", "try to regenerate device path, device=" + device);
        android.content.Intent d17 = to1.g.f420911a.d(po1.d.a(device, null, null, null, null, "/", null, null, 111, null));
        android.content.Context context = a1Var.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        ((com.tencent.mm.ui.bd) ((com.tencent.mm.ui.MMFragmentActivity) context).startActivityForResult(d17)).f197877a = new wo1.y0(device, a1Var, j17);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onDisconnectedError$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
