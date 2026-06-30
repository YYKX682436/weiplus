package ni3;

/* loaded from: classes3.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f337645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.monitor.FinderStreamMonitorView f337646e;

    public o(android.view.View view, com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView) {
        this.f337645d = view;
        this.f337646e = finderStreamMonitorView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float translateOffset;
        translateOffset = this.f337646e.getTranslateOffset();
        this.f337645d.setTranslationX(-translateOffset);
    }
}
