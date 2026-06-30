package sj3;

/* loaded from: classes14.dex */
public class x4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.a5 f408806d;

    public x4(sj3.a5 a5Var) {
        this.f408806d = a5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        sj3.a5 a5Var = this.f408806d;
        com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = a5Var.f408417d;
        if (multiTalkMainUI == null || multiTalkMainUI.isFinishing()) {
            return;
        }
        if (a5Var.f408417d.findViewById(com.tencent.mm.R.id.k6o) != null) {
            a5Var.f408417d.findViewById(com.tencent.mm.R.id.k6o).setOnClickListener(null);
        }
        com.tencent.mm.plugin.multitalk.ui.widget.CollapseView collapseView = a5Var.H;
        if (collapseView != null) {
            collapseView.setLinkToAutoMobileListener(null);
        }
        a5Var.getClass();
        a5Var.f408425o.setVisibility(8);
        a5Var.f408426p.setVisibility(8);
    }
}
