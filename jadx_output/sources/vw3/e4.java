package vw3;

/* loaded from: classes9.dex */
public final class e4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final vw3.e4 f440940d = new vw3.e4();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerPayDebugUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((com.tencent.mm.feature.wxpay.j) ((mh0.m) i95.n0.c(mh0.m.class))).getClass();
        ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.tencent.mm.storage.u3.USERINFO_WALLET_REMITTANCE_FIRST_RELIEF_DIALOG_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerPayDebugUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
