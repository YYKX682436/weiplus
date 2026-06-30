package zo1;

/* loaded from: classes5.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI f474568d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI) {
        super(1);
        this.f474568d = createPackageUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List devices = (java.util.List) obj;
        kotlin.jvm.internal.o.g(devices, "devices");
        boolean isEmpty = devices.isEmpty();
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI = this.f474568d;
        if (isEmpty) {
            ((com.tencent.mm.ui.bd) createPackageUI.startActivityForResult(new android.content.Intent(createPackageUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.device.AddNewDeviceListUI.class))).f197877a = new zo1.b1(createPackageUI);
        } else {
            java.util.Iterator it = devices.iterator();
            while (it.hasNext()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", ((po1.d) it.next()).toString());
            }
            java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI.f92814u;
            createPackageUI.getClass();
            android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
            double d17 = b17.y;
            int i17 = (int) (0.45d * d17);
            int i18 = (int) (d17 * 0.75d);
            com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(createPackageUI.getContext());
            y1Var.B.setBackgroundResource(com.tencent.mm.R.drawable.cw_);
            createPackageUI.f92828t = y1Var;
            android.view.View inflate = android.view.LayoutInflater.from(createPackageUI.getContext()).inflate(com.tencent.mm.R.layout.dwf, (android.view.ViewGroup) null, false);
            com.tencent.mm.plugin.backup.roambackup.ui.component.DialogActionBar dialogActionBar = (com.tencent.mm.plugin.backup.roambackup.ui.component.DialogActionBar) inflate.findViewById(com.tencent.mm.R.id.rie);
            dialogActionBar.setTitle(com.tencent.mm.R.string.f492851mx0);
            dialogActionBar.setCancelClose(new zo1.y1(y1Var));
            android.widget.ListView listView = (android.widget.ListView) inflate.findViewById(com.tencent.mm.R.id.f486811s53);
            zo1.y0 y0Var = new zo1.y0(createPackageUI, createPackageUI.f92827s);
            listView.setAdapter((android.widget.ListAdapter) y0Var);
            y0Var.f474827e = devices;
            y0Var.notifyDataSetChanged();
            y0Var.notifyDataSetChanged();
            y0Var.f474829g = new zo1.z1(createPackageUI, y1Var);
            y0Var.f474828f = new zo1.b2(createPackageUI, y1Var);
            inflate.measure(android.view.View.MeasureSpec.makeMeasureSpec(b17.x, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(i18, Integer.MIN_VALUE));
            int measuredHeight = inflate.getMeasuredHeight();
            if (i17 >= measuredHeight) {
                measuredHeight = i17;
            }
            y1Var.f212027f.getLayoutParams().height = measuredHeight;
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = y1Var.f212036r;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.C(measuredHeight);
                bottomSheetBehavior.D(4);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", "measuredHeight=" + inflate.getMeasuredHeight() + ", minHeight=" + i17 + ", maxHeight=" + i18 + ", realHeight=" + measuredHeight);
            y1Var.k(inflate);
            y1Var.s();
        }
        return jz5.f0.f302826a;
    }
}
