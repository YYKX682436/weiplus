package rk4;

/* loaded from: classes14.dex */
public final class t5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.TingPlayerHalfProfileDialogFragment f396980d;

    public t5(com.tencent.mm.plugin.ting.TingPlayerHalfProfileDialogFragment tingPlayerHalfProfileDialogFragment) {
        this.f396980d = tingPlayerHalfProfileDialogFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f396980d.dismissAllowingStateLoss();
    }
}
