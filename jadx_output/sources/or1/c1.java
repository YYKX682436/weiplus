package or1;

/* loaded from: classes9.dex */
public class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ or1.f1 f347469d;

    public c1(or1.f1 f1Var) {
        this.f347469d = f1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        or1.f1 f1Var = this.f347469d;
        f1Var.q();
        android.widget.TextView textView = (android.widget.TextView) f1Var.f347492q.findViewById(com.tencent.mm.R.id.f484234dh3);
        if (f1Var.f347492q.f94023e != null && textView != null) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(f1Var.f347492q.f94025g, true);
            if (n17 == null || !n17.r2()) {
                f1Var.f347492q.f94023e.setVisibility(8);
                textView.setVisibility(0);
            } else if (f1Var.f347492q.f94022d.getCount() <= 0) {
                f1Var.f347492q.f94023e.setVisibility(8);
                textView.setVisibility(0);
            } else {
                f1Var.f347492q.f94023e.setVisibility(0);
                textView.setVisibility(8);
                com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI enterpriseBizContactPlainListUI = f1Var.f347492q;
                enterpriseBizContactPlainListUI.f94023e.setAdapter((android.widget.ListAdapter) enterpriseBizContactPlainListUI.f94022d);
                com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI enterpriseBizContactPlainListUI2 = f1Var.f347492q;
                enterpriseBizContactPlainListUI2.f94023e.setOnItemClickListener(enterpriseBizContactPlainListUI2.f94027i);
            }
        }
        f1Var.notifyDataSetChanged();
    }
}
