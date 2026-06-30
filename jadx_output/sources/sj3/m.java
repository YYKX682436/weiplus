package sj3;

/* loaded from: classes14.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.n f408627d;

    public m(sj3.n nVar) {
        this.f408627d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        sj3.n nVar = this.f408627d;
        nVar.f408644d.f150310f.setTag(java.lang.Boolean.TRUE);
        nVar.f408644d.f150320s.setTag(java.lang.Boolean.FALSE);
        com.tencent.mm.plugin.multitalk.ui.widget.CollapseView collapseView = nVar.f408644d;
        collapseView.a(collapseView.f150313i);
        nVar.f408644d.f150311g.setAlpha(0.0f);
        nVar.f408644d.f150311g.animate().alpha(1.0f).setDuration(nVar.f408644d.f150309e).start();
        nVar.f408644d.f();
        if (nVar.f408644d.f150319r == null || com.tencent.mm.plugin.multitalk.model.e3.Ri().f150179v) {
            return;
        }
        com.tencent.mm.plugin.multitalk.model.u0.g(1, nVar.f408644d.f150319r, 2);
        com.tencent.mm.plugin.multitalk.model.e3.Ri().f150179v = true;
    }
}
