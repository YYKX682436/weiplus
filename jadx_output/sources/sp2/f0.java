package sp2;

/* loaded from: classes2.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411025d;

    public f0(sp2.o2 o2Var) {
        this.f411025d = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = this.f411025d.f411155r;
        if (wxRefreshLayout != null) {
            wxRefreshLayout.c();
        } else {
            kotlin.jvm.internal.o.o("refreshLayout");
            throw null;
        }
    }
}
