package qz2;

/* loaded from: classes3.dex */
public class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fingerprint.ui.SoterPayTestUI f367869d;

    public h0(com.tencent.mm.plugin.fingerprint.ui.SoterPayTestUI soterPayTestUI) {
        this.f367869d = soterPayTestUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fingerprint/ui/SoterPayTestUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterPayTestUI", "hy: start get challenge");
        gm0.j1.i();
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.media.r6.CTRL_INDEX, this.f367869d);
        gm0.j1.i();
        com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
        ((d50.i) ((d50.k) i95.n0.c(d50.k.class))).getClass();
        r1Var.g(new oz2.a(0));
        yj0.a.h(this, "com/tencent/mm/plugin/fingerprint/ui/SoterPayTestUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
