package ro1;

/* loaded from: classes5.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f397995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f397996e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f397997f;

    public n(kotlin.jvm.internal.f0 f0Var, java.util.List list, java.util.List list2) {
        this.f397995d = f0Var;
        this.f397996e = list;
        this.f397997f = list2;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        android.content.Context n17 = com.tencent.mm.app.w.INSTANCE.n();
        if (n17 == null) {
            kotlin.jvm.internal.f0 f0Var = this.f397995d;
            int i17 = f0Var.f310116d;
            f0Var.f310116d = i17 + 1;
            if (i17 < 3) {
                ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
                t0Var.getClass();
                t0Var.z(this, 120L, false);
                return;
            }
        }
        if (n17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RoamBackup.UsbDevicesDiscover", "Try " + this.f397995d.f310116d + " count, but all failed.");
            return;
        }
        if (!(!this.f397996e.isEmpty())) {
            ro1.t tVar = ro1.t.f398008d;
            po1.d dVar = (po1.d) kz5.n0.i0(this.f397997f);
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.UsbDevicesDiscover", "showBindDeviceDialog, uuid=" + dVar.f357300f);
            com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(n17);
            android.view.View inflate = android.view.LayoutInflater.from(n17).inflate(com.tencent.mm.R.layout.f488715dq4, (android.view.ViewGroup) null);
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.rir)).setText(dVar.b());
            ((android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.rim)).setOnClickListener(new ro1.r(n17, y1Var, dVar));
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.riq)).setOnClickListener(new ro1.s(y1Var));
            y1Var.k(inflate);
            y1Var.s();
            return;
        }
        ro1.t tVar2 = ro1.t.f398008d;
        java.util.List list = this.f397996e;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.UsbDevicesDiscover", "showBoundDeviceDialog, device=" + ((po1.d) it.next()));
        }
        java.util.ArrayList h17 = com.tencent.mm.plugin.backup.roambackup.r0.f92684a.h(false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : h17) {
            com.tencent.wechat.aff.affroam.g gVar = (com.tencent.wechat.aff.affroam.g) obj;
            if (!list.isEmpty()) {
                java.util.Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    if (kotlin.jvm.internal.o.b(((po1.d) it6.next()).f357295a, gVar.f215832g.f215989e)) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (z17) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            java.lang.Object next = it7.next();
            com.tencent.wechat.aff.affroam.g gVar2 = (com.tencent.wechat.aff.affroam.g) next;
            kotlin.jvm.internal.o.g(gVar2, "<this>");
            if ((gVar2.f215835m & 1) != 0) {
                arrayList2.add(next);
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        po1.d dVar2 = (po1.d) list.get(0);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.UsbDevicesDiscover", "Using device=" + dVar2 + " show dialog, gotoCreate=" + isEmpty + '.');
        com.tencent.mm.ui.widget.dialog.y1 y1Var2 = new com.tencent.mm.ui.widget.dialog.y1(n17);
        android.view.View inflate2 = android.view.LayoutInflater.from(n17).inflate(com.tencent.mm.R.layout.f488716dq5, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.czu)).setText(n17.getString(com.tencent.mm.R.string.mfa, dVar2.b()));
        ((android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.rik)).setOnClickListener(new ro1.p(n17, y1Var2, dVar2, isEmpty));
        ((android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.riv)).setOnClickListener(new ro1.q(y1Var2));
        y1Var2.k(inflate2);
        y1Var2.s();
    }
}
