package cq4;

/* loaded from: classes10.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView f221483d;

    public q(com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView vLogThumbView) {
        this.f221483d = vLogThumbView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kp4.r rVar = this.f221483d.f176136g;
        rVar.notifyItemRangeChanged(0, rVar.getItemCount());
    }
}
