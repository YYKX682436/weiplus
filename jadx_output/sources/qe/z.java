package qe;

/* loaded from: classes7.dex */
public class z implements com.tencent.mm.game.liblockstep.LockStepNative.ILockStepListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f362008a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qe.f0 f362009b;

    public z(qe.f0 f0Var, java.lang.ref.WeakReference weakReference) {
        this.f362009b = f0Var;
        this.f362008a = weakReference;
    }

    @Override // com.tencent.mm.game.liblockstep.LockStepNative.ILockStepListener
    public void onCallBack(long j17, java.lang.String str) {
        ((com.tencent.mm.plugin.appbrand.jsruntime.f0) this.f362008a.get()).post(new qe.y(this, str, j17));
    }
}
