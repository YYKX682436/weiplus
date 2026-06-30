package ko3;

/* loaded from: classes11.dex */
public class m0 implements android.hardware.display.DisplayManager.DisplayListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ko3.l0 f309989d;

    public m0(ko3.l0 l0Var) {
        this.f309989d = l0Var;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayAdded(int i17) {
        ko3.l0 l0Var = this.f309989d;
        try {
            android.view.Display display = l0Var.f309986e.getDisplay(i17);
            java.lang.String str = "";
            java.lang.String name = display != null ? display.getName() : "";
            if (android.text.TextUtils.isEmpty(name)) {
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            if (display != null) {
                try {
                    java.lang.String str2 = (java.lang.String) display.getClass().getMethod("getOwnerPackageName", new java.lang.Class[0]).invoke(display, new java.lang.Object[0]);
                    if (str2 != null) {
                        str = str2;
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SRD", th6, "[getDisplayOwnerPackage] error", new java.lang.Object[0]);
                }
            }
            r45.lw4 lw4Var = new r45.lw4();
            lw4Var.f379885d = i17;
            lw4Var.f379886e = name;
            lw4Var.f379887f = currentTimeMillis;
            lw4Var.f379888g = str;
            l0Var.f309985d.put(java.lang.Integer.valueOf(i17), lw4Var);
            l0Var.i();
            com.tencent.mm.autogen.events.ReportScreenRecordInfoEvent reportScreenRecordInfoEvent = new com.tencent.mm.autogen.events.ReportScreenRecordInfoEvent();
            am.dr drVar = reportScreenRecordInfoEvent.f54688g;
            drVar.f6491a = i17;
            drVar.f6493c = name;
            drVar.f6494d = currentTimeMillis;
            drVar.f6492b = str;
            drVar.f6495e = 1;
            reportScreenRecordInfoEvent.e();
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SRD", th7.toString());
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayChanged(int i17) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayRemoved(int i17) {
        ko3.l0 l0Var = this.f309989d;
        if (l0Var.f309985d.containsKey(java.lang.Integer.valueOf(i17))) {
            l0Var.f309985d.remove(java.lang.Integer.valueOf(i17));
            l0Var.i();
            com.tencent.mm.autogen.events.ReportScreenRecordInfoEvent reportScreenRecordInfoEvent = new com.tencent.mm.autogen.events.ReportScreenRecordInfoEvent();
            am.dr drVar = reportScreenRecordInfoEvent.f54688g;
            drVar.f6491a = i17;
            drVar.f6493c = "";
            drVar.f6494d = java.lang.System.currentTimeMillis() / 1000;
            drVar.f6495e = 2;
            reportScreenRecordInfoEvent.e();
        }
    }
}
