package or1;

/* loaded from: classes9.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ or1.s1 f347555d;

    public q1(or1.s1 s1Var) {
        this.f347555d = s1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        or1.s1 s1Var = this.f347555d;
        android.widget.TextView textView = (android.widget.TextView) s1Var.f347573f.findViewById(com.tencent.mm.R.id.f484234dh3);
        if (s1Var.f347573f.f94030e != null && textView != null) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(s1Var.f347573f.f94031f, true);
            if (n17 == null || !n17.r2()) {
                s1Var.f347573f.f94030e.setVisibility(8);
                textView.setVisibility(0);
            } else if (s1Var.f347573f.f94029d.getCount() <= 0) {
                s1Var.f347573f.f94030e.setVisibility(8);
                textView.setVisibility(0);
            } else {
                s1Var.f347573f.f94030e.setVisibility(0);
                textView.setVisibility(8);
                com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI enterpriseBizEntranceListUI = s1Var.f347573f;
                enterpriseBizEntranceListUI.f94030e.setAdapter((android.widget.ListAdapter) enterpriseBizEntranceListUI.f94029d);
                com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI enterpriseBizEntranceListUI2 = s1Var.f347573f;
                enterpriseBizEntranceListUI2.f94030e.setOnItemClickListener(enterpriseBizEntranceListUI2.f94032g);
            }
        }
        s1Var.notifyDataSetChanged();
    }
}
