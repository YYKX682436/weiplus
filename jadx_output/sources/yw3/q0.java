package yw3;

/* loaded from: classes.dex */
public final class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerDBSelectDemoUI f466853d;

    public q0(com.tencent.mm.plugin.repairer.ui.demo.RepairerDBSelectDemoUI repairerDBSelectDemoUI) {
        this.f466853d = repairerDBSelectDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        byte[] bArr;
        java.lang.CharSequence text;
        java.lang.String obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerDBSelectDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.repairer.ui.demo.RepairerDBSelectDemoUI repairerDBSelectDemoUI = this.f466853d;
        repairerDBSelectDemoUI.getClass();
        java.lang.String str = "db_exec_info_" + k35.m1.d("yyyy-MM-dd_HH_mm_ss", java.lang.System.currentTimeMillis() / 1000) + ".json";
        xs.i1 i1Var = (xs.i1) i95.n0.c(xs.i1.class);
        android.widget.TextView textView = repairerDBSelectDemoUI.e;
        if (textView == null || (text = textView.getText()) == null || (obj = text.toString()) == null) {
            bArr = null;
        } else {
            bArr = obj.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bArr, "getBytes(...)");
        }
        ((zc0.h) i1Var).aj(str, bArr, true);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDBSelectDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
