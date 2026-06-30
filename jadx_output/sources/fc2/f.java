package fc2;

/* loaded from: classes2.dex */
public final class f extends androidx.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fc2.o f260943a;

    public f(fc2.o oVar) {
        this.f260943a = oVar;
    }

    @Override // androidx.recyclerview.widget.h2
    public void b() {
        fc2.o oVar = this.f260943a;
        fc2.o.b(oVar);
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedFlowEventSubscriber", "onChanged");
        oVar.f260972q.removeMessages(0);
        oVar.f260972q.sendEmptyMessageDelayed(0, oVar.f260969n);
    }

    @Override // androidx.recyclerview.widget.h2
    public void c(int i17, int i18) {
        fc2.o oVar = this.f260943a;
        fc2.o.b(oVar);
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedFlowEventSubscriber", "onItemRangeChanged " + i17 + ' ' + i18);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128009wf).getValue()).r()).booleanValue()) {
            oVar.f260972q.removeMessages(1);
        } else {
            oVar.f260972q.removeMessages(0);
        }
        oVar.f260972q.sendEmptyMessageDelayed(1, oVar.f260969n);
    }

    @Override // androidx.recyclerview.widget.h2
    public void e(int i17, int i18) {
        fc2.o oVar = this.f260943a;
        fc2.o.b(oVar);
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedFlowEventSubscriber", "onItemRangeInserted " + i17 + ' ' + i18);
        oVar.f260972q.removeMessages(0);
        oVar.f260972q.sendEmptyMessageDelayed(0, oVar.f260969n);
    }

    @Override // androidx.recyclerview.widget.h2
    public void f(int i17, int i18, int i19) {
        fc2.o oVar = this.f260943a;
        fc2.o.b(oVar);
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedFlowEventSubscriber", "onItemRangeMoved " + i17 + ' ' + i18 + ' ' + i19);
        oVar.f260972q.removeMessages(0);
        oVar.f260972q.sendEmptyMessageDelayed(0, oVar.f260969n);
    }

    @Override // androidx.recyclerview.widget.h2
    public void g(int i17, int i18) {
        fc2.o oVar = this.f260943a;
        fc2.o.b(oVar);
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedFlowEventSubscriber", "onItemRangeRemoved " + i17 + ' ' + i18);
        oVar.f260972q.removeMessages(0);
        oVar.f260972q.sendEmptyMessageDelayed(0, oVar.f260969n);
    }
}
