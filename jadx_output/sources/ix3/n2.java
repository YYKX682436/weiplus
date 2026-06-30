package ix3;

/* loaded from: classes8.dex */
public final class n2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.q2 f295503d;

    public n2(ix3.q2 q2Var) {
        this.f295503d = q2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/uic/RepairerHonorRiskDebugUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        v75.c cVar = v75.c.f433953a;
        java.lang.Class cls = (java.lang.Class) ((jz5.n) v75.c.f433954b).getValue();
        if (cls != null) {
            try {
                java.lang.Object invoke = cls.getMethod("getDeviceHealthDetectApiTag", new java.lang.Class[0]).invoke(((jz5.n) v75.c.f433955c).getValue(), new java.lang.Object[0]);
                kotlin.jvm.internal.o.e(invoke, "null cannot be cast to non-null type kotlin.Int");
                i17 = ((java.lang.Integer) invoke).intValue();
                com.tencent.mars.xlog.Log.i("MicroMsg.Honor..DeviceHealthDetect", "device health api tag is::" + i17);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Honor..DeviceHealthDetect", th6, "old version of touch detect api ", new java.lang.Object[0]);
                i17 = -2;
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.Honor..DeviceHealthDetect", "This device does not support DeviceHealthDetect");
            i17 = -1;
        }
        androidx.appcompat.app.AppCompatActivity activity = this.f295503d.getActivity();
        int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
        e4Var.f211776c = java.lang.String.valueOf(i17);
        e4Var.c();
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerHonorRiskDebugUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
