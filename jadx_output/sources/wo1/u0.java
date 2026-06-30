package wo1;

/* loaded from: classes5.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f448034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.j0 f448035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f448036f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(wo1.a1 a1Var, qo1.j0 j0Var, po1.d dVar) {
        super(0);
        this.f448034d = a1Var;
        this.f448035e = j0Var;
        this.f448036f = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f448034d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        qo1.f0 task = (qo1.f0) this.f448035e;
        kotlin.jvm.internal.o.g(task, "task");
        po1.d device = this.f448036f;
        kotlin.jvm.internal.o.g(device, "device");
        com.tencent.mars.xlog.Log.i("BackupUIUtils", "show bottom sheet switch to usb, pkgId=" + task.f365483i + ", isRestore=" + (task instanceof qo1.c1));
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(context);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488712dq3, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.s8y)).setText(context.getString(com.tencent.mm.R.string.mfs));
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.cyy);
        imageView.setImageResource(com.tencent.mm.R.drawable.bu9);
        imageView.setOnClickListener(new uo1.j(y1Var));
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.riz);
        button.setOnClickListener(new uo1.l(device, y1Var));
        com.tencent.mm.plugin.backup.roambackup.MmAoaManager mmAoaManager = com.tencent.mm.plugin.backup.roambackup.MmAoaManager.f92553a;
        jz5.l a17 = mmAoaManager.a();
        button.setEnabled(a17.f302833d != null && ((java.lang.Boolean) a17.f302834e).booleanValue());
        uo1.o oVar = new uo1.o(button);
        y1Var.f212037s = new uo1.m(oVar);
        mmAoaManager.d(oVar);
        y1Var.k(inflate);
        y1Var.s();
        return jz5.f0.f302826a;
    }
}
