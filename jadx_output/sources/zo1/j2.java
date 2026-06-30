package zo1;

/* loaded from: classes5.dex */
public final class j2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f474655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageDeleteConfirmUI f474656e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f474657f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(int i17, com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageDeleteConfirmUI packageDeleteConfirmUI, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        super(1);
        this.f474655d = i17;
        this.f474656e = packageDeleteConfirmUI;
        this.f474657f = y1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageDeleteConfirmUI packageDeleteConfirmUI = this.f474656e;
        int i17 = packageDeleteConfirmUI.f92836n;
        int i18 = this.f474655d;
        if (i18 != i17) {
            com.tencent.mars.xlog.Log.w("PackageDeleteConfirmUI", "Task has cancelled, currentTaskId=" + i18 + ", globalTaskId=" + packageDeleteConfirmUI.f92836n);
        } else {
            this.f474657f.q();
            if (booleanValue) {
                com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageDeleteConfirmUI.T6(packageDeleteConfirmUI);
            } else {
                com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(packageDeleteConfirmUI);
                android.view.View inflate = android.view.LayoutInflater.from(packageDeleteConfirmUI.getContext()).inflate(com.tencent.mm.R.layout.f488713e45, (android.view.ViewGroup) null);
                po1.d dVar = packageDeleteConfirmUI.f92831f;
                if (dVar == null) {
                    kotlin.jvm.internal.o.o("deviceInfo");
                    throw null;
                }
                if (dVar.f357296b == po1.g.f357310h) {
                    ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.t3x)).setText(com.tencent.mm.R.string.of7);
                    android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.t3w);
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    po1.d dVar2 = packageDeleteConfirmUI.f92831f;
                    if (dVar2 == null) {
                        kotlin.jvm.internal.o.o("deviceInfo");
                        throw null;
                    }
                    objArr[0] = dVar2.b();
                    po1.d dVar3 = packageDeleteConfirmUI.f92831f;
                    if (dVar3 == null) {
                        kotlin.jvm.internal.o.o("deviceInfo");
                        throw null;
                    }
                    objArr[1] = dVar3.b();
                    textView.setText(packageDeleteConfirmUI.getString(com.tencent.mm.R.string.f492862of5, objArr));
                    textView.setTextColor(packageDeleteConfirmUI.getColor(com.tencent.mm.R.color.Red_100));
                } else {
                    android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.t3x);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    po1.d dVar4 = packageDeleteConfirmUI.f92831f;
                    if (dVar4 == null) {
                        kotlin.jvm.internal.o.o("deviceInfo");
                        throw null;
                    }
                    objArr2[0] = dVar4.b();
                    textView2.setText(packageDeleteConfirmUI.getString(com.tencent.mm.R.string.of6, objArr2));
                    ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.t3w)).setText(packageDeleteConfirmUI.getString(com.tencent.mm.R.string.f492861of4));
                }
                ((android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.t3u)).setOnClickListener(new zo1.k2(packageDeleteConfirmUI, y1Var));
                ((android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.t3v)).setOnClickListener(new zo1.l2(packageDeleteConfirmUI, y1Var));
                y1Var.k(inflate);
                y1Var.s();
            }
        }
        return jz5.f0.f302826a;
    }
}
