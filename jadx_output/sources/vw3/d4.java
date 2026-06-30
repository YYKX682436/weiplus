package vw3;

/* loaded from: classes9.dex */
public final class d4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final vw3.d4 f440927d = new vw3.d4();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerPayDebugUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((vc.s) ((wc.o) i95.n0.c(wc.o.class))).getClass();
        new com.tencent.kinda.framework.module.impl.KindaThirdPayService().startDcepPayImpl("1234", "dcep://uniwallet/unipay", com.tencent.kinda.gen.ITransmitKvData.create(), new vw3.c4());
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerPayDebugUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
