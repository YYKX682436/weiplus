package cw1;

/* loaded from: classes12.dex */
public final class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wcdb.support.CancellationSignal f223076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI f223077e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f223078f;

    public k1(com.tencent.wcdb.support.CancellationSignal cancellationSignal, com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI cleanCacheNewUI, android.view.View view) {
        this.f223076d = cancellationSignal;
        this.f223077e = cleanCacheNewUI;
        this.f223078f = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aw1.n b17 = aw1.v.b(this.f223076d);
        if (this.f223076d.isCanceled()) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new cw1.j1(this.f223077e, b17, this.f223078f));
    }
}
